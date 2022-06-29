import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    
	protected WebDriver driver;

    public MainPage(WebDriver driver) {
        
    	this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
}