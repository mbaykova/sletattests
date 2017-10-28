package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Maria on 26.10.2017.
 */
public class DetailsTicketPage extends BasePage {

	@FindBy(name = "lastName")
	WebElement lastName;

	@FindBy(name = "firstName")
	WebElement firstName;

	@FindBy(name = "midName")
	WebElement midName;

	@FindBy(name = "gender")
	public WebElement gender;

	@FindBy(name = "birthdate")
	public WebElement birthdate;

	@FindBy(name = "docType")
	public WebElement docType;


	@FindBy(name = "docNumber")
	public WebElement docNumber;

	@FindBy(name = "bInsurance")
	public WebElement bInsurance;

	@FindBy(name = "MedicalInsuranceCheckbox")
	public WebElement medicalInsuranceCheckbox;

	@FindBy(xpath = "//button[contains(text(),'Зарезервировать')]")
	public WebElement submitButton;

	@FindBy(xpath = "//h4//span[@class='text-nowrap']")
	public WebElement price;



	public void fillField(String fieldName, String value){
		switch (fieldName){
			case  "Фамилия":
				fillField(lastName, value);
				break;
			case  "Имя":
				fillField(firstName, value);
				break;
			case  "Отчество":
				fillField(midName, value);
				break;
			case  "Пол":
				selectFields(gender, value);
				break;
			case  "Дата рождения":
				fillField(birthdate, value);
				break;
			case  "Тип документа":
				selectFields(docType, value);
				break;
			case  "Номер документа":
				fillField(docNumber, value);
				break;
			default:  throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
		}
	}


	public void cancelInsurance(){
		click(bInsurance);
		click(medicalInsuranceCheckbox);
	}



}
