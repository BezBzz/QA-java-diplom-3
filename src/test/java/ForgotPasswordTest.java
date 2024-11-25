import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordTest {
    private WebDriver driver;
    private DriverFactory factory = new DriverFactory();
    private LoginPage loginPage;
    private ForgotPassword forgotPassword;

    @Before
    public void initDriver() {
        factory.initDriver();
        driver = factory.getDriver();
        loginPage = new LoginPage(driver);
        forgotPassword = new ForgotPassword(driver);
    }

    @Test
    @DisplayName("Вход в аккаунт из формы восстановления пароля")
    @Description("Успешный вход в аккаунт  из формы восстановления пароля")
    public void enterOnFormForgotPassword() {
        forgotPassword.checkingEnterLk();
        loginPage.userEnter();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
