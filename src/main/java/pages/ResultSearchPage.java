package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Maria on 26.10.2017.
 */
public class ResultSearchPage extends BasePage {

	@FindBy(xpath = "//div[@class='j-routes route-items-cont']")
	WebElement listResultSearch;

	@FindBy(xpath = "//*[contains(text(),'Обычные места')]/ancestor::div[@class='route-item__cars-list__item j-car-list-item']//input[@type='radio']")
	WebElement selectCar;

	@FindBy(xpath = "//*[text()='Перейти к вводу данных пассажира и выбору мест']")
	public WebElement goToChooseSeatBtn;


	public void selectTrain(String name, String time){
			WebElement train = listResultSearch.findElement(By.xpath(".//div[@class='route-item'][.//*[contains(text(),'"+name+"')]][.//*[text()='"+time+"']]//button"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", train);
			train.click();
	}

	public void selectCar(){
		click(selectCar);
		click(goToChooseSeatBtn);
	}
}
