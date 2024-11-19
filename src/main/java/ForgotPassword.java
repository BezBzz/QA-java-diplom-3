import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
