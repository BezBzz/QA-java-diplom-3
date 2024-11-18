import org.openqa.selenium.By;

public class MainPage {

    //адрес главной страницы
    private static final String PAGE_URL = "https://stellarburgers.nomoreparties.site/";
    //кнопка войти в аккаунт
    private static final By ENTER_TO_LK = By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");
    //кнопка личный кабинет
    private static final By LK = By.xpath("//a[@class = 'AppHeader_header__link__3D_hX'][@href='/account']");
    //кнопка конструкотор
    private static final By CONSTRUCTOR = By.xpath("//a[@class='AppHeader_header__link__3D_hX AppHeader_header__link_active__1IkJo']");
    //кнопка булки
    private static final By BUTTON_BUN = By.xpath("");
    //кнопка соусы
    private static final By BUTTON_SOUSES = By.xpath("");
    //кнопка начинки
    private static final By BUTTON_FILLINGS = By.xpath("");
}
