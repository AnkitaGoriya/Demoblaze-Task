package com.demoblaze;

import com.cucumber.listener.Reporter;
import com.demoblaze.propertyreader.PropertyReader;
import com.demoblaze.utilities.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utility {

    @Before
    public void setUp() {
        // This method is executed before each scenario
        // It sets up the browser based on the configuration provided in the property file
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) {
        // This method is executed after each scenario
        // It takes a screenshot if the scenario has failed and attaches it to the Cucumber report
        if (scenario.isFailed()) {

            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                // Attaches the screenshot to the Cucumber report
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                // Throws a runtime exception if there's an issue with adding the screenshot to the report
                throw new RuntimeException(e);
            }
        }
        // Closes the browser after the scenario is completed
        closeBrowser();
    }
}
