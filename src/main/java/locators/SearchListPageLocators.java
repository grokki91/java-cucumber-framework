package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchListPageLocators {
    @FindBy(tagName = "h1")
    public WebElement title;
}
