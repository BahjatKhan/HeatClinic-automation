package com.shiftedtech.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollPage extends BasePage {
    public ScrollPage(WebDriver driver) {
        super(driver);
    }

    public void up(String scroll){
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript(scroll);
    }
    public void down(String scroll){
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript(scroll);
    }
}
