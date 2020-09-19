package com.shiftedtech.script.Junit;

import com.shiftedtech.repository.locatorClass.HeatClinic;
import cucumber.api.java8.He;
import org.junit.Test;

public class HeatClinicMerchandiseWomenSectionTestScript extends ScriptBase {


    public void backGround(String expectedHomePage){
        HeatClinic().getHomePage().verifyHomePage(expectedHomePage);
        HeatClinic().getMerchandiseWomensPage().mouseHoverAndClickOnWomenSection();
        HeatClinic().getMerchandiseWomensPage().verifyMerchandisePage();
    }

    @Test
    public void verifyProduct(){
        backGround("The Heat Clinic Home");
        HeatClinic().getMerchandiseWomensPage().verifyMerchandisePage();
        HeatClinic().getMerchandiseWomensPage().verifyProducts();
    }

    @Test
    public void verifyVisibilityOfProductNamesAndPriceTagForHawtHabaneroProduct(){
        backGround("The Heat Clinic Home");
        HeatClinic().getMerchandiseWomensPage().verifyHawtLikeAHabaneroShirtTitle();
        HeatClinic().getMerchandiseWomensPage().verifyPriceHawtLikeAHabaneroShirtOnMerchandisePage();
    }
    @Test
    public void verifyDescriptionForHawtHabaneroProduct(){
        backGround("The Heat Clinic Home");
        HeatClinic().getMerchandiseWomensPage().verifyDescriptionForHawtHabaneroShirt();
    }

    @Test
    public void clickOnImageLinkHabaneroAndVerifyPrice(){
        backGround("The Heat Clinic Home");
        HeatClinic().getMerchandiseWomensPage().ImagePageLinkHabaneroShirt();
        HeatClinic().getMerchandiseWomensPage().verifyHawtHabaneroTilteOnHabaneroPage();
        HeatClinic().getMerchandiseWomensPage().verifyPriceForHabaneroProductOnHabaneroPage();
    }


}
