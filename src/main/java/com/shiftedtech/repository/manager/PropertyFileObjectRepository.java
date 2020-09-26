package com.shiftedtech.repository.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileObjectRepository extends ObjectRepository {

        private static PropertyFileObjectRepository instance;
        Properties properties=null;
        private PropertyFileObjectRepository(){

        }


        public static PropertyFileObjectRepository getInstance(){
            if(instance==null){
                instance=new PropertyFileObjectRepository();
            }
            return instance;
        }

    public void load(String... fileNames){
        for(String fileName : fileNames) {
            System.out.println("Reading file: " + fileName);
            if (new File(fileName).exists()) {
                InputStream input = null;
                try {
                    input = new FileInputStream(fileName);
                    properties.load(input);
                } catch (IOException io) {
                    io.printStackTrace();
                } finally {
                    if (input != null) {
                        try {
                            input.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else {
                throw new RuntimeException("File with the name " + fileName + " does not exist");
            }
        }
    }

    public void reset(){
        properties = new Properties();
    }




    protected String get(String key) {
        String value = properties.getProperty(key);
        return value;
    }
    protected String getLocatorType(String key) {
        String locatorBy = null;
        String value = get(key);
        if(value != null) {
            String parts[] = value.split(":");
            if(parts != null && parts.length > 0){
                locatorBy = parts[0];
            }
            else{
                throw new RuntimeException("There is no by for the key " + key);
            }
        }
        else{
            throw new RuntimeException("There is no locator with the key " + key);
        }

        return locatorBy;
    }
    protected String getLocatorString(String key) {
        String locator = null;
        String value = get(key);
        if(value != null) {
            String parts[] = value.split(":");
            if(parts != null && parts.length > 0) {
                locator = parts[1];
            }
            else{
                throw new RuntimeException("There is no value for the key " + key);
            }
        }
        else{
            throw new RuntimeException("There is no locator with the key " + key);
        }
        return locator;
    }

}

