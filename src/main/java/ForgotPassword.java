import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ForgotPassword {

    private static final String PAGE_URL = "https://stellarburgers.nomoreparties.site/forgot-password";

    private static final By ENTER_PAGE = By.xpath("//a[@class='Auth_link__1fOlj']");


    private final WebDriver driver;

    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыем страницу")
    public void open() {
        driver.get(PAGE_URL);
    }


    @Step("Входим в ЛК через форму забыли пароль")
    public void checkingEnterLk() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        driver.findElement(ENTER_PAGE).click();
    }
}
