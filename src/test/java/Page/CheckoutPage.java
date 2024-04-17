package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;
    By shoppingChart = By.cssSelector(".shopping_cart_link");
    By checkout = By.cssSelector("#checkout");
    By firstNameInput = By.id("first-name");
    By lastNameInput = By.id("last-name");
    By zipInput = By.id("postal-code");
    By next = By.id("continue");
    By finish = By.id("finish");


    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickShoppingChart(){
        driver.findElement(shoppingChart).click();
    }

    public void clickCheckout(){
        driver.findElement(checkout).click();
    }

    public void inputFirstName(String firstName){
        driver.findElement(firstNameInput).sendKeys(firstName);
    }
    public void inputLastName(String lastName){
        driver.findElement(lastNameInput).sendKeys(lastName);
    }
    public void inputCode(String zip){
        driver.findElement(zipInput).sendKeys(zip);
    }

    public void clickContinue(){
        driver.findElement(next).click();
    }

    public void clickFinish(){
        driver.findElement(finish).click();
    }

}
