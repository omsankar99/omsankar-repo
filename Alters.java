package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alters {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\selenium\\driver\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	driver.manage().window().maximize();
	
	WebElement alertbox = driver.findElement(By.xpath("//a[@href='#Textbox']"));
	alertbox.click();
	
	Thread.sleep(2000);
	
	WebElement button = driver.findElement(By.xpath("//button[@class = 'btn btn-info']"));
	button.click();
	
	Thread.sleep(2000);
	
	driver.switchTo().alert().getText();
	
	//Thread.sleep(4000);
	
	//driver.switchTo().alert().sendKeys("om sankar");
	
	//driver.switchTo().alert().sendKeys("om sankar");
	
	//Thread.sleep(4000);
	
	//driver.switchTo().alert().accept();
	
	Thread.sleep(2000);
	
	
}
}