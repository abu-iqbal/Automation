package com.xyz.StepDefinitions;

import com.xyz.Helpers.ReadPropertyFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void openBrowser(Scenario scenario) throws IOException {
        String browserName = ReadPropertyFile.ReadBrowserName();
        if(browserName.equalsIgnoreCase("Chrome"))
        {
            File file = new File("./Drivers/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("Firefox"))
        {
            File file = new File("./Drivers/geckodriver.exe");
            System.setProperty("webdriver.gecko.driver",file.getAbsolutePath());
            driver = new ChromeDriver();
        }
    }
    @After
    public void closeBrowserAndEmbedScreenshot(Scenario scenario) throws IOException {
        if(scenario.isFailed())
        {
           try
           {
            String name=scenario.getName();
               TakesScreenshot scrShot =((TakesScreenshot)driver);
               File Location=scrShot.getScreenshotAs(OutputType.FILE);
               FileUtils.copyFile(Location,new File("./Screenshots"+ scenario.getName()+".png"));
               final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
               scenario.attach(screenshot, "image/png", name);
           }
           catch(Exception e)
           {
               System.out.println("Unable to get screenshot"+e.getMessage());
           }
           finally {
               driver.quit();
           }
        }
        else
        {
            driver.quit();
        }
    }
}
