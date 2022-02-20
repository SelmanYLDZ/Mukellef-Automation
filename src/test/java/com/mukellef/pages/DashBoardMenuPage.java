package com.mukellef.pages;

import com.mukellef.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import java.util.List;



public class DashBoardMenuPage extends BasePage{
    public DashBoardMenuPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "class='nav-link nav-left-icon menu-toggle hidden-xs text-white is-active'")
    public static WebElement DashBoardMenu;



}
