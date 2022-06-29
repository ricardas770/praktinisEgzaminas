import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class ToLogin extends MainTest {

    Login LoginPage = new Login(driver);

    @Test
    void loginUsingValidData() {
      
    	LoginPage.enterUsername(userName);
        LoginPage.enterPassword(goodPassword);
        LoginPage.clickOnSubmit();
        String URL = driver.getCurrentUrl();
        Assertions.assertEquals(URL, "http://localhost:8080/skaiciuokle", "Failed to login");
    }

    @Test
    void userCannotLoginWithInvalidData() {
       
    	LoginPage.enterUsername(userName);
        LoginPage.enterPassword(badPassword);
        LoginPage.clickOnSubmit();
        WebElement incorrectPassword = driver.findElement(By.cssSelector("body > div > form > div > button"));
        Assertions.assertTrue(incorrectPassword.isDisplayed(), "Registered with invalid password!");
    }

}