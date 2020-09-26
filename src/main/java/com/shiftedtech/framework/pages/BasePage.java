package com.shiftedtech.framework.pages;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver=null;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    protected void delay(int milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        protected Boolean checkElement(WebElement element ){

            if((element!=null)&&(element.isDisplayed()))
                    return true;
            else
                System.out.println("Element is not Found!");


            return false;
        }
    }


