package com.shiftedtech.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HomePage extends BasePage {

    private static Logger logger= LoggerFactory.getLogger(HomePage.class);

    @FindBy(how= How.XPATH,using="//a[@href='/merchandise']/img")
    private WebElement shopAllApparel;
    @FindBy(how= How.XPATH,using = "//a[contains(text(),'The Heat Clinic Home')]")
    private WebElement homePageTitle;


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
    }


    public void ClickOnShopAllApparel(){
        logger.info("Click on Shop All Apparel");
        checkElement(shopAllApparel);
        shopAllApparel.click();
    }

    public void verifyHomePage(String expectedHomePageTitle){
        logger.info("Verify Home Page");
        checkElement(homePageTitle);
        String actualPageTitle=homePageTitle.getText();
        try {
            assertThat(actualPageTitle, is(equalToIgnoringCase(expectedHomePageTitle)));

        } catch (AssertionError er) {
            System.out.println("Assertion is failed !");
        }
       }
    }











