/**
 * 
 */
package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Marc
 *
 */
public class Setup {
	
	
	 public static WebDriver iniSetupChrome() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marc\\Documents\\SeleniumShit\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //driver.manage().window().maximize();
	     //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     return driver;
	}
	 
	 public static WebDriver iniSetupFirefox() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marc\\Documents\\SeleniumShit\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     return driver;
	}
	 
	 public static void closeSetupChrome(WebDriver driver) {
		 driver.close();
	 }
	 
	 public static void closeSetupFirefox(WebDriver driver) {
		 driver.close();
	 }
	 
	 
}
