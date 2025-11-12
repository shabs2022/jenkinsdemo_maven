package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Step;


@Listeners(TestListener.class)
public class LoginTest {
	WebDriver driver;
	
	@Test (description="verify valid login scenario")
	@Description("This test verifies login with valid credentials")
	public void logintest() {
		
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours");
		enterUsername("mercury");
		enterPassword("admin123");
		clicklogin();
		driver.close();
	}
	
	@Step("enter username")
	public void enterUsername(String uname) {
		
		System.out.println("username entered"+uname);
	}
	
	
	@Step("enter password")
	public void enterPassword(String pwd) {
		
		System.out.println("password entered"+pwd);
	}
	
	@Step("click login button")
	
	public void clicklogin() {
		
		System.out.println("login button clicked");
		
	}
	
	

}
