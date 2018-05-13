package steps;

import io.qameta.allure.Step;
import pages.AuthPage;
import pages.SearchTicketPage;


/**
 * Created by Maria on 27.10.2017.
 */
public class AuthSteps {

	@Step("выполнена авторизация с логином {0} и паролем {1}")
	public void fillField(String login, String password){
		AuthPage authPage = new AuthPage();
		authPage.enter.click();
		authPage.fillField(authPage.login, login);
		authPage.fillField(authPage.password, password);
		authPage.action.click();
	}
}
