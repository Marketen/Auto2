package com.tests;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import com.tests.Setup;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.google.common.base.Function;
import com.pages.LandingPage;

/**
 * @author Marc
 *
 */
public class TestSearchProduct {

	
	WebDriver driver;
	

	@BeforeSuite
	private void setUp() {
		driver = Setup.iniSetupChrome(driver);
	    driver.get("https://www.amazon.es/ref=nav_logo");
	}
	
	@BeforeTest
	private void profileSetup() {
		System.out.println("Before Test");
	}
	
	@Test
	public void searchProduct() {
		try {
			System.out.println("Test Case One with Thread Id:- "
					+ Thread.currentThread().getId());
			 			
		    LandingPage landing = new LandingPage(driver);
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(100))
			        .pollingEvery(Duration.ofMillis(600))
			        .ignoring(NoSuchElementException.class);
		    	 WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		    	     public WebElement apply(WebDriver driver) {
		    	         WebElement linkElement = landing.searchBar();
		    	         if (linkElement.isEnabled()) {
		    	         	System.out.println("Element found");
		    	         }
		    	         return linkElement;
		    	     }
		    	 });
		    	 
		     element.click();
		     landing.searchBar().sendKeys("1917");;
		     landing.SearchButton().click();
		     landing.PrimeraBusqueda().click();
		     
		} catch (Exception e) {
            e.printStackTrace();
		}
	}
	
	@Test
	public void testTitle() {
		
		 System.out.println("Test Case One with Thread Id:- "
				+ Thread.currentThread().getId());
		 
		 driver.get("https://www.amazon.es/ref=nav_logo");
	     LandingPage landing = new LandingPage(driver);
	     
	     String expectedTitle = "Amazon";
	     String actualTitle = landing.getTitle();
	     try {
	    	 AssertJUnit.assertEquals(actualTitle,expectedTitle);
	     } catch (Exception e){
	    	 System.out.println("error");
	     }
	}
	
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("test acabat");
	}
	
	
	@AfterSuite
	private void quit() {
		Setup.closeSetupChrome(driver);
		Setup.quitDriver(driver);
	}
}
