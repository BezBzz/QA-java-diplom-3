import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MainPageTest {
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
    }


    @Test
    @DisplayName("Вход  аккаунт")
    @Description("Успешный вход в аккаунт")
    public void enterToAccount() {
        mainPage.CheckEnterButton();
        loginPage.userEnter();
    }

    @Test
    @DisplayName("Вход  через ЛК")
    @Description("Успешный вход в аккаунт через кнопку ЛК")
    public void enterToLk() {
        mainPage.CheckLkButton();
        loginPage.userEnter();
    }

    @Test
    @DisplayName("Переход к булкам в конструкторе")
    @Description("Успешный переход по конструктору")
    public void transitionBunInConstructor() {
        mainPage.checkBunButton();
    }

    @Test
    @DisplayName("Переход к соусам в конструкторе")
    @Description("Успешный переход по конструктору к соусам")
    public void transitionSousesInConstructor() {
        mainPage.checkSousesButton();
    }

    @Test
    @DisplayName("Переход к ингредиентам в конструкторе")
    @Description("Успешный переход по конструктору к ингредиентам")
    public void transitionFillingInConstructor() {
        mainPage.checkFilingsButton();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
