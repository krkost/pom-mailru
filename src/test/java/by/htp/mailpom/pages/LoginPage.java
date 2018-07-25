package by.htp.mailpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

	private static final String BASE_URL = "https://mail.ru/";

	private WebElement inputLogin;
	private WebElement inputPass;
	private WebElement buttonSubmit;
	private WebElement linkLoggedInUser;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.get(BASE_URL);
	}

	public void login(String username, String password) {
		inputLogin.findElement(By.xpath("//div[@id='mailbox:loginContainer']/child::*")).sendKeys(username);
		inputPass.findElement(By.xpath("//div[@class='mailbox__input__container']/child::*[1]")).sendKeys(password);
		buttonSubmit.findElement(By.xpath("//input[@class='o-control']")).click();
	}

}
