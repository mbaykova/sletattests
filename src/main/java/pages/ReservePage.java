package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maria on 27.10.2017.
 */
public class ReservePage extends BasePage {

	@FindBy(xpath = "//label[text()='ФИО']/../div")
	public WebElement fio;


	@FindBy(xpath = "//label[text()='Паспорт РФ']/../div")
	public WebElement passport;

	@FindBy(xpath = "(//h3[contains(text(),'Сумма заказа')]/span[text()])[1]")
	public WebElement price;

	@FindBy(xpath = "(//h3[contains(text(),'Ваши места успешно забронированы!')])[1]")
	public WebElement title;

	public ReservePage(){
		PageFactory.initElements(driver, this);
		Wait<WebDriver> wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(title));
	}


	public String getField(String fieldName){
		switch (fieldName){
			case  "ФИО":
				return fio.getText();
			case  "Паспорт РФ":
				return passport.getText();
			case  "Сумма":
				return price.getText();
			default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
		}
	}


}
