package cl.security.qaAutomation.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
	
	public static void clickElement(WebElement element) throws Exception {
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(500);
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].click();", element);
		Thread.sleep(500);
	}
	
	public static void ingresarTextoSugerido(WebElement element, String texto) throws InterruptedException {
		Thread.sleep(1000);
		element.sendKeys(texto);
	    element.sendKeys(Keys.ENTER);
		
	}
	
	public static String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");
		LocalDateTime localDate = LocalDateTime.now();
		return dtf.format(localDate);
	}
	
	
	
	
}
