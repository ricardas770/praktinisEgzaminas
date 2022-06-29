import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class ToRegister extends MainTest {

    Registration register = new Registration(driver);

    @Test
    void registrationAvailableUsingValidData() {
       
    	driver.get("http://localhost:8080/registruoti");
        register.enterUsername(userName);
        register.enterPassword(goodPassword);
        register.enterPasswordConfirm(goodPassword);
        register.clickOnSubmit();
        String URL = driver.getCurrentUrl();
        Assertions.assertEquals(URL, "http://localhost:8080/skaiciuotuvas", "Registration failed");
    }

    @Test
    void registrationNonAvailableUsingInvalidData() {
       
    	driver.get("http://localhost:8080/registruoti");
        register.enterUsername(userName);
        register.enterPassword(goodPassword);
        register.enterPasswordConfirm(badPassword);
        register.clickOnSubmit();
        WebElement incorrectPassword = driver.findElement(By.id("passwordConfirm.errors"));
        Assertions.assertTrue(incorrectPassword.isDisplayed(), "Password used for registration is non-suitable");
    }
    
}