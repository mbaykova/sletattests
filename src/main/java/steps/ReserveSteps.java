package steps;

import org.junit.Assert;
import pages.ReservePage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;
import static steps.BaseSteps.getVariable;

/**
 * Created by Maria on 27.10.2017.
 */
public class ReserveSteps {


	@Step("значение поля {0} равно {1}")
	public void checkFillField(String field, String value){
		if (getVariable(value)!= null)
				value = getVariable(value);
		ReservePage reservePage = new ReservePage();
		String actual = reservePage.getField(field);
		assertEquals(String.format("Значение поля %s не равно %s. Получено значение %s", field, value, actual), value, actual);
	}
}
