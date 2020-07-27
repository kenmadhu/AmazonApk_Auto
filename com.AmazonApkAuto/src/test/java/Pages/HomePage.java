package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
 
public class HomePage extends BasePage{ 
	//Constructor
    public HomePage (AppiumDriver<MobileElement> driver) {
        super(driver);
    }
 
  
    By signInButtonBy = By.className("btnSignIn");
        
    public LoginPage goToLoginPage (){
        click(signInButtonBy);
        return new LoginPage((AppiumDriver<MobileElement>) driver);
    }
    }