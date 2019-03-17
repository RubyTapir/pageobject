import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SignUpPageTest {

    WebDriver driver;
    SignUpPage signUpPage;

    @Before //выполняется перед каждым тестовым методом
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/join?source=experiment-header-dropdowns-home");
        signUpPage = new SignUpPage(driver);
    }

    //здесь должен быть какой-нибудь тест:)

    @After //выполняется после каждого тестового метода
    public void tearDown() {
        driver.quit();
    }
}
