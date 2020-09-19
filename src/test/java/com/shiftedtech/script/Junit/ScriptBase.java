package com.shiftedtech.script.Junit;

import com.shiftedtech.framework.pages.ApplicationController;
import com.shiftedtech.utils.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScriptBase {

    private ThreadLocal<ApplicationController> HeatClinicCollection =new ThreadLocal<>();
    @Before
    public void SetUp(){
        driver().navigate().to("http://heatclinic.shiftedtech.com/");
        driver().manage().window().maximize();
        HeatClinicCollection.set(new ApplicationController(driver()));
    }

    @After
    public void tearDown(){
        DriverFactory.getInstance().removeDriver();
    }
        //"CHROME-HEADLESS"
    protected WebDriver driver(){
        return DriverFactory.getInstance().getDriver();
    }
    protected ApplicationController HeatClinic(){
        return HeatClinicCollection.get();
    }

}
