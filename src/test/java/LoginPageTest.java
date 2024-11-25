import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
    private WebDriver driver;
    private DriverFactory factory = new DriverFactory();
    private LoginPage loginPage;


    @Before
    public void initDriver() {
        factory.initDriver();
        driver = factory.getDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    @DisplayName("Вход в аккаунт с страницы входа")
    @Description("Успешный вход в аккаунт  с страницы входа в ЛК")
    public void CheckingLogin() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.userEnter();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
