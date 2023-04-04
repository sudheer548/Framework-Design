package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		File file = new File("./Configuration/config.properties");
		try {
			FileInputStream fis =new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getUsername() {
		String username = pro.getProperty("userName");
		return username;
	}
}
