package com.xyz.Helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    public static String ReadApplicationURL() throws IOException {
        File file = new File("./Data/URL.property");
        FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty("QA");
    }

    public static String ReadBrowserName() throws IOException {
        File file = new File("./Data/Browser.property");
        FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty("Browser");
    }

    public static String[] ReadConfig() throws IOException {
        File file = new File("./Data/Config.property");
        FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fis);
        String uname= prop.getProperty("username");
        String pwd= prop.getProperty("password");
        return new String[]
        {
                uname,pwd
        };
    }



}
