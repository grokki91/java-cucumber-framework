package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.SearchListPage;
import utils.BaseSettings;

public class MainPageSteps {
    private WebDriver driver;
    MainPage mainPage = new MainPage();
    SearchListPage searchListPage = new SearchListPage();

    public MainPageSteps() {
        this.driver = BaseSettings.getDriver();
    }

    @Given("user opens the page {string}")
    public void userOpensThePage(String string) {
        BaseSettings.openPage(string);
    }

    @When("user enters {string} in search field")
    public void userEntersInSearchField(String string) {
        mainPage.fillInputSearch(string);
    }

    @And("user clicks button search")
    public void userClicksButtonSearch() {
        mainPage.clickSearchBtn();
    }

    @Then("title contains text {string}")
    public void titleContainsText(String string) {
        String expectedTitle = "iphone 15 pro max";
        Assert.assertTrue(searchListPage.checkTitleText(string).contains(expectedTitle));
    }

    @When("user clicks by button categories")
    public void userClicksByAllCategories() {
        mainPage.clickCategoriesBtn();
    }

    @And("user selects category electronics")
    public void userSelects() {
        mainPage.clickCategoryElectronics();
    }

    @And("user selects subCategory phones")
    public void userSelect() {
        mainPage.clickSubCategoryPhones();
    }

    @And("user selects company {string}")
    public void userSelectsFromDropDownList(String string) {
        mainPage.selectProducer(string);
    }

    @And("user select model {string}")
    public void userSelectModel(String string) {
        mainPage.selectModel(string);
    }

    @And("user click button to show results")
    public void userClickButtonToShowResults() {
        mainPage.clickShowResults();
    }
}
