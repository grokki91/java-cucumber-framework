package pages;

import locators.SearchListPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.BaseSettings;

import java.util.Locale;

public class SearchListPage extends BaseSettings {
    SearchListPageLocators searchListPage = null;

    public SearchListPage() {
        this.searchListPage = new SearchListPageLocators();
        PageFactory.initElements(BaseSettings.getDriver(), searchListPage);
    }

    public String checkTitleText(String string) {
        return searchListPage.title.getText().toLowerCase();
    }
}
