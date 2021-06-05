package com.xyz.StepDefinitions;

import com.xyz.Helpers.ReadPropertyFile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef extends GlobalStepDefinition{

    @Given("^user launches the application with valid credentials$")
    public void user_launches_the_application_with_valid_credentials() throws Throwable {
        String username;
        String password;
InvokeDriver(ReadPropertyFile.ReadApplicationURL());
String[] credentials = ReadPropertyFile.ReadConfig();
username = credentials[0]+"@gmail.com";
        password= credentials[1];
projectPageFactory.loginpage.login(username,password);
    }

    @Given("^verify the homepage is loaded$")
    public void verify_the_homepage_is_loaded() throws Throwable {
      //  Assert.assertTrue(projectPageFactory.loginpage.getPageTitle().compareToIgnoreCase());


    }

    @Given("verify the homepage {string} is loaded with the tile")
    public void verify_the_homepage_is_loaded_with_the_tile(String arg1) {
        Assert.assertTrue(projectPageFactory.loginpage.getPageTitle().contentEquals(arg1));
    }

}
