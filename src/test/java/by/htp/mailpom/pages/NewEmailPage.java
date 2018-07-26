package by.htp.mailpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewEmailPage extends AbstractPage {

	private WebElement inputReceiver;
	private WebElement inputSubject;
	private WebElement inputBody;
	private WebElement clickSendBtn;

	public NewEmailPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
	}

	public void InputFieldsNewEmail(String receiver, String subject, String body) throws InterruptedException {
		inputReceiver = driver.findElement(By.xpath("//textarea[@data-original-name='To']"));
		inputReceiver.sendKeys(receiver);
		inputSubject = driver.findElement(By.xpath("//input[@name='Subject']"));
		inputSubject.sendKeys(subject);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='{#aria.rich_text_area}']")));

		inputBody = driver.findElement(By.xpath("//body[@id='tinymce']"));
		inputBody.sendKeys(body);

		driver.switchTo().defaultContent();

		clickSendBtn = driver.findElement(By.xpath("//div[@data-name='send']"));
		clickSendBtn.click();
		Thread.sleep(1500);
	}

}
