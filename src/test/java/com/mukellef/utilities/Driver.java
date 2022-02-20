package com.mukellef.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
public class Driver {
    private Driver() {
    }
    //private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();
    // private static ThreadLocal<WebDriver> driverPool= new ThreadLocal<>();


    public static WebDriver driver;
    public static WebDriver get(){
        if(driver == null){
            String browser;
            browser = ConfigurationReader.get("browser");
            switch (browser) {
                case "chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                case "firefox-headless" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                }
                case "ie" -> {
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                }
                case "edge" -> {
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support edge");
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
                case "safari" -> {
                    if (!System.getProperty("os.name").toLowerCase().contains("mac"))
                        throw new WebDriverException("Your OS doesn't support safari");
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                }
            }
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver!= null){
            driver.quit();
            driver = null;
        }
    }
}