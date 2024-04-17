package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutStepDev {
    WebDriver driver = new ChromeDriver();
    @Given("user is on login page checkout")
    public void userIsOnLoginPageCheckout(){
        driver.get("https://www.saucedemo.com/");
    }
    @And("user input username checkout with {string}")
    public void userInputUsernamecheChekoutWith(String username){
        By usernameInputText = By.id("user-name");
        driver.findElement(usernameInputText).sendKeys(username);
    }

    @And("user input password checkout with {string}")
    public void userInputPassworCheckoutdWith(String password){
        By passwordInputText = By.id("password");
        driver.findElement(passwordInputText).sendKeys(password);
    }

    @And("user click login button checkout")
    public void userClickLoginCheckoutButton(){
        By loginButton = By.id("login-button");
        driver.findElement(loginButton).click();
    }

    @And("user click button Add to chart product checkout")
    public void userClickButtonAddToChartProductCheckout() {
        By product1 = By.id("add-to-cart-sauce-labs-bike-light");
        driver.findElement(product1).click();
    }
    @And("user click shopping chart checkout")
    public void userClickShoppingChartCheckout(){
        By shoppingChart = By.cssSelector(".shopping_cart_link");
        driver.findElement(shoppingChart).click();
    }

    @And("user click button checkout")
    public void userClickButtonCheckout() {
        By checkout = By.cssSelector("#checkout");
        driver.findElement(checkout).click();
    }

    @And("user input firstname with {string}")
    public void userInputFirstnameWith(String firstName) {
        By firstNameInput = By.id("first-name");
        driver.findElement(firstNameInput).sendKeys(firstName);

    }

    @And("user input lastname with {string}")
    public void userInputLastnameWith(String lastName) {
        By lastNameInput = By.id("last-name");
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    @And("user input portalcode with {string}")
    public void userInputPortalcodeWith(String zip) {
        By zipInput = By.id("postal-code");
        driver.findElement(zipInput).sendKeys(zip);
    }

    @And("user click button continue")
    public void userClickButtonContinue() {
        By next = By.id("continue");
        driver.findElement(next).click();
    }

    @When("user click button finish")
    public void userClickButtonFinish() {
        By finish = By.id("finish");
        driver.findElement(finish).click();
    }

    @Then("user see finish page")
    public void userSeeFinishPage() {
    }
}
