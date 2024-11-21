import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPageTest {

    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);
    RegistrationPage registrationPage = new RegistrationPage(driver);

    @Test
    public void enterOnFormRegistration() {
        registrationPage.checkingEnterButton();
        loginPage.userEnter();
    }

    @Test
    public void successRegistration() {
        registrationPage.registrationSuccess();
    }

    @Test
    public void incorrectPasswordOnRegistration() {
        registrationPage.registrationWithPasswordLessSixCharacters();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

