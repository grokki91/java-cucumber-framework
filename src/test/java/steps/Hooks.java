package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import settings.WebDriverSettings;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Hooks {
    @Before
    public static void setUp() {
        WebDriverSettings.init();
    }

    @After
    public static void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            File srcFile = ((TakesScreenshot) WebDriverSettings.getDriver()).getScreenshotAs(OutputType.FILE);
            String useDir = System.getProperty("user.dir");
            File directory = new File(useDir, "screenshots");
            UUID randomText = UUID.randomUUID();

            if (!directory.exists()) {
                directory.mkdir();
            }

            FileHandler.copy(srcFile, new File("./screenshots/" + scenario.getName() + "_" + randomText + ".png"));

        }

        WebDriverSettings.tearDown();
    }
}
