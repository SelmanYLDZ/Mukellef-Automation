package com.mukellef.pages;

import com.mukellef.utilities.ConfigurationReader;
import com.mukellef.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name="email")
    public WebElement UserNameInput;

    @FindBy(name="password2")
    public WebElement PassWordInput;

    @FindBy(name="process")
    public WebElement SubmitButton;

    public void login(String username,String password){
        UserNameInput.sendKeys(username);
        PassWordInput.sendKeys(password);
        SubmitButton.click();
    }
    public void loginWithValid(){
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        UserNameInput.sendKeys(username);
        PassWordInput.sendKeys(password);
        SubmitButton.click();
    }
}
