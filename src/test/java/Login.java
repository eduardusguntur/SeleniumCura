import configuration.environment;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Login extends environment {

    @Test
    public void loginSuccess () {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(curaherokuapp);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'btn-make-appointment\']"))
        );

        driver.findElement(By.xpath("//*[@id=\'btn-make-appointment\']")).click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'login\']/div/div/div[1]/h2")));

        driver.quit();
    }
}
