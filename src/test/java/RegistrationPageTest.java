import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {
    private WebDriver driver;
    private DriverFactory factory = new DriverFactory();
    private LoginPage loginPage;
    private RegistrationPage registrationPage;

    @Before
    public void initDriver() {
        factory.initDriver();
        driver = factory.getDriver();
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);

    }

    @Test
    @DisplayName("Вход  аккаунт из формы регистрации")
    @Description("Успешный вход в аккаунт  из формы регистрации")
    public void enterOnFormRegistration() {
        registrationPage.checkingEnterButton();
        loginPage.userEnter();
    }

    @Test
    @DisplayName("Успешная регистрация")
    @Description("Успешный вход в аккаунт  из формы регистрации")
    public void successRegistration() {
        registrationPage.registrationSuccess();
    }

    @Test
    @DisplayName("Некорректный пароль при регистрации")
    @Description("Регистрация с паролем меньше допустимой длины")
    public void incorrectPasswordOnRegistration() {
        registrationPage.registrationWithPasswordLessSixCharacters();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

