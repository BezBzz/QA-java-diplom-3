import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LkPage {

    private static final String PAGE_URL = "https://stellarburgers.nomoreparties.site/account/profile";

    //кнопка конструктор
    private static final By BUTTON_CONSTRUCTOR = By.xpath("//a[@class='AppHeader_header__link__3D_hX']");
    //кнопка Stellar Burgers
    private static final By BUTTON_STELLAR = By.xpath("//div[@class='AppHeader_header__logo__2D0X2']");
    //кнопка выйти «Выйти»
    private static final By QUIT = By.xpath("//button[text()='Выход']");
    //кнопка войти после выхода
    private static final By ENTER_BUTTON = By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");

    private final WebDriver driver;

    public LkPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открыем страницу")
    public void open() {
        driver.get(PAGE_URL);
    }

    @Step("Нажимаем Выход")
    public void clickExitButton() {
        driver.findElement(QUIT).click();
    }


    @Step("Выходим из ЛК")
    public void exitLk() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        clickExitButton();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(ENTER_BUTTON));

    }

}