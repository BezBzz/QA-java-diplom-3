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

}
