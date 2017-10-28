package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Maria on 26.10.2017.
 */
public class SearchTicketPage extends BasePage {

			@FindBy(id = "name0")
			WebElement departure;

			@FindBy(id = "name1")
			WebElement arrival;

			@FindBy(id = "date0")
			WebElement date;

			@FindBy(id = "Submit")
			public WebElement searchButton;



	public void fillField(String fieldName, String value){
				switch (fieldName){
					case  "Откуда":
						fillFieldAndTAB(departure, value);
						break;
					case  "Куда":
						fillFieldAndTAB(arrival, value);
						break;
					case  "Дата":
						fillFieldAndTAB(date, value);
						break;
					default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
				}
			}


	private void fillFieldAndTAB(WebElement field, String value) {
				field.clear();
				field.sendKeys(value);
				new Actions(driver).sendKeys(field, Keys.TAB);

	}


}
