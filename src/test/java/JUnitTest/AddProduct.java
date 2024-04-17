package JUnitTest;

import Page.AddPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
public class AddProduct {
    @Test
    public void testAddProduct() throws InterruptedException{
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://www.saucedemo.com/inventory.html");

        AddPage add = new AddPage(driver);
        add.clickProduct1();
        add.clickShoppingChart();

        Thread.sleep(2000);
    }
}
