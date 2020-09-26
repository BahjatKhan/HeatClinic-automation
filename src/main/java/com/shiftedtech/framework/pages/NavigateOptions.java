package com.shiftedtech.framework.pages;

import org.openqa.selenium.WebDriver;

public class NavigateOptions extends BasePage {



    public NavigateOptions(WebDriver driver) {
        super(driver);
    }


    public void back(){
        driver.navigate().back();
    }
    public void forward(){
        driver.navigate().forward();
    }
    public void refresh(){
        driver.navigate().refresh();
    }

}
