import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LkPageTest {

    WebDriver driver = new ChromeDriver();
    LkPage lkPage = new LkPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    MainPage mainPage = new MainPage(driver);

    @Test
    public void exitFromLk() {

        loginPage.userEnter();
        mainPage.CheckLkButton();
        lkPage.exitLk();
    }

}
