package net.seamlessly.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import net.seamlessly.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void teardownScenario(Scenario scenario) { //scenario object is capable to follow scenario steps

        //if scenario fails this condition will be executed
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        Driver.closeDriver();


    }

}
