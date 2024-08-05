package com.sendProEnterprise.pages;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sendProEnterprise.utils.DriverManager;

public abstract class BasePage<T> {


	protected WebDriver driver;
	static String pageLoadStatus=null;
	
	  
	    public BasePage() {
	        this.driver = DriverManager.getDriver();
	    }

	   
	    
	    public T openPage(Class<T> clazz) {
	        T page = null;
	       
	            driver = DriverManager.getDriver();
	            page = PageFactory.initElements(driver, clazz);
	        return page;
	    }

	    
		public void click(WebElement element, String elementName) {
			
			element.click();
		 //ExtentTestManager.testReport.get().info("Clicking on : "+elementName);
			
		}
		
		public void clickUsingJavaScript(WebElement element, String elementName)
		{
			JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
			js.executeScript("arguments[0].click();", element);
		}
		
		public void clickUsingJavaScript(WebElement element, WebDriver driver)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", element);
		}
		
		
		public void type(WebElement element, String value, String elementName) {
			
			element.sendKeys(value);
			//ExtentTestManager.testReport.get().info("Typing in : "+elementName+" entered the value as : "+value);
		
		}
		
		public boolean isTextPresent(WebElement element, String text)
		{
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 60);
		boolean flg = wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		return flg;
		}
		
		public boolean isAttributePresent(WebElement element, String text)
		{
			WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 60);
			boolean flg = wait.until(ExpectedConditions.attributeContains(element, "value", text));
			return flg;
		}
		
		
		public boolean isElementPresent(WebElement element, String elementName)
		{
			//ExtentTestManager.testReport.get().info("Checking if Element is present with element Name: "+elementName);
			try {
			WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 60);
			wait.until(ExpectedConditions.visibilityOf(element));
			if(element.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());
			 return false;
			}
		}
		
		public boolean isElementPresent(WebElement element, String elementName, WebDriver driver)
		{
			//ExtentTestManager.testReport.get().info("Checking if Element is present with element Name: "+elementName);
			try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(element));
			if(element.isDisplayed())
			{
				return true;
			}
			else
			{
				return false;
			}
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());
			 return false;
			}
		}
		
		public boolean isElementClickable(WebElement element, String elementName)
		{
			//ExtentTestManager.testReport.get().info("Checking if Element is clickable with element Name: "+elementName);
			WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 60);
			try
			{
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
			}
			catch(StaleElementReferenceException e)
			{
				wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
			}
			if(element.isEnabled())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public String getTitle()
		{
			return DriverManager.getDriver().getTitle();
		}
		
		public void navigate_to_url(String url)
		{
			DriverManager.getDriver().get(url);
		}
		
		public boolean waitForPageToLoad(int timeOut) throws InterruptedException {
	        int i = (timeOut) * 10;
	        long startTime = System.currentTimeMillis();
	        for (int j = 0; j < i; j++) {
	            Thread.sleep(2000);
	            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	            boolean domStatus = js.executeScript("return document.readyState").equals("complete");

	            long endTime = System.currentTimeMillis();
	            long totalTime = (endTime - startTime) / 1000;

	            if (domStatus) {
	                System.out.println("Page Elements is successfully Loaded and Time taken is :" + totalTime + " seconds.");
	                return true;
	            }
	        }
	        return true;
	    }
		
		public WebElement getWebElementThroughXpath(String xpath)
		{
			WebElement element = DriverManager.getDriver().findElement(By.xpath(xpath));
			
			return element;
		}
		
		public boolean isWebElementExistsThroughXpath(String xpath)
		{
		  try
		  {
			WebElement element = DriverManager.getDriver().findElement(By.xpath(xpath));
			return true;
		  }
		  catch(Exception e)
		  {
			  return false;
		  }
		}
		
		public WebElement getWebElementThroughXpath(String xpath, WebDriver driver)
		{
			WebElement element = driver.findElement(By.xpath(xpath));
			
			return element;
		}
		
		
		
		
		public void selectByVisibleText(WebElement element, String text, String elementName)
		{
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}
			
		public String getTextOfWebElementBasedonAttribute(WebElement element, String attribute_name )
		{
			return element.getAttribute(attribute_name);
		}
		
		public List<WebElement> getAllSelectDropdownElements(WebElement element, String element_name)
		{
			
			Select select = new Select(element);
			List<WebElement> allOptions = select.getOptions();
			
			return allOptions;
			
		}
		
		public String getSelectedOptionFromDropdown(WebElement element, String elementName)
		{
			Select select = new Select(element);
			
			WebElement ele = select.getFirstSelectedOption();
			
			return ele.getText();
			
		}
		
		public String getTextofElementUsingJavaScript(WebElement element)
		{
			 JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
			 
			 String text = (String) js.executeScript("return arguments[0].value", element);
			 
			 return text;

		}
		
	public boolean switchToWindowAndVerifyWebElementPresent(WebElement element, String elementName) throws InterruptedException
	{	
		boolean flg = false;
		String currentWindowHandle = DriverManager.getDriver().getWindowHandle();
		Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		
		for(String handle : windowHandles)
		{
			if(!currentWindowHandle.equals(handle))
			{
				
				System.out.println("Handle is "+handle);
				DriverManager.getDriver().switchTo().window(handle);
				flg = true;
				Thread.sleep(2000);
				DriverManager.getDriver().close();
				
			}
		}
		
		DriverManager.getDriver().switchTo().window(currentWindowHandle);
		
		return flg;
	}
	
	public WebDriver switchToWindowAndReturnDriver() throws InterruptedException
	{
		String currentWindowHandle = DriverManager.getDriver().getWindowHandle();
		Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
		
		for(String handle : windowHandles)
		{
			if(!currentWindowHandle.equals(handle))
			{
				
				System.out.println("Handle is "+handle);
				DriverManager.getDriver().switchTo().window(handle);
				Thread.sleep(2000);
				return DriverManager.getDriver();
				
			}
		}
		
		DriverManager.getDriver().switchTo().window(currentWindowHandle);
		return DriverManager.getDriver();
		
		
	}
	
	public boolean numberOfWindowsTobeLoaded(int count)
	{
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 120);
		boolean flg = wait.until(ExpectedConditions.numberOfWindowsToBe(count));
		return flg;
	}
	
	public boolean isElementClickable(WebElement element, String elementName, WebDriver driver)
	{
		//ExtentTestManager.testReport.get().info("Checking if Element is clickable with element Name: "+elementName);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		try
		{
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		}
		catch(StaleElementReferenceException e)
		{
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
		}
		if(element.isEnabled())
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public boolean waitForAlert()
	{
		try
		{
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 40);
	    wait.until(ExpectedConditions.alertIsPresent());
	   
		}
		
		catch(Exception e)
		{
			System.out.println("No Alert Present");
			return false;
		}
		
		return true;
	}
	
	public void acceptJSAlert()
	{
		 Alert alert = DriverManager.getDriver().switchTo().alert();
		 alert.accept();
	}
		
	
	
//	public String getTextofAlert()
//	{  try 
//	{
//		Alert alert = DriverManager.getDriver().switchTo().alert();
//		String alert_text = alert.getText();
//		alert.accept();
//		return alert_text;
//	}
//	catch(Exception e)
//	{
//		System.out.println("No Alert present");
//		return null;
//	}
//	}
//	
//	
	
	
}

