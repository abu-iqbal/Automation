package com.xyz.StepDefinitions;

import com.xyz.Helpers.Components;
import com.xyz.Pages.ProjectPageFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GlobalStepDefinition {

    public static WebDriver driver;
    public static ProjectPageFactory projectPageFactory;
    public static Components comp;

    public void InvokeDriver(String url)
    {
        driver= Hooks.driver;
        comp = new Components();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        projectPageFactory = new ProjectPageFactory(driver);

    }
}
