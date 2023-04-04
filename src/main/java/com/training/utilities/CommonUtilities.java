 package com.training.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities {
	
public String getpropertyH(String key) throws IOException {
	String spath ="C:\\Users\\harsh\\eclipse-workspace\\CucumberFramework\\PropertiesH\\Application.properties";
	FileInputStream fileinput = new FileInputStream(spath);
	Properties prop = new Properties();
	prop.load(fileinput);
	
	String value=prop.getProperty(key);
	return value;
}
}
