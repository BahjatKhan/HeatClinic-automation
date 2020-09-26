package com.shiftedtech.framework.keyWordDriven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KWScriptBase {
    protected WebDriver driver=null;
    protected String keywordFileName=null;
    private KeywordDriver keywordDriver=null;

    @Before
    public void setUp(){
      //  keywordDriver= System.getProperty("user.dir")+"/src/main/resources/repositoryfiles/keywordFiles/keywordScriptValue.xlsx";
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        keywordDriver = new KeywordDriver(driver);

    }


    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    public void setKeywordFile(String fileName) {
        this.keywordFileName = System.getProperty("user.dir")+"/src/main/resources/repositoryfiles/keywordFiles/"+fileName;
    }

    public void getKeywordFile(){
        keywordDriver.fileExecutor(keywordFileName);
    }

}
