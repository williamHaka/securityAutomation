package cl.security.qaAutomation.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cl.security.qaAutomation.flow.BaseFlow;

public class GenericMethod {

	public static void scrollElement( WebElement element) {
		((JavascriptExecutor) BaseFlow.driver).executeScript("arguments[0].scrollIntoView();", element);
	}
	
}
