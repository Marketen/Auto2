/**
 * 
 */
package com.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Marc
 *
 */
public class Setup {
	
	 public static WebDriver iniSetupChrome(WebDriver driver) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marc\\Documents\\SeleniumShit\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     return driver;
	}
	 
	 public static WebDriver iniSetupFirefox() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marc\\Documents\\SeleniumShit\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	     return driver;
	}
	 
	 public static void closeSetupChrome(WebDriver driver) {
		 driver.close();
	 }
	 
	 public static void quitDriver (WebDriver driver) {
		 driver.quit();
	 }
	 
	 public static void closeSetupFirefox(WebDriver driver) {
		 driver.close();
	 }
	 
	 
}
