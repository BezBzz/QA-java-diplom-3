import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordTest {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);
    ForgotPassword forgotPassword = new ForgotPassword(driver);


    @Test
    public void enterOnFormForgotPassword() {
        forgotPassword.checkingEnterLk();
        loginPage.userEnter();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
