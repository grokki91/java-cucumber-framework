package pages;

import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;
import settings.WebDriverSettings;

public class MainPage extends WebDriverSettings {
    MainPageLocators mainPage = null;

    public MainPage() {
        this.mainPage = new MainPageLocators();
        PageFactory.initElements(WebDriverSettings.getDriver(), mainPage);
    }

    public void fillInputSearch(String search) {
        waitForClickable(mainPage.searchInput);
        mainPage.searchInput.sendKeys(search);
    }

    public void clickSearchBtn() {
        waitForClickable(mainPage.findBtn);
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
        waitForClickable(mainPage.inputProducer);
        mainPage.inputProducer.sendKeys(string);
        waitForClickable(mainPage.btnOptionApple);
        mainPage.btnOptionApple.click();
    }

    public void selectModel(String string) {
        waitForClickable(mainPage.inputModel);
        mainPage.inputModel.sendKeys(string);
        waitForClickable(mainPage.btnOptionModel);
        mainPage.btnOptionModel.click();
    }

    public void clickShowResults() {
        waitForClickable(mainPage.btnShow);
        mainPage.btnShow.click();
    }

    public void clickElectronicSection() {
        waitForClickable(mainPage.electronicSection);
        mainPage.electronicSection.click();
    }

    public void clickPhoneSection() {
        waitForClickable(mainPage.phoneSection);
        mainPage.phoneSection.click();
    }
}
