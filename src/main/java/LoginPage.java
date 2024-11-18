import org.openqa.selenium.By;

public class LoginPage {

    private static final String PAGE_URL = "https://stellarburgers.nomoreparties.site//login";

    //поле Email
    private static final By EMAIL_FIELD = By.xpath("//input[@name='name']");
    //Поле Пароль
    private static final By PASSWORD_FIELD = By.xpath("//input[@name='Пароль']");

    //кнопка Войти
    private static final By ENTER_BUTTON = By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
}
