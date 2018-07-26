package by.htp.mailpom;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.mailpom.steps.Steps;

public class MailAutomationTest {
	
	private Steps steps;
	
	private final String USERNAME = "tathtp";
	private final String PASSWORD = "Klopik123";
	
	@BeforeMethod
	public void setUp()
	{
		steps = new Steps();
		steps.initBrowser();
	}
	
	@Test
	public void oneCanLoginMailRu()
	{
		steps.loginMail(USERNAME, PASSWORD);
		steps.closeDriver();
	}
	
	@Test
	public void initNewEmail() throws InterruptedException {
		steps.clickNewEmail(USERNAME, PASSWORD);
		
		steps.closeDriver();
	}

}
