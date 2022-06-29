import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
    
	public String userName = "useris6";
    public String goodPassword = "slaptazhodis2";
    public String badPassword = "blogas_slaptikas";
    public static WebDriver driver;

    @BeforeAll
    static void setup() {
       
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/skaiciuokle");
    }

    @AfterAll
    static void quitChrome() {
        
    	driver.quit();
    }
    
}