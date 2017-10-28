package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Maria on 27.10.2017.
 */
public class AuthPage extends BasePage{

	@FindBy(id = "j_username")
	public WebElement login;

	@FindBy(id = "j_password")
	public WebElement password;

	@FindBy(xpath = "//button[@name='action']")
	public WebElement action;

	@FindBy(xpath = "//a[text()='Вход'][@class='orng']")
	public WebElement enter;
}
