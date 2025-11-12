package pack;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



import io.qameta.allure.Attachment;

public class TestListener implements ITestListener{

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		
		 Object testClass = result.getInstance();
	        WebDriver driver = ((LoginTest) testClass).driver;

	        if (driver != null) {
	            saveScreenshot(driver);
	        }
	    }

	    @Attachment(value = "Screenshot on Failure", type = "image/png")
	    public byte[] saveScreenshot(WebDriver driver) {
	        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    }

	    @Attachment(value = "Test Step Details", type = "text/plain")
	    public static String saveTextLog(String message) {
	        return message;
	    }

	}

	
