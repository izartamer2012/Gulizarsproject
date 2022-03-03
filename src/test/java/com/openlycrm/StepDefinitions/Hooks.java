package com.openlycrm.StepDefinitions;


import com.openlycrm.Utilities.BrowserUtils;
import com.openlycrm.Utilities.ConfigurationReader;
import com.openlycrm.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setup() {


        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement user = Driver.get().findElement(By.name("USER_LOGIN"));
        user.sendKeys(ConfigurationReader.get("username"));

        WebElement pass = Driver.get().findElement(By.name("USER_PASSWORD"));
        pass.sendKeys(ConfigurationReader.get("password"));

        WebElement click = Driver.get().findElement(By.className("login-btn"));
        click.click();

        WebElement moreTab=Driver.get().findElement(By.id("feed-add-post-form-link-text"));
        moreTab.click();


        WebElement appreciation=Driver.get().findElement(By.xpath("(//*[@class='menu-popup-item-text'])[2]"));
        appreciation.click();
    }

  //  public void login(String username, String password) {
  //      username.sendKeys(username);
   //     password.sendKeys(password);
    //    submit.click();
        // verification that we logged
    //}




    @After
    public void tearDown(){

        Driver.closeDriver();
    }

}

