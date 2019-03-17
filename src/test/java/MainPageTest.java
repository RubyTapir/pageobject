import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    /*@BeforeClass //выполняется перед всеми методами
    public void beforeClassMethod() {

    }*/

    @Before //выполняется перед каждым тестовым методом
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        mainPage = new MainPage(driver);
    }

    @Test
    public void signInTest() {
        LoginPage loginPage = mainPage.clickSignIn();
        String heading = loginPage.getHeadingText();
        Assert.assertEquals("Sign in to GitHub", heading);
    }


    @After //выполняется после каждого тестового метода
    public void tearDown() {
        driver.quit();
    }

    /*@AfterClass //выполняется после всех методов
    public void afterClassMethod() {

    }*/
}
