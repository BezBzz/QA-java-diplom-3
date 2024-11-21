import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageTest {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);
    MainPage mainPage = new MainPage(driver);


    @Test
    public void enterToAccount() {
        mainPage.CheckEnterButton();
        loginPage.userEnter();
    }

    @Test
    public void enterToLk() {
        mainPage.CheckLkButton();
        loginPage.userEnter();
    }

    @Test
    public void transitionBunInConstructor() {
        mainPage.checkBunButton();
    }

    @Test
    public void transitionSousesInConstructor() {
        mainPage.checkSousesButton();
    }

    @Test
    public void transitionFillingInConstructor() {
        mainPage.checkFilingsButton();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
