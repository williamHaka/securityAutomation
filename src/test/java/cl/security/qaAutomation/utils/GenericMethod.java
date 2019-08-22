package cl.security.qaAutomation.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cl.security.qaAutomation.flow.BaseFlow;

public class GenericMethod {

	
	public static void scrollElement( WebElement element) throws InterruptedException {
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(1000);
	}
	
	public static void focusElement( WebElement element) throws Exception {
		Thread.sleep(1000);
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].focus();", element);
		Thread.sleep(1000);
	}
	
	public static void focus(WebElement element) throws Exception {
		Thread.sleep(1000);
		new Actions(BaseFlow.driver).moveToElement(element).perform(); 
		Thread.sleep(1000);
	}

	public static void clickElement(WebElement element) throws Exception {
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(500);
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].click();", element);
		Thread.sleep(500);
	}
	
	public static void ingresarTextoSugerido(WebElement element, String texto) throws InterruptedException {
		try {
			Thread.sleep(2000);
			element.click();
			if(!existElement(By.xpath("//input[(@type='search')]"))) {
				Thread.sleep(1000);
				element.click();
			}
			WebElement txtBuscar = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
			txtBuscar.sendKeys(texto);
			Thread.sleep(Constants.TIMEOUT_LOAD_SEARCH_TEXT);
			txtBuscar.sendKeys(Keys.ENTER);
			Thread.sleep(Constants.TIMEOUT_LOAD_RESPONSE);
		} catch (Exception e) {
			throw e;
		}
	}
	

//	public static void ingresarTextoSugerido(WebElement element, String texto) throws InterruptedException {
//		try {
//			Thread.sleep(2000);
//			element.click();
//			if(!existElement(By.xpath("//input[(@type='search')]"))) {
//				Thread.sleep(1000);
//				element.click();
//			}
//			WebElement txtBuscar = BaseFlow.driver.findElement(By.xpath("//input[(@type='search')]"));
//			txtBuscar.sendKeys(texto);
//			Thread.sleep(Constants.TIMEOUT_LOAD_SEARCH_TEXT);
//			List<WebElement> listSegurida = BaseFlow.driver.findElements(By.xpath("//li[(@class='ember-power-select-option')]"));
//			for (WebElement webElement : listSegurida) {
//				if(webElement.getText().trim().contains(texto)) {
//					webElement.click();
//					Thread.sleep(Constants.TIMEOUT_LOAD_SEARCH_TEXT);
//				}
//			}
//		} catch (Exception e) {
//			throw e;
//		}
//	}
	
	public static String getDate() {
		 Calendar fecha = new GregorianCalendar();
	        //Obtenemos el valor del año, mes, día, hora, minuto y segundo del sistema.
	        //Usando el método get y el parámetro correspondiente.
	        Integer annio = fecha.get(Calendar.YEAR);
	        Integer mes = fecha.get(Calendar.MONTH)+1;
	        Integer dia = fecha.get(Calendar.DAY_OF_MONTH);
	        Integer hora = fecha.get(Calendar.HOUR_OF_DAY);
	        Integer minuto = fecha.get(Calendar.MINUTE);
	        Integer segundo = fecha.get(Calendar.SECOND);
	        String anio = String.valueOf(annio)+String.valueOf(mes)+String.valueOf(dia);
	        String horaTotal = String.valueOf(hora)+String.valueOf(minuto)+String.valueOf(segundo); 
	        return anio+"_"+horaTotal;
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