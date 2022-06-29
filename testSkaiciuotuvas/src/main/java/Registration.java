import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends MainPage {

    @FindBy (id = "username") private WebElement registerUsername;
    @FindBy (id = "password") private WebElement registerPassword;
    @FindBy (id = "passwordConfirm") private WebElement passwordConfirmField;
    @FindBy (xpath = "/html/body/div/form/button") private WebElement registerButton;

    public Registration(WebDriver driver) {
    	
    	super(driver);
    	}
    
    public void enterUsername(String username) {
    	
    	registerUsername.sendKeys(username);
    	}
    
    public void enterPassword(String password) {
    	
    	registerPassword.sendKeys(password);
    	}
    
    public void enterPasswordConfirm(String passwordConfirm) {
    	
    	passwordConfirmField.sendKeys(passwordConfirm);
    	}
    
    public void clickOnSubmit() {
    	
    	registerButton.click();
    	}
    
}