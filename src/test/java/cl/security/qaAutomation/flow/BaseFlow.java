package cl.security.qaAutomation.flow;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cl.security.qaAutomation.model.EndPointModel;
import cl.security.qaAutomation.model.NuevaPropuestaModel;

@RunWith(Suite.class)
public class BaseFlow {
	public static WebDriver driver;
	public static NuevaPropuestaModel pageModel;
	public static EndPointModel endpointModel;
	static DesiredCapabilities caps = null;
	
	@BeforeClass
	public static void InitializeWebDriver() throws Exception {
//		setDriverDesa();
//	    pageModel = PageFactory.initElements(driver, NuevaPropuestaModel.class);
	}
	    
	@AfterClass
	public static void setUpFinal() throws Exception {
//		driver.quit();
	}

	public static void setDriverDesa() throws Exception {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/WebDriver/Chrome/Windows/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
