package com.xyz.Pages;

import com.xyz.StepDefinitions.GlobalStepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends GlobalStepDefinition {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "email")
    WebElement username;

    @FindBy(how = How.ID, using = "passwd")
    WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement btnSignIn;

    @FindBy(how = How.ID, using = "SubmitLogin")
    WebElement btnSubmit;



   public  LoginPage(WebDriver driver)
   {
       this.driver = driver;
       PageFactory.initElements(driver,this);
   }

   public void login(String uname, String pwd)
   {
       btnSignIn.click();
       username.clear();
       username.sendKeys(uname);
       password.clear();
       password.sendKeys(pwd);
       btnSubmit.click();
   }
    public String getPageTitle(){
        String title = driver.getTitle();
        System.out.println("The page title is:- "+title);
        return title;
    }
}
