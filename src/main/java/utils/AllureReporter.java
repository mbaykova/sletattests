package utils;

import gherkin.formatter.model.Result;
import io.qameta.allure.Attachment;
import io.qameta.allure.cucumberjvm.AllureCucumberJvm;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import steps.BaseSteps;

import static steps.BaseSteps.getDriver;


/**
 * Created by 777 on 08.05.2017.
 */
public class AllureReporter extends AllureCucumberJvm {


    @Override
    public void result(Result result) {
        if ("failed".equals(result.getStatus())) takeScreenshot();
        super.result(result);
    }



    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) BaseSteps.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
