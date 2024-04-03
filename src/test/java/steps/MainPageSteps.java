package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.SearchListPage;
import settings.WebDriverSettings;

public class MainPageSteps {
    private WebDriver driver;
    MainPage mainPage = new MainPage();
    SearchListPage searchListPage = new SearchListPage();

    public MainPageSteps() {
        this.driver = WebDriverSettings.getDriver();
    }

    @Given("I open the page {string}")
    public void userOpensThePage(String string) {
        WebDriverSettings.openPage(string);
    }

    @When("I enter {string} in search field")
    public void userEntersInSearchField(String string) {
        mainPage.fillInputSearch(string);
    }

    @And("I click button search")
    public void userClicksButtonSearch() {
        mainPage.clickSearchBtn();
    }

    @Then("title has text {string}")
    public void titleContainsText(String string) {
        String expectedTitle = "iphone 15 pro max";
        Assert.assertTrue(searchListPage.checkTitleText(string).contains(expectedTitle));
    }

    @When("I click by button categories")
    public void userClicksByAllCategories() {
        mainPage.clickCategoriesBtn();
    }

    @And("I select category electronics")
    public void userSelects() {
        mainPage.clickCategoryElectronics();
    }

    @And("I select subCategory phones")
    public void userSelect() {
        mainPage.clickSubCategoryPhones();
    }

    @And("I select company {string}")
    public void userSelectsFromDropDownList(String string) {
        mainPage.selectProducer(string);
    }

    @And("I select model {string}")
    public void userSelectModel(String string) {
        mainPage.selectModel(string);
    }

    @And("I click button to show results")
    public void userClickButtonToShowResults() {
        mainPage.clickShowResults();
    }

    @When("I click by section Electronic")
    public void iClickBySectionElectronic() {
        mainPage.clickElectronicSection();
    }

    @And("I select category Phones")
    public void iSelectCategoryPhones() {
        mainPage.clickPhoneSection();
    }
}
