import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends MainPage {

    @FindBy (name = "username") private WebElement loginUsername;
    @FindBy (name = "password") private WebElement loginPassword;
    @FindBy (xpath = "/html/body/div/form/div/button") private WebElement loginButton;
    @FindBy (css = "body > nav > div > ul > a") private WebElement logoutButton;

    public Login(WebDriver driver) {
    	
    	super(driver);
    	}
    
    public void enterUsername(String username) { 
    	
    	loginUsername.sendKeys(username); 
    	}
    
    public void enterPassword(String password) { 
    	
    	loginPassword.sendKeys(password); 
    	}
    
    public void clickOnSubmit() { 
    	
    	loginButton.click(); 
    	}
    
    public void clickOnLogout() { 
    	
    	logoutButton.click(); 
    	}
    
}