import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    //адрес главной страницы
    private static final String PAGE_URL = "https://stellarburgers.nomoreparties.site/";
    //кнопка войти в аккаунт
    private static final By ENTER_TO_ACCOUNT = By.xpath("//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']");
    //кнопка личный кабинет
    private static final By LK = By.xpath("//a[@class = 'AppHeader_header__link__3D_hX'][@href='/account']");
    //кнопка конструкотор
    private static final By CONSTRUCTOR = By.xpath("//a[@class='AppHeader_header__link__3D_hX AppHeader_header__link_active__1IkJo']");
    //кнопка булки
    private static final By BUTTON_BUN = By.xpath("//span[@class='text text_type_main-default' and text()='Булки']");
    private static final By FIELD_BUN = By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and text()='Булки']");
    //кнопка соусы
    private static final By BUTTON_SOUSES = By.xpath("//span[@class='text text_type_main-default' and text()='Соусы']");
    private static final By FIELD_SOUSES = By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and text()='Соусы']");
    //кнопка начинки
    private static final By BUTTON_FILLINGS = By.xpath("//span[@class='text text_type_main-default' and text()='Начинки']");
    private static final By FIELD_FILLINGS = By.xpath("//h2[@class='text text_type_main-medium mb-6 mt-10' and text()='Начинки']");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public void open() {
        driver.get(PAGE_URL);
    }

    @Step("Переходим по кнопке войти на главной странице")
    public void CheckEnterButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        driver.findElement(ENTER_TO_ACCOUNT).click();
    }

    @Step("Переходим по кнопке Личный кабинет")
    public void CheckLkButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        driver.findElement(LK).click();
    }

    @Step("Переходим в конструктор")
    public void checkConstructorButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        driver.findElement(CONSTRUCTOR).click();
    }

    @Step("Переходим в булки")
    public void checkBunButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        driver.findElement(BUTTON_FILLINGS).click();
        driver.findElement(BUTTON_BUN).click();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(FIELD_BUN));
    }

    @Step("Переходим в соусы")
    public void checkSousesButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        driver.findElement(BUTTON_SOUSES).click();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(FIELD_SOUSES));
    }

    @Step("Переходим в соусы")
    public void checkFilingsButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25));
        open();
        driver.findElement(BUTTON_FILLINGS).click();
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(FIELD_FILLINGS));
    }

}
