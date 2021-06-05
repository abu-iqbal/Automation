package com.xyz.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class FirstTestRun {

     public static void main(String[] args) {

         File file = new File("./Drivers/chromedriver.exe");
                 System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
         WebDriver driver =  new ChromeDriver();
         driver.get("http://saucelabs.com");
                 System.out.println("The page Title is:- "+driver.getTitle());
         driver.close();
    }
}
