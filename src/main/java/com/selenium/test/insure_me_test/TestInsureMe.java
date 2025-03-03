package com.selenium.test.insure_me_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestInsureMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("http://18.119.116.77:8081/contact.html");
        
        driver.getTitle();
        
        WebElement name = driver.findElement(By.id("inputName"));
        name.sendKeys("First Name");
        
        WebElement number = driver.findElement(By.id("inputNumber"));
        number.sendKeys("9999999");
        
        WebElement email = driver.findElement(By.id("inputMail"));
        email.sendKeys("testid@abcd.com");
        
        WebElement message = driver.findElement(By.id("inputMessage"));
        message.sendKeys("Hello world");
        
        WebElement submitbutton = driver.findElement(By.id("my-button"));
        submitbutton.click();
        
        
        WebElement response = driver.findElement(By.id("response"));
        response.getText();
        
        if(response.getText().equalsIgnoreCase("Message Sent"))
        	{
        	System.out.println("Test Case Passed");
            }
        	
        else
        	{
        		System.out.println("Test case faile");
        	}
        
        
        driver.quit();
        

	}

}
