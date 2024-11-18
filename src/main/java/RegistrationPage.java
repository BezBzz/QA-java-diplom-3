import org.openqa.selenium.By;

public class RegistrationPage {

    //адрес страницы регистрации
    private static final String PAGE_URL = "https://stellarburgers.nomoreparties.site/register";

    //кнока регистрация

    //поле Имя
    private static final By NAME_FIELD = By.xpath("//input[@class='text input__textfield text_type_main-default'][@name='name'][1]");
    //поле Пароль
    private static final By EMAIL_FIELD = By.xpath("//input[@class='text input__textfield text_type_main-default'][@name='name'][2]");
    //поле Email
    private static final By PASSWORD_FIELD = By.xpath("//input[@class='text input__textfield text_type_main-default'][@name='Пароль']");

}
