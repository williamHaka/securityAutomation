package cl.security.qaAutomation.utils;

import static org.junit.Assert.assertFalse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cl.security.qaAutomation.flow.BaseFlow;

public class GenericMethod {

	public static void scrollElement( WebElement element) throws InterruptedException {
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(1000);
	}
	
	public static void focusElement( WebElement element) {
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].focus();", element);
	}
	
	public static void clickElement(WebElement element) throws Exception {
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(500);
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].click();", element);
		Thread.sleep(500);
	}
	
	public static void ingresarTextoSugerido(WebElement element, String texto) throws InterruptedException {
		Thread.sleep(1000);
		element.click();
		Thread.sleep(2000);
		WebElement txtBuscar = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
		txtBuscar.sendKeys(texto);
		Thread.sleep(1000);
		txtBuscar.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	public static String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");
		LocalDateTime localDate = LocalDateTime.now();
		return dtf.format(localDate);
	}
	
	public static WebElement implicityWait(Integer timeoutInSeconds,By element)throws Exception{
    	WebElement elemento = null;
    	try {
    		WebDriverWait wait = new WebDriverWait(BaseFlow.driver, timeoutInSeconds); 
        	elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		}catch (Exception e) {
			System.out.println(e);
		}
    	return elemento;
    }
	
	public static Boolean isElementVisible(Integer timeoutInSeconds,By element)throws Exception{
    	Boolean valid = false;
		WebElement elemento = BaseFlow.driver.findElements(element).get(0);
    	try {
    		WebDriverWait wait = new WebDriverWait(BaseFlow.driver, timeoutInSeconds); 
        	elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        	valid = elemento!=null?true:false;
		}catch (Exception e) {
			System.out.println(e);
		}
    	return valid;
    }
	
	
	 public static WebElement waitForClickeable(Integer timeoutInSeconds,WebElement element)throws Exception{
    	WebElement elemento = null;
    	try {
    		WebDriverWait wait = new WebDriverWait(BaseFlow.driver, timeoutInSeconds); 
        	elemento = wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch (Exception e) {
			System.out.println(e);
		}
    	return elemento;
    }
	 
	 public static WebElement waitForClickeable(Integer timeoutInSeconds,By element)throws Exception{
    	WebElement elemento = null;
    	try {
    		WebDriverWait wait = new WebDriverWait(BaseFlow.driver, timeoutInSeconds); 
        	elemento = wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch (Exception e) {
			System.out.println(e);
		}
    	return elemento;
	 }
	 
	 public static Boolean existElement(By element) throws InterruptedException { 
    	boolean isPresent = false; 
    	for (int i = 0; i < 1; i++) {
    	 try { 
    		 	if (BaseFlow.driver.findElement(element) != null) 
    		 	{ 
    		 		isPresent = true; 
    		 		break; 
    	 		} 
     		} catch (Exception e) { // 
     			Thread.sleep(500); 
    		} 
    	} 
    	return isPresent;
 	}
}