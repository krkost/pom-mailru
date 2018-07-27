package by.htp.mailpom.steps;

import org.openqa.selenium.WebDriver;

import by.htp.mailpom.driver.DriverSingleton;
import by.htp.mailpom.entity.Email;
import by.htp.mailpom.pages.InboxMessagesPage;
import by.htp.mailpom.pages.LoginPage;
import by.htp.mailpom.pages.NewEmailPage;
import by.htp.mailpom.pages.SentMessagesPage;

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
	
	public void clickNewEmail() throws InterruptedException {
		InboxMessagesPage inMesPage = new InboxMessagesPage(driver);
		inMesPage.clickNewEmailBtn();
	}
	
	public void sendMail(String receiver, String subject, String body) throws InterruptedException {
		NewEmailPage newEmPage = new NewEmailPage(driver);
		newEmPage.InputFieldsNewEmail(receiver, subject, body);
	}
	
	public Email findSentMail(String subject) throws InterruptedException {
		SentMessagesPage sentMessagesPage = new SentMessagesPage(driver);
		sentMessagesPage.openPage();
		Email sentEmail = sentMessagesPage.findSentEmail(subject);
		
		return sentEmail;
	}


}
