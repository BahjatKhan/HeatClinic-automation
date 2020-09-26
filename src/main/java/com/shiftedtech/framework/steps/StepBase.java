package com.shiftedtech.framework.steps;

import com.shiftedtech.framework.pages.ApplicationController;
import com.shiftedtech.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StepBase {

 private static Logger logger=LoggerFactory.getLogger(StepBase.class);

   protected WebDriver driver(){

       return DriverFactory.getInstance("CHROME").getDriver();
    }

    protected void removeDriver(){
       DriverFactory.getInstance().removeDriver();
    }

   //WebDriverWait wait= new WebDriverWait(driver(),10);

    protected ApplicationController heatClinic(){
        return new ApplicationController(DriverFactory.getInstance().getDriver());
    }


    protected void delay(int milisec){
        try {
            Thread.sleep(milisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
