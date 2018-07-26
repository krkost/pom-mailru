package by.htp.mailpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InboxMessagesPage extends AbstractPage {

	private WebElement buttonNewEmail;

	public InboxMessagesPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
	}
	
	public void clickNewEmailBtn() throws InterruptedException {
		Thread.sleep(1500);
		buttonNewEmail = driver.findElement(By.xpath("(//span[contains(text(), 'Написать письмо')])[1]"));
		buttonNewEmail.click();
	}

}
