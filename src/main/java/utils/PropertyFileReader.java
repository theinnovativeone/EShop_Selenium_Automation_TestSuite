package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

    static String getValue = "";

    public static String getTestData(String key){

        String filename = System.getProperty("user.dir") + "\\src\\main\\resources\\testData.properties";

        File file = new File(filename);
        FileInputStream fis = null;
        Properties prop = null;

        try{
            fis = new FileInputStream(file);
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        getValue = prop.getProperty(key);
        return getValue;
    }

    public static String getConfigData(String key){
        String filename = System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties";

        File file = new File(filename);
        FileInputStream fis = null;
        Properties prop = null;

        try{
            fis = new FileInputStream(file);
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        getValue = prop.getProperty(key);
        return getValue;
    }

}
