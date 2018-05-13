package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SearchTicketPage;
import io.qameta.allure.Step;

import static steps.BaseSteps.driver;

/**
 * Created by Maria on 26.10.2017.
 */
public class SearchTicketSteps {


			@Step("поле {0} заполняется значением {1}")
			public void fillField(String field, String value){
				new SearchTicketPage().fillField(field, value);
			}

			@Step("выолнено нажати на кнопку - Найти")
			public void clickSerch(){
				Wait<WebDriver> wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.elementToBeClickable(new SearchTicketPage().searchButton)).click();
			}
}
