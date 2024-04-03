package pages;

import locators.SearchListPageLocators;
import org.openqa.selenium.support.PageFactory;
import settings.WebDriverSettings;

public class SearchListPage extends WebDriverSettings {
    SearchListPageLocators searchListPage = null;

    public SearchListPage() {
        this.searchListPage = new SearchListPageLocators();
        PageFactory.initElements(WebDriverSettings.getDriver(), searchListPage);
    }

    public String checkTitleText(String string) {
        return searchListPage.title.getText().toLowerCase();
    }
}
