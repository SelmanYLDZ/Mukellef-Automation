package com.mukellef.stepdefinations;

import com.mukellef.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  Driver.get().manage().window().maximize();
    }
    @After
    public void tearDown(Scenario scenario){
     /*   if(scenario.isFailed()){
            final byte[] screenshot =((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }*/

        Driver.closeDriver();
    }





}
