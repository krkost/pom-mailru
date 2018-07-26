package by.htp.mailpom;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.mailpom.steps.Steps;

public class MailAutomationTest {

	private Steps steps;

	private final String USERNAME = "tathtp";
	private final String PASSWORD = "Klopik123";
	private final String RECEIVER = "celly@inbox.ru";
	private final String SUBJECT = "My new subject";
	private final String BODY = "My new email body";

	@BeforeMethod
	public void setUp() {
		steps = new Steps();
		steps.initBrowser();
	}

	@Test
	public void oneCanLoginMailRu() {
		steps.loginMail(USERNAME, PASSWORD);
		steps.closeDriver();
	}

	@Test
	public void initNewEmail() throws InterruptedException {
		steps.loginMail(USERNAME, PASSWORD);
		steps.clickNewEmail();
		steps.closeDriver();
	}

	@Test
	public void sendNewEmail() throws InterruptedException{
		steps.loginMail(USERNAME, PASSWORD);
		steps.clickNewEmail();
		steps.sendMail(RECEIVER, SUBJECT, BODY);
		steps.closeDriver();
	}

}
