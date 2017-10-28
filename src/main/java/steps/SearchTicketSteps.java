package steps;

import pages.SearchTicketPage;
import ru.yandex.qatools.allure.annotations.Step;

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
		new SearchTicketPage().searchButton.click();
	}
}
