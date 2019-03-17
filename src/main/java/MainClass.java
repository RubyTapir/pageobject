import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {

    static WebDriver driver;

    public static void main(String[] args) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tapir\\Documents\\GitHub\\testselenium\\drivers\\geckodriver.exe");

            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://github.com/");
            MainPage mainPage = new MainPage(driver);

            mainPage.register("testusername", "yyye@jj.com", "ujjggfg");
        }
    }
