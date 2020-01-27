package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MainPage {
    final WebDriver driver;

    @FindBy (xpath = "//input[@id='search_query_top']")
    private WebElement searchField;

    @FindBy (xpath = "//button[@name='submit_search']")
    private WebElement searchButton;

    @FindBy (xpath = "//a[@title='View my shopping cart']")
    private WebElement goToCartOrderPageButton;


    @FindBy (xpath = "//li[contains(@class, 'first-in-line')]")
    private WebElement firstProductInFirstLineOnSearchPage;

    public MainPage(WebDriver driver) {this.driver = driver; }

    public void searchItemAndSelectFirstInList(String search_key ) {
        searchField.click();
        searchField.sendKeys(search_key);
        searchButton.click();
        firstProductInFirstLineOnSearchPage.click();
    }

    public void goToOrderPage() {
        goToCartOrderPageButton.click();
    }
}
