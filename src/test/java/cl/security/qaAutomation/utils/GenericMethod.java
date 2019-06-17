package cl.security.qaAutomation.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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
		element.click();
		Thread.sleep(1000);
		WebElement txtBuscar = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
		txtBuscar.sendKeys(texto);
		Thread.sleep(1000);
		txtBuscar.sendKeys(Keys.ENTER);
		
	}
	
	public static String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");
		LocalDateTime localDate = LocalDateTime.now();
		return dtf.format(localDate);
	}
	
	
	
	
}
