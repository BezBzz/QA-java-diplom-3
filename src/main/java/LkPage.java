import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LkPage {

    private static final String PAGE_URL = "https://stellarburgers.nomoreparties.site/account/profile";

    //кнопка конструктор
    private static final By BUTTON_CONSTRUCTOR = By.xpath("//a[@class='AppHeader_header__link__3D_hX']");
    //кнопка Stellar Burgers
    private static final By BUTTON_STELLAR = By.xpath("//div[@class='AppHeader_header__logo__2D0X2']");
    //кнопка выйти «Выйти»
    private static final By QUIT = By.xpath("//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']");

    private final WebDriver driver;

    public LkPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыем страницу")
    public void open() {
        driver.get(PAGE_URL);
    }
}
