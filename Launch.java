package com.capgemini.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
  @Test
  public void f() {
	  
	  System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\ckausaly\\Desktop\\D\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	  
	        // Maximize the browser
	        driver.manage().window().maximize();
	  
	        // Launch Website
	        driver.get("https://www.capgemini.com/");
	        driver.close();
	    }
	  
	  
  }

