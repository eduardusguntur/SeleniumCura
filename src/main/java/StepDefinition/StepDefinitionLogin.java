package StepDefinition;

import configuration.environment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class StepDefinitionLogin extends environment {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(curaherokuapplogin);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-button']"));
    }

    @When("User fill Username")
    public void userFillUsername() {
    }

    @And("User fill Password")
    public void userFillPassword() {
    }

    @And("User click login button")
    public void userClickLoginButton() {
    }

    @Then("User success login")
    public void userSuccessLogin() {
    }
}
