/*package com.testapp.utils;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	// Create WebDriver instance
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        // Initialize the WebDriver instance using FirefoxDriver and launch the web browser
        driver = new FirefoxDriver();
        // Open the application - "https://login.yahoo.com/"
        driver.get("http://localhost:8082/MercuryAppInterface/admin");
        // Maximize the current window
        //driver.manage().window().maximize();
    }
    @Test
    public void testYahooInvalidLogin() throws Exception {
    	// Initialize the WebDriver instance using FirefoxDriver and launch the web browser
    	//WebDriver driver = new FirefoxDriver();
        // Open the application - "https://login.yahoo.com/"
        //driver.get("http://localhost:8082/MercuryAppInterface/admin");
        // Maximize the current window
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //driver.switchTo().frame(0);
        driver.findElement(By.name("username")).sendKeys("dks");
        driver.findElement(By.name("password")).sendKeys("dks123");
        driver.findElement(By.name("submit")).click();
        //driver.findElement(By.xpath("//a[@class='pull-right login-btn hidden-xs']")).click();
        //driver.findElement(By.xpath("//a[@class='pull-right login-btn hidden-xs']")).click();
    }
    @After
    public void tearDown() {
        // Quit the launched web browser
        driver.quit();
    }

}*/
