package com.sendProEnterprise.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverManager {

	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {

		return dr.get();

	}
	
	/**
	 * This method is used to initialize the threadlocal driver on the basis of given
	 * browser
	 * 
	 * @param browser
	 * @return this will return dr.
	 */
//	public WebDriver init_driver(String browser) {
//
//		System.out.println("browser value is: " + browser);
//
//		if (browser.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			dr.set(new ChromeDriver());
//		} else if (browser.equals("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			dr.set(new FirefoxDriver());
//		} else if (browser.equals("safari")) {
//			dr.set(new SafariDriver());
//		} else {
//			System.out.println("Please pass the correct browser value: " + browser);
//		}
//
//		getDriver().manage().deleteAllCookies();
//		getDriver().manage().window().maximize();
//		return getDriver();
//
//	}
	
	public WebDriver init_driver(String browser) {

		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					Constants.getChromeDriverExePath());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--start-fullscreen");
			dr.set(new ChromeDriver(options));
		} else if (browser.equals("firefox")) {
			System.out.println("Launching : " + browser);
			System.setProperty("webdriver.gecko.driver",
					Constants.getGeckoDriverExePath());
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--start-fullscreen");
			dr.set(new FirefoxDriver(options));
		} else if (browser.equals("safari")) {
			dr.set(new SafariDriver());
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

	}

	


}
