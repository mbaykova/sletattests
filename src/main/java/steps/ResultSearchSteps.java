package steps;

import pages.AuthPage;
import pages.ResultSearchPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Maria on 26.10.2017.
 */
public class ResultSearchSteps {


	@Step
	public void selectTrain(String name, String time){
		ResultSearchPage resultSearchPage = new ResultSearchPage();
		resultSearchPage.selectTrain(name, time);
	}

	@Step
	public void goToChooseSeat(){
		ResultSearchPage resultSearchPage = new ResultSearchPage();
		resultSearchPage.selectCar();
	}
}
