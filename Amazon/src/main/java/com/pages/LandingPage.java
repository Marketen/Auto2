package com.pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/**
 * @author Marc
 * 
 * 
 * Aquesta classe te tots els locators i metodes de la pagina principal d'amazon
 * 
 */

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSearchBar() {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
	}
	
	public WebElement searchBar() {
        return driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	}
	
	public void typeSearchBar(String busqueda) {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(busqueda);
	}
	
	
	public WebElement SearchButton() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]"
        		+ "/form[1]/div[3]/div[1]/span[1]/input[1]"));
	}

	public WebElement PrimeraBusqueda() {
        return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[3]"
        		+ "/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]"));
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
}