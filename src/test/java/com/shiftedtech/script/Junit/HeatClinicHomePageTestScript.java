package com.shiftedtech.script.Junit;

import com.shiftedtech.repository.manager.PropertyFileObjectRepository;
import com.shiftedtech.repository.serviceRequirementSpecification.IObjectRepository;
import org.junit.Test;

public class HeatClinicHomePageTestScript extends ScriptBase {


    @Override
    public void SetUp(){
        super.SetUp();
        IObjectRepository ob= PropertyFileObjectRepository.getInstance();
        ob.reset();
        ob.load(System.getProperty("user.dir")+"/src/main/resources/HeatClinicHomePageLocatorRepos.properties");
    }


    @Test
    public void test1() throws InterruptedException {
        HeatClinic().getHomePage().verifyHomePage("");
        HeatClinic().getHomePage().ClickOnShopAllApparel();
        HeatClinic().getNavigateOptions().back();
        Thread.sleep(5000);
    }

    @Test
    public void test2(){

    }


}
