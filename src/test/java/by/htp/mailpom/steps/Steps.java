package by.htp.mailpom.steps;

import org.openqa.selenium.WebDriver;

import by.htp.mailpom.driver.DriverSingleton;
import by.htp.mailpom.pages.LoginPage;

public class Steps {
	
	private WebDriver driver;
	
	public void initBrowser()
	{
		driver = DriverSingleton.getDriver();
	}

	public void closeDriver()
	{
		DriverSingleton.closeDriver();
	}
	
	public void loginMail(String username, String password)
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openPage();
		loginPage.login(username, password);
	}

}
