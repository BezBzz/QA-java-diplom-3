import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    //адрес страницы регистрации
    private static final String PAGE_URL = "https://stellarburgers.nomoreparties.site/register";

    //кнока войти
    private static final By BUTTON_ENTER = By.xpath("//a[@class='Auth_link__1fOlj']");
    //поле Имя
    private static final By NAME_FIELD = By.xpath("//input[@class='text input__textfield text_type_main-default'][@name='name'][1]");
    //поле Пароль
    private static final By EMAIL_FIELD = By.xpath("//input[@class='text input__textfield text_type_main-default'][@name='name'][2]");
    //поле Email
    private static final By PASSWORD_FIELD = By.xpath("//input[@class='text input__textfield text_type_main-default'][@name='Пароль']");

    private final WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыем страницу")
    public void open() {
        driver.get(PAGE_URL);
    }

}
