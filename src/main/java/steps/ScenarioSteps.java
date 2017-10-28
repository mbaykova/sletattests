package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

import static steps.BaseSteps.setVariables;

/**
 * Created by Maria on 26.10.2017.
 */
public class ScenarioSteps {

		DetailsTicketSteps detailsTourSteps = new DetailsTicketSteps();

		SearchTicketSteps searchTicketSteps = new SearchTicketSteps();

		ResultSearchSteps resultSearchSteps = new ResultSearchSteps();

		ReserveSteps reserveSteps = new ReserveSteps();

		AuthSteps authSteps = new AuthSteps();

		@When("^заполняются поля:$")
		public void fillForm(DataTable fields){
			fields.asMap(String.class, String.class)
					.forEach((field, value) -> searchTicketSteps.fillField(field, value));

		}

		@When("^Выполнено нажатие на кнопку - Найти$")
		public void clickSearch(){
				searchTicketSteps.clickSerch();
		}

	@When("^пользователь авторизован с логином (.*) и паролем (.*)$")
	public void stepLogin(String login, String password){
		authSteps.fillField(login, password);
	}


	@When("^выбран поезд (.*) с временем отправления (.*)$")
	public void stepSelectTrain(String name, String time){
			resultSearchSteps.selectTrain(name, time);
	}

	@When("^выполнен переход к вводу данных и выбору мест$")
	public void stepGoToFillData(){
		resultSearchSteps.goToChooseSeat();
	}



	@When("^заполняются личнные данные пассажира:$")
	public void fillPersonalDate(DataTable fields){
		fields.asMap(String.class, String.class)
				.forEach((field, value) -> detailsTourSteps.fillField(field, value));
		detailsTourSteps.cancelInsurance();
	}

	@When("^в переменной (.*) сохранено значение стоимости билета$")
	public void stepSavePrice(String variable){
			setVariables(variable, detailsTourSteps.getPrice());

	}

	@When("^Выполнено нажатие на кнопку - Зарезервировать$")
	public void stepReserve(){
			detailsTourSteps.reserve();
	}

	@When("^значения полей:$")
	public void checkFillForm(DataTable fields){
		fields.asMap(String.class, String.class)
				.forEach((field, value) -> reserveSteps.checkFillField(field, value));

	}

}
