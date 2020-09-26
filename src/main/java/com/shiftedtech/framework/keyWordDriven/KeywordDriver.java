package com.shiftedtech.framework.keyWordDriven;

import com.shiftedtech.utils.ExcelReader;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class KeywordDriver {

    KeyWordActionMethod keyWordActionMethod=null;
    protected WebDriver driver=null;

    public KeywordDriver(WebDriver driver) {
        this.driver=driver;
        keyWordActionMethod =new KeyWordActionMethod(driver);
    }

    public void fileExecutor(String fileLocation){
        ExcelReader excelReader=new ExcelReader(fileLocation);
        String [][] excel= excelReader.getExcelSheetData(0);
        System.out.println(Arrays.deepToString(excel));
        for (int i = 1; i < excel.length; i++) {
            System.out.println(Arrays.deepToString(excel[i]));
            KeyWordDrivenLine stepLine = new KeyWordDrivenLine((excel[i]));
            System.out.println(stepLine.toString());
            processKeywordLineItem(stepLine);
        }

    }




    public void processKeywordLineItem(KeyWordDrivenLine keyWordDrivenLine){

        if(keyWordDrivenLine.getAction()!=null){
            String action= keyWordDrivenLine.getAction();
            if (action.toUpperCase().contentEquals("StartBrowser".toUpperCase())){
                keyWordActionMethod.startBrowser(keyWordDrivenLine.getData()[0]);

            }else if (action.toUpperCase().contentEquals("VerifyPageTitle".toUpperCase())){
                keyWordActionMethod.verifyPageTitle(keyWordDrivenLine.getData()[0]);
            }else if (action.toUpperCase().contentEquals("Click".toUpperCase())){
                keyWordActionMethod.click(keyWordDrivenLine.getByLocator());
            }else if (action.toUpperCase().contentEquals("VerifyLoginPageTitle".toUpperCase())){
                keyWordActionMethod.verifyLoginPageTitle(keyWordDrivenLine.getData()[0]);
            }else if (action.toUpperCase().contentEquals("TypeText".toUpperCase())){
               keyWordActionMethod.typeText(keyWordDrivenLine.getByLocator(),keyWordDrivenLine.getData()[0]);
            }else if (action.toUpperCase().contentEquals("VerifyLoginSuccess".toUpperCase())){
                keyWordActionMethod.verifyLoginSuccess(keyWordDrivenLine.getByLocator(),keyWordDrivenLine.getData()[0]);
            }else {
                throw new RuntimeException("Unknown Keyword"+ action);
            }
        }

    }





}
