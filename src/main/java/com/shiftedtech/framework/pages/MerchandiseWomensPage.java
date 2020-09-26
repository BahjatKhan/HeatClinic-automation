package com.shiftedtech.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class MerchandiseWomensPage extends BasePage {

    private static Logger logger= LoggerFactory.getLogger(MerchandiseWomensPage.class);


    @FindBy(how= How.XPATH,using="//span[text()='Merchandise']")
    @CacheLookup//Only for static pages//Not for javascript based pages
    private WebElement merchandiseButton;

    @FindBy(how= How.XPATH,using="//a[text()='Womens']")
    @CacheLookup
    private WebElement womenSectionButton;

    @FindBy(how =How.XPATH,using = "//section[contains(@id,'left_column')]/header/h1")
    private WebElement verifyProduct;
    @FindBy(how=How.XPATH,using ="//div[contains(text(),'Hawt')]")
    private WebElement verifyHawtHabanero;
    @FindBy(how = How.XPATH,using ="//div[contains(text(),'$14.99')]")
    private WebElement priceTagForHawtHabaneroOnMerchandisePage;
    @FindBy(how =How.XPATH,using ="(//div[@class='content']/p)[1]")
    private WebElement description;
    @FindBy(how=How.XPATH,using = "//img[contains(@alt,'Hawt')]")
    private WebElement HawtHabaneroImagePageLink;
    @FindBy(how=How.XPATH,using = "//h2[contains(text(),'Hawt')]")
    private WebElement HawtHabaneroPageTitle;
    @FindBy(how=How.XPATH,using = "//div[contains(text(),'$14.99')]")
    private WebElement priceTagForHawtHabaneroProductOnHabaneroPage;



    public MerchandiseWomensPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
    }

    public void mouseHoverAndClickOnWomenSection(){
        logger.info("Mouse Hover And Click On Women Section");
        Actions act= new Actions(driver);
        checkElement(merchandiseButton);
        act.moveToElement(merchandiseButton).perform();
        womenSectionButton.click();

    }
    public void verifyMerchandisePage(){
        logger.info("Verify Merchandise Page");
      //  String actualPageTitle=driver.getTitle();
        String actualPage=driver.getTitle();
        String expectedPage="";
        try {
            assertThat(actualPage, is(equalToIgnoringCase(expectedPage)));
        } catch (AssertionError er) {
            System.out.println("Assertion failed !");
            System.out.println("Actual Page for merchandise page :"+actualPage);
        }
    }

    public void verifyProducts(){
        logger.info("Verify Products");
        checkElement(verifyProduct);
        String actualPage=verifyProduct.getText();
        String expectedPage="";
        try {
            assertThat(actualPage, is(equalToIgnoringCase(expectedPage)));
        } catch (AssertionError er) {
            System.out.println("Assertion failed !");
            System.out.println("Product showing for merchandise page :"+actualPage);
        }
    }
    public void verifyHawtLikeAHabaneroShirtTitle(){
        logger.info("Verify Hawt Like A Habanero Shirt Title");
        checkElement(verifyHawtHabanero);
        String actualPage=verifyHawtHabanero.getText();
        String expectedPage="";
        try {
            assertThat(actualPage, is(equalToIgnoringCase(expectedPage)));
        } catch (AssertionError er) {
            System.out.println("Assertion failed !");
            System.out.println("Hawt habanero Product title :"+actualPage);
        }
    }
    public void verifyPriceHawtLikeAHabaneroShirtOnMerchandisePage(){
        checkElement(priceTagForHawtHabaneroOnMerchandisePage);
        String actualPage=priceTagForHawtHabaneroOnMerchandisePage.getText();
        String expectedPage="$14.99";
        try {
            assertThat(actualPage, is(equalToIgnoringCase(expectedPage)));
        } catch (AssertionError er) {
            System.out.println("Assertion failed !");
            System.out.println("Hawt habanero Product price :"+actualPage);
        }

    }

    public void verifyDescriptionForHawtHabaneroShirt(){
        checkElement(description);
        String actualPage=description.getText();
        String expectedPage="";
        try {
            assertThat(actualPage, is(equalToIgnoringCase(expectedPage)));
        } catch (AssertionError er) {
            System.out.println("Assertion failed !");
            System.out.println("Description for Hawt Habareno page :"+actualPage);
        }
    }

    public void ImagePageLinkHabaneroShirt(){
        checkElement(HawtHabaneroImagePageLink);
        HawtHabaneroImagePageLink.click();
    }

    public void verifyHawtHabaneroTilteOnHabaneroPage(){
        checkElement(HawtHabaneroPageTitle);
        HawtHabaneroPageTitle.click();
    }

    public void verifyPriceForHabaneroProductOnHabaneroPage(){
        checkElement(priceTagForHawtHabaneroProductOnHabaneroPage);
        String actualPage=priceTagForHawtHabaneroProductOnHabaneroPage.getText();
        String expectedPage="$14.99";
        try {
            assertThat(actualPage, is(equalToIgnoringCase(expectedPage)));
        } catch (AssertionError er) {
            System.out.println("Assertion failed !");
            System.out.println("Actual price for Hawt Habareno page :"+actualPage);
        }
    }

}
