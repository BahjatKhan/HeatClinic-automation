package com.shiftedtech.framework.pages;

import org.openqa.selenium.WebDriver;

public class ApplicationController {

    WebDriver driver;
    private HomePage homePage;
    private NavigateOptions navigateOptions;
    private MerchandiseWomensPage merchandiseWomensPage;

    public ApplicationController(WebDriver driver){

        this.driver=driver;

    }

    public HomePage getHomePage(){
        if(homePage==null)
            homePage=new HomePage(driver);

        return homePage;
    }

    public NavigateOptions getNavigateOptions(){
        if(navigateOptions==null)
            navigateOptions=new NavigateOptions(driver);

        return navigateOptions;
    }

    public MerchandiseWomensPage getMerchandiseWomensPage(){
        if(merchandiseWomensPage==null)
            merchandiseWomensPage=new MerchandiseWomensPage(driver);

        return merchandiseWomensPage;
    }

}
