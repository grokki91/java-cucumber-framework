package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageLocators {
    @FindBy(xpath = "//input[@data-marker='search-form/suggest']")
    public WebElement searchInput;

    @FindBy(xpath = "//img[@alt='Электроника']")
    public WebElement electronicSection;

    @FindBy(xpath = "//img[@alt='Телефоны']")
    public WebElement phoneSection;

    @FindBy(xpath = "//button[@data-marker='search-form/submit-button']")
    public WebElement findBtn;

    @FindBy(xpath = "//button[@data-marker='top-rubricator/all-categories']")
    public WebElement categoriesBtn;

    @FindBy(xpath = "//*[text()='Электроника']/parent::div[contains(@class,'new-rubricator')]")
    public WebElement categoryElectronics;

    @FindBy(xpath = "//span[text()='Мобильные телефоны']")
    public WebElement subCategoryPhones;

    @FindBy(xpath = "//input[@placeholder='Производитель']")
    public WebElement inputProducer;

    @FindBy(xpath = "//div[contains(@class, 'dropdown')]/descendant::*[text()='Apple']")
    public WebElement btnOptionApple;

    @FindBy(xpath = "//input[@placeholder='Модель']")
    public WebElement inputModel;

    @FindBy(xpath = "//div[contains(@class, 'dropdown')]/descendant::*[text()='iPhone 15 Pro Max']")
    public WebElement btnOptionModel;

    @FindBy(xpath = "//span[contains(text(), 'Показать')]/ancestor::button")
    public WebElement btnShow;
}
