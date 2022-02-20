package com.mukellef.pages;

import com.mukellef.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    @FindBy(xpath = "(//a[@Class='nav-link nuxt-link-exact-active nuxt-link-active'])[1]")
    public WebElement TürkiyeNasılÇalışır;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public  WebElement TürkiyeÖzelikler;

    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public  WebElement TürkiyeFiyatlar;

    @FindBy(xpath = "(//a[@class='nav-link'])[3]")
    public  WebElement TürkiyeBlog;

    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
    public  WebElement TürkiyeDestek;

    @FindBy(xpath = "(//a[@class='nav-link'])[5]")
    public  WebElement TürkiyeMaliMüşavirlerİçin;

    @FindBy(xpath = "(//a[@class='nav-link'])[6]")
    public WebElement GirisYapın;

    @FindBy(xpath = "//select[@id='__BVID__12']")
    public WebElement DilTürkçe;

    @FindBy(xpath = "(//select/option[@value='en'])[2]")
    public WebElement DilEnglish;

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement myUserName;

    /*
    @FindBy(xpath = ("//a[@class='dropdown-toggle nav-link dropdown-user-link dropdown-paddings']")
     public WebElement userAvatar;

    public void waitUntilLoaderScreenDisappear(){
        try{
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
    }Catch (Exception e){
            e.printStackTrace();
    }
            }


    public String getUserName(){
            userAvatar.click();
            return myUserName.getText();

            }

            */
    }

