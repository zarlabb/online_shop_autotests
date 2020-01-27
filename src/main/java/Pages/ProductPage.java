package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ProductPage {
    final WebDriver driver;

    @FindBy (xpath = "//span[text()='Add to cart']")
    private WebElement addToCartButton;


    @FindBy (xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    @FindBy (xpath = "//span[@title='Continue shopping']")
    private WebElement continueShoppingButton;

    public ProductPage(WebDriver driver) {this.driver = driver; }

    public void addToCartAndProceed()  {
        addToCartButton.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //proceedToCheckoutButton.isDisplayed();
        proceedToCheckoutButton.click();
    }

    public void addToCartAndContinue() throws InterruptedException {
        addToCartButton.click();
        //productAddedPopup.wait();
        continueShoppingButton.click();
    }
}
