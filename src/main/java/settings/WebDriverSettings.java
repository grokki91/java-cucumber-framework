package settings;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverSettings {
    public static WebDriver driver;
    private static ChromeOptions options;
    private static DesiredCapabilities capabilities;
    private static WebDriverWait wait;
    private final static int TIMEOUT = 10;

    @Before
    public static void init() {
        if (driver == null) {
            capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "eager");
            WebDriverManager.chromedriver().setup();
            options = new ChromeOptions();
            options.addArguments("-headless");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            waitSettings();
        }
    }

    private static void waitSettings() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        wait = new WebDriverWait(driver, (Duration.ofSeconds(TIMEOUT)));
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void waitForVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForClickable(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
