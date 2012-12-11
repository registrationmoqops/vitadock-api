package com.medisanaspace.model;

import com.medisanaspace.library.RandomHelper;
import com.medisanaspace.model.base.Versionable;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Glucodockinsulin extends Versionable {

	public static final int MIN_INSULIN = 30;

	public static final int MAX_INSULIN = 80;

	public static final int MIN_INSULIN_TYPE_INDEX = 0;

	public static final int MAX_INSULIN_TYPE_INDEX = 2;

	public static final int MAX_INSULIN_TYPE_NAME_LENGTH = 512;

	private Float insulin;
	private Integer insulinTypeIndex;
	private String insulinTypeName;
	private String moduleSerialId;
	private String insulinTypeName2;
	private String insulinTypeName3;

	public static com.medisanaspace.model.Glucodockinsulin generateRandomEntry() {
		Glucodockinsulin glucodockinsulin = new Glucodockinsulin();
		glucodockinsulin.setInsulin(RandomHelper.generateFloat(MIN_INSULIN,
				MAX_INSULIN));
		glucodockinsulin.setInsulinTypeIndex(RandomHelper.generateInt(
				MIN_INSULIN_TYPE_INDEX, MAX_INSULIN_TYPE_INDEX));
		glucodockinsulin.setInsulinTypeName("[Autogenerated item]");
		glucodockinsulin.setModuleSerialId("[Autogenerated item]");
		return glucodockinsulin;
	}

	public String toJson() {
		return new JSONSerializer().exclude("*.class").serialize(this);
	}

	public static Glucodockinsulin fromJsonToGlucodockinsulin(String json) {
		return new JSONDeserializer<Glucodockinsulin>().use(null,
				Glucodockinsulin.class).deserialize(json);
	}

	public static String toJsonArray(Collection<Glucodockinsulin> collection) {
		return new JSONSerializer().exclude("*.class").exclude("active")
				.exclude("updatedDate").exclude("version")
				.serialize(collection);
	}

	public static Collection<Glucodockinsulin> fromJsonArrayToGlucodockinsulins(
			String json) {
		return new JSONDeserializer<List<Glucodockinsulin>>()
				.use(null, ArrayList.class)
				.use("values", Glucodockinsulin.class).deserialize(json);
	}

	public String getModuleSerialId() {
		return this.moduleSerialId;
	}

	public void setModuleSerialId(String moduleSerialId) {
		this.moduleSerialId = moduleSerialId;
	}

	public String getInsulinTypeName2() {
		return this.insulinTypeName2;
	}

	public void setInsulinTypeName2(String insulinTypeName2) {
		this.insulinTypeName2 = insulinTypeName2;
	}

	public String getInsulinTypeName3() {
		return this.insulinTypeName3;
	}

	public void setInsulinTypeName3(String insulinTypeName3) {
		this.insulinTypeName3 = insulinTypeName3;
	}

	public Float getInsulin() {
		return this.insulin;
	}

	public void setInsulin(Float insulin) {
		this.insulin = insulin;
	}

	public Integer getInsulinTypeIndex() {
		return this.insulinTypeIndex;
	}

	public void setInsulinTypeIndex(Integer insulinTypeIndex) {
		this.insulinTypeIndex = insulinTypeIndex;
	}

	public String getInsulinTypeName() {
		return this.insulinTypeName;
	}

	public void setInsulinTypeName(String insulinTypeName) {
		this.insulinTypeName = insulinTypeName;
	}
}
