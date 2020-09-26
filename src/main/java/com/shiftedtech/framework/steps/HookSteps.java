package com.shiftedtech.framework.steps;

import com.shiftedtech.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java8.En;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class HookSteps extends StepBase implements En {
    private static Logger logger= LoggerFactory.getLogger(HookSteps.class);

    public HookSteps(){

        Before(()->{
            logger.info("SetUp");
            //   private static Logger logger= LoggerFactory.getLogger(StepBase.class)
            driver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver().manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
            driver().manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);

            //   WebDriverWait wait= new WebDriverWait(driver(),10);
        });

        After(()->{
                logger.info("Closing and quitting the driver");
                removeDriver();});

    }

}
