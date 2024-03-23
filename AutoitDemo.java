package com.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoitDemo {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("Webdriver-http-factory","jdk-http-client");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");	
		//create instance of chromedriver
		//**WebDriver driver=  new ChromeDriver();
		
			//	open the website
		driver.get("https://www.filemail.com/share/upload-file");
     driver.findElement(By.id("addBtn")).click();
     //provide the path of autoit.exe file
   Thread.sleep(2000);
    Runtime.getRuntime().exec("C:/Users/ajay/Documents/auto/uploadfile1.exe");
	}

}
