package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddPage {
    static WebDriver driver;
    static By product1 = By.id("add-to-cart-sauce-labs-bike-light");
    static By shoppingChart = By.id("add-to-cart-sauce-labs-backpack");

    public AddPage(WebDriver driver){
        this.driver=driver;
    }

    public static void  clickProduct1(){
        driver.findElement(product1).click();
    }
    public static void clickShoppingChart(){
        driver.findElement(shoppingChart).click();
    }
}
