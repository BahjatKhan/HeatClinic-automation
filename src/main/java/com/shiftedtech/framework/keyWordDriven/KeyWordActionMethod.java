package com.shiftedtech.framework.keyWordDriven;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class KeyWordActionMethod {

    protected WebDriver driver=null;

    public KeyWordActionMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void startBrowser(String url){
        if(url!=null){
            System.out.println("Navigate Url :"+ url);
            driver.navigate().to(url);
        }else {
            throw new RuntimeException("Url is null");
        }
    }

    public void verifyPageTitle(String expectedTitle){
        verifyMessage(expectedTitle);
    }

    public void click(By by){
        WebElement element= driver.findElement(by);
        element.click();
    }

    public void verifyLoginPageTitle(String expectedTitle){
        verifyMessage(expectedTitle);
    }

    public void typeText(By by,String value){
        WebElement element=driver.findElement(by);
        element.sendKeys(value);
    }
    public void verifyLoginSuccess(By by,String expectedTitle){
        if(expectedTitle != null) {
            System.out.println("verifyText to :" + expectedTitle);
            WebElement element = driver.findElement(by);
            String actualText = element.getText();
            Assert.assertEquals(expectedTitle, actualText);
        }

    }
    private void verifyMessage(String expectedTitle){
        if(expectedTitle!=null){
            System.out.println("Expected title :"+ expectedTitle);
            String actualTitle= driver.getTitle();
            if(actualTitle!=null) {
                try{
                assertThat(actualTitle, is(equalToIgnoringCase(expectedTitle)));}
                catch (AssertionError ass){
                    System.out.println("Assertion error : "+actualTitle);

                }
            }else{
                System.out.println("Actual title is not found :"+actualTitle);
            }
        }else {
            throw new RuntimeException("Expected Title is null !");
        }
    }

}
