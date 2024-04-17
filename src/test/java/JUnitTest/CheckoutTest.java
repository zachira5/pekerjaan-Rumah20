package JUnitTest;

import Page.CheckoutPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CheckoutTest {
    @Test
    public void testCheckout() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        CheckoutPage co = new CheckoutPage(driver);
        co.clickShoppingChart();
        co.clickCheckout();
        co.inputFirstName("Mala");
        co.inputLastName("Fauzana");
        co.inputCode("1130");
        co.clickContinue();
        co.clickFinish();

        Thread.sleep(2000);
    }
}
