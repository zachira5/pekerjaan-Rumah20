package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDef {
    WebDriver driver = new ChromeDriver();

    @Given("user is on login page")
    public void userIsOnLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username){
        By usernameInputText = By.id("user-name");
        driver.findElement(usernameInputText).sendKeys(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password){
        By passwordInputText = By.id("password");
        driver.findElement(passwordInputText).sendKeys(password);
    }

    @And("user click login button")
    public void userClickLoginButton(){
        By loginButton = By.id("login-button");
        driver.findElement(loginButton).click();
    }

    @And("user click button Add to chart product")
    public void userClickButtonAddToChartProduct() {
        By product1 = By.id("add-to-cart-sauce-labs-bike-light");
        driver.findElement(product1).click();
    }

    @When("user click shopping chart")
    public void userClickShoppingChart() {
        By shoppingChart = By.id("add-to-cart-sauce-labs-backpack");
        driver.findElement(shoppingChart).click();
    }
    @Then("user see chart page")
    public void userSeeChartPage() {
    }
}