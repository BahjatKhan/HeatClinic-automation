package com.shiftedtech.BDDRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      // dryRun = true,
       // tags={"@Debug"},
  //      features ="src/test/resources/features/HeatClinicMerchandiseFunctionality.feature/",
        features="src/test/resources/features/HeatClinicClearanceFunctionality.feature",
        glue={"com.shiftedtech.framework.steps"},
        plugin={"junit:target/cucumber-report/xml/test-report.xml",
                "json:target/cucumber-report/json/cucumber-report.json",
                "html:target/cucumber-report/plain"}
                )
public class BDDRunner {

}

