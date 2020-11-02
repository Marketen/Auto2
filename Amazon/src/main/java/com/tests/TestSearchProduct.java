package com.tests;


import java.util.concurrent.TimeUnit;
import com.tests.Setup;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.pages.LandingPage;

/**
 * @author Marc
 *
 */
public class TestSearchProduct {

	@BeforeSuite
	private WebDriver setUp() {
		WebDriver driver = Setup.iniSetupChrome();
		return driver;
	}
	
	@Parameters({"driver"})
	@BeforeTest
	private void profileSetup(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
    @Test
	public void searchProduct() {
		try {
			 System.out.println("Test Case One with Thread Id:- "
					+ Thread.currentThread().getId());
			 			 
		     driver.get("https://www.amazon.es/ref=nav_logo");
		     LandingPage landing = new LandingPage(driver);
	         
		     Thread.sleep(4000);
		     landing.clickSearchBar();
		     landing.typeSearchBar("1917");
		     landing.clickSearchButton();
		     landing.clickPrimeraBusqueda();
		     Thread.sleep(6000);
		     driver.quit();
		     
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
	    	 Assert.assertEquals(actualTitle,expectedTitle);
	     } catch (Exception e){
	    	 System.out.println("error");
	     }
	}
	
	@AfterSuite
	private void closing(WebDriver driver) {
		System.out.println("Tests ejecutados, cerrando drivers");
		Setup.closeSetupChrome(driver);
	}
}
