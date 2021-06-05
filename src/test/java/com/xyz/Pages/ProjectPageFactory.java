package com.xyz.Pages;

import org.openqa.selenium.WebDriver;

public class ProjectPageFactory {
    public final LoginPage loginpage;

    public ProjectPageFactory(WebDriver driverInstance)
    {
        loginpage = new LoginPage(driverInstance);
    }

}
