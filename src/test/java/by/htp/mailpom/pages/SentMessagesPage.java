package by.htp.mailpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import by.htp.mailpom.entity.Email;

public class SentMessagesPage extends AbstractPage {
	
	private static final String BASE_URL = "https://e.mail.ru/messages/sent/";
	
	private WebElement sentEmailReceiver;
	private WebElement sentEmailSubject;
	private WebElement sentEmailBody;


	public SentMessagesPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.get(BASE_URL);
	}
	
	public Email findSentEmail(String subject) throws InterruptedException {
		Thread.sleep(1500);
		
		Email sentEmail = new Email();
		
		sentEmailReceiver = driver.findElement(By.xpath("(//div[@class='b-datalist__item__addr'])[1]"));
		sentEmailBody = driver.findElement(By.xpath("(//span[@class='b-datalist__item__subj__snippet'])[1]"));
		
		sentEmail.setReceiver(sentEmailReceiver.getText());
		sentEmail.setBody(sentEmailBody.getText());
		
		if(driver.findElement(By.xpath("//a[@data-subject='"+subject+"']")).isEnabled()) {
			sentEmail.setSubject(subject);
		}
		
		return sentEmail;
	}

}
