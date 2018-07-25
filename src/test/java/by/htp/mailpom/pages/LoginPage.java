package by.htp.mailpom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage{
	
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
	}

}
