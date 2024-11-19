import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void CheckingLogin() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.userEnter();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
