package com.xyz.Helpers;

import com.xyz.StepDefinitions.GlobalStepDefinition;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Components extends GlobalStepDefinition
{
    // common method to get the Alert Text
    public String getAlertText()
    {
        Alert alt = driver.switchTo().alert();
        return alt.getText();
    }
    //Common method to select the dropdown by select class index method
    public void select(WebElement selElement, int index)
    {
        Select sel = new Select(selElement);
        sel.selectByIndex(index);
    }
    //Common to enter text in the text fields
    public void enterText(WebElement selElement, String value)
    {
        selElement.click();
        selElement.sendKeys(value);
    }
}
