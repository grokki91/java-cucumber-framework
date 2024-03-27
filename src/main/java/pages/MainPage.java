package pages;

import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.BaseSettings;

public class MainPage extends BaseSettings {
    MainPageLocators mainPage = null;

    public MainPage() {
        this.mainPage = new MainPageLocators();
        PageFactory.initElements(BaseSettings.getDriver(), mainPage);
    }

    public void fillInputSearch(String search) {
        mainPage.searchInput.sendKeys(search);
    }

    public void clickSearchBtn() {
        mainPage.findBtn.click();
    }

    public void clickCategoriesBtn() {
        waitForClickable(mainPage.categoriesBtn);
        mainPage.categoriesBtn.click();
    }

    public void clickCategoryElectronics() {
        waitForClickable(mainPage.categoryElectronics);
        mainPage.categoryElectronics.click();
    }

    public void clickSubCategoryPhones() {
        waitForClickable(mainPage.subCategoryPhones);
        mainPage.subCategoryPhones.click();
    }

    public void selectProducer(String string) {
        mainPage.inputProducer.sendKeys(string);
        waitForClickable(mainPage.btnOptionApple);
        mainPage.btnOptionApple.click();
    }

    public void selectModel(String string) {
        mainPage.inputModel.sendKeys(string);
        waitForClickable(mainPage.btnOptionModel);
        mainPage.btnOptionModel.click();
    }

    public void clickShowResults() {
        waitForClickable(mainPage.btnShow);
        mainPage.btnShow.click();
    }
}
