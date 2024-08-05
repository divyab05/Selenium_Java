package com.sendProEnterprise.steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.sendProEnterprise.utils.DriverManager;



public class Hooks extends BaseSteps{	
	
	private DriverManager driverFactory;
	private WebDriver driver;
	Properties prop;
	
	@Before(order = 0)
	public void setupFramework() {
		
		configureLogging();
		prop=setupConfigFile();
		
	}
	
	@Before(order = 1)
	public void beforeScenario(Scenario scenario) {
		
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverManager();
		driver = driverFactory.init_driver(browserName);
		
	}
	

	@After(order = 0)
	public void quitBrowser() {
		
		driver.quit();
		
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}
	
	
}
