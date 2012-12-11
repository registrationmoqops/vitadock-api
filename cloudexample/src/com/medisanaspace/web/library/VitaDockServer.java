package com.medisanaspace.web.library;

/**
 * Placeholder of main Server URLs.
 * 
 * @author Clemens Lode (c) Medisana Space Technologies GmbH, 2012
 *         clemens.lode@medisanaspace.com
 * 
 */
public final class VitaDockServer {
	private VitaDockServer() {
	}

	/*
	 * Please note that you also have to change the application token in
	 * CloudClient.java if you switch the server.
	 */

	public static final String EXTERNAL_AUTH_URL = "localhost/auth";// "vitacloud.medisanaspace.com/auth";//"cloud.vitadock.com/auth";
	public static final String EXTERNAL_LOGIN_URL = "localhost";// "vitacloud.medisanaspace.com";//"cloud.vitadock.com";
	public static final String EXTERNAL_DATA_URL = "localhost/data";// "vitacloud.medisanaspace.com/data";//"cloud.vitadock.com/data";

	public static final String HTTPS_AUTH_URL = "http://" + EXTERNAL_AUTH_URL;
	public static final String HTTPS_LOGIN_URL = "http://" + EXTERNAL_LOGIN_URL;
	public static final String HTTPS_DATA_URL = "http://" + EXTERNAL_DATA_URL;
}
