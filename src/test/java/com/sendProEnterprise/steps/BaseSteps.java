package com.sendProEnterprise.steps;
import java.util.Properties;
import com.sendProEnterprise.utils.ConfigReader;
import com.sendProEnterprise.utils.Constants;
public class BaseSteps {
		
	
	
	public ConfigReader configReader;
	Properties prop;

	
	public void configureLogging() {

		
		Constants.setChromeDriverExePath(
				System.getProperty("user.dir") + "//src//test//resources//executables//chromedriver.exe");
		Constants.setGeckoDriverExePath(
				System.getProperty("user.dir") + "//src//test//resources//executables//geckodriver.exe");
	}
	
	
	public Properties setupConfigFile()
	{
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		return prop;
	}

		
		
}

	

