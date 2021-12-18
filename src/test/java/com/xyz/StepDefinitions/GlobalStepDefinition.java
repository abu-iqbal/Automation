package com.xyz.StepDefinitions;

import com.xyz.Helpers.Components;
import com.xyz.Pages.ProjectPageFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GlobalStepDefinition {

    public static WebDriver driver;
    public static ProjectPageFactory projectPageFactory;
    public static Components comp;

    public void InvokeDriver(String url) throws InterruptedException
    {
        driver= Hooks.driver;  // assigning the diver to hooks driver which launches the browser
        comp = new Components();

        if(driver !=null) {

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
            driver.manage().window().maximize();
            driver.get(url);
            projectPageFactory = new ProjectPageFactory(driver);  // Initiates all pageclasses
            //DriverWaitUtility.waitForPageLoad(driver);
        }
        else
        {
            System.out.println("Driver is null:-");
        }
    }
}
