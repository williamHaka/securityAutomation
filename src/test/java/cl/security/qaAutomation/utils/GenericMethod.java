package cl.security.qaAutomation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cl.security.qaAutomation.flow.BaseFlow;

public class GenericMethod {

	public static void scrollElement( WebElement element) throws InterruptedException {
		Thread.sleep(500);
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void focusElement( WebElement element) {
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].focus();", element);
	}
	
	public static void clickElement(WebElement element) {
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].click();", element);
	}
	
	public static void ingresarTextoSugerido(WebElement element, String texto) throws InterruptedException {
	    element.sendKeys(texto);
	    Thread.sleep(1000);
	    element.sendKeys(Keys.ENTER);
		
	}
	
	
	
	
	
	
}
