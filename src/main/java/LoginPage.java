import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private static final String PAGE_URL = "https://stellarburgers.nomoreparties.site/login";

    //поле Email
    private static final By EMAIL_FIELD = By.xpath("//input[@name='name']");
    //Поле Пароль
    private static final By PASSWORD_FIELD = By.xpath("//input[@name='Пароль']");

    //кнопка Войти
    private static final By ENTER_BUTTON = By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");

    //проверяемый элемент после входа
    private static final By CHECKING_ELEMENT = By.xpath("//h1[@class='text text_type_main-large mb-5 mt-10']");

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыем страницу")
    public void open() {
        driver.get(PAGE_URL);
    }

    @Step("Вводим Email пользователя")
    public void fillEmailField(String email) {
        driver.findElement(EMAIL_FIELD).sendKeys(email);
    }

    @Step("Вводим пароль пользователя")
    public void fillPasswordField(String password) {
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    @Step("Нажимаем кнопку войти")
    public void clickEnterButton() {
        driver.findElement(ENTER_BUTTON).click();
    }

    @Step("Авторизуемся")
    public void userEnter() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        fillEmailField("testo@mail123.ru");
        fillPasswordField("viktor");
        clickEnterButton();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(CHECKING_ELEMENT));
    }


}
