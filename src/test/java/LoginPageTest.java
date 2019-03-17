import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before //выполняется перед каждым тестовым методом
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginWithEmptyCredsTest() {
        LoginPage newLoginPage = loginPage.logInWithInvalidCreds("", "");
        String error = newLoginPage.getErrorText(); //создаём переменную error
        Assert.assertEquals("Incorrect username or password.", error); //сравниваем значение из переменной error с текстом
    }

    @After //выполняется после каждого тестового метода
    public void tearDown() {
        driver.quit();
    }
}



