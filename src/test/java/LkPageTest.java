import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class LkPageTest {

    private WebDriver driver;
    private DriverFactory factory = new DriverFactory();
    private LoginPage loginPage;
    private MainPage mainPage;
    private LkPage lkPage;

    @Before
    public void initDriver() {
        factory.initDriver();
        driver = factory.getDriver();
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        lkPage = new LkPage(driver);
    }


    @Test
    @DisplayName("Выход из ЛК")
    @Description("Успешный выход из аккаунта")
    public void exitFromLk() {

        loginPage.userEnter();
        mainPage.CheckLkButton();
        lkPage.exitLk();
    }

}
