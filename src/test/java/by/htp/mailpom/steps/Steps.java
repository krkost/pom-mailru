package by.htp.mailpom.steps;

import org.openqa.selenium.WebDriver;

import by.htp.mailpom.driver.DriverSingleton;
import by.htp.mailpom.pages.InboxMessagesPage;
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
	
	public void clickNewEmail(String username, String password) throws InterruptedException {
		loginMail(username, password);
		InboxMessagesPage inMesPage = new InboxMessagesPage(driver);
		inMesPage.clickNewEmailBtn();
	}
	
	public void sendMail(String username, String password) {
		
	}

}
