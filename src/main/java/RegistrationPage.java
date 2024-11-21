import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class RegistrationPage {
    private final Faker faker = new Faker();

    private String name = faker.name().firstName();
    private String password = faker.internet().password(6, 8);
    private String email = faker.internet().emailAddress();


    //адрес страницы регистрации
    private static final String PAGE_URL = "https://stellarburgers.nomoreparties.site/register";

    //кнока войти
    private static final By BUTTON_ENTER = By.xpath("//a[@class='Auth_link__1fOlj']");
    //поле Имя
    private static final By NAME_FIELD = By.xpath("//input[@class='text input__textfield text_type_main-default'][@name='name'][1]");
    //поле Пароль
    private static final By EMAIL_FIELD = By.xpath("//label[text()='Email']/following-sibling::input");
    //поле Email
    private static final By PASSWORD_FIELD = By.xpath("//input[@class='text input__textfield text_type_main-default'][@name='Пароль']");
    //кнопка Зарегистрироваться
    private static final By REGISTRATION_BUTTON = By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    //поле некорректный пароль
    private static final By INCORRECT_PASSWORD = By.xpath("//p[@class='input__error text_type_main-default']");
    //кнопка войти после успешной регистрации
    private static final By ENTER_BUTTON_AFTER_REGISTRATION = By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");

    private final WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыем страницу")
    public void open() {
        driver.get(PAGE_URL);
    }

    @Step("Входим через кнопку войти")
    public void checkingEnterButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        driver.findElement(BUTTON_ENTER).click();
    }

    @Step("Заполнить Имя")
    public void fillName(String name) {
        driver.findElement(NAME_FIELD).sendKeys(name);
    }

    @Step("Заполнить пароль")
    public void fillPassword(String password) {
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    @Step("Заполнить email")
    public void fillEmail(String email) {
        driver.findElement(EMAIL_FIELD).sendKeys(email);
    }

    @Step("Нажимаем кнопку Зарегистрироваться")
    public void checkButtonRegistration() {
        driver.findElement(REGISTRATION_BUTTON).click();
    }


    @Step("Успешная Регистрация")
    public void registrationSuccess() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        fillName(name);
        fillEmail(email);
        fillPassword(password);
        checkButtonRegistration();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(ENTER_BUTTON_AFTER_REGISTRATION));
    }

    @Step("Неуспешная Регистрация")
    public void registrationWithPasswordLessSixCharacters() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        fillName(name);
        fillEmail(email);
        fillPassword("13245");
        checkButtonRegistration();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(INCORRECT_PASSWORD));
    }

}
