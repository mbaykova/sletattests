package steps;

import pages.DetailsTicketPage;
import pages.SearchTicketPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Maria on 26.10.2017.
 */
public class DetailsTicketSteps {


	@Step("поле {0} заполняется значением {1}")
	public void fillField(String field, String value){
		DetailsTicketPage detailsTicketPage = new DetailsTicketPage();
		detailsTicketPage.fillField(field, value);
	}

	@Step("отказа от страховки")
	public void cancelInsurance(){
		DetailsTicketPage detailsTicketPage = new DetailsTicketPage();
		detailsTicketPage.cancelInsurance();
	}

	@Step("получено значение стоимости билета")
	public String getPrice(){
		return new DetailsTicketPage().price.getText();
	}

	@Step
	public void reserve(){
		DetailsTicketPage detailsTicketPage = new DetailsTicketPage();
		detailsTicketPage.click(detailsTicketPage.submitButton);
	}

}
