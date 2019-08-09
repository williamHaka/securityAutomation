package cl.security.qaAutomation.flow;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import cl.security.qaAutomation.model.EndPointModel;
import cl.security.qaAutomation.model.NuevaPropuestaModel;

@RunWith(Suite.class)
@SuiteClasses({})
public class BaseFlow {
	public static WebDriver driver;
	public static NuevaPropuestaModel pageModel;
	public static EndPointModel endpointModel;
	static DesiredCapabilities caps = null;
	
	public static String navegador = "chrome";
	
	@BeforeClass
	public static void InitializeWebDriver() throws Exception {
		setDriverDesa();
	    pageModel = PageFactory.initElements(driver, NuevaPropuestaModel.class);
	    endpointModel = new EndPointModel();
	}
	    
	@AfterClass
	public static void setUpFinal() throws Exception {
//		driver.quit();
	}

	public static void setDriverDesa() throws Exception {
		switch (navegador) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/WebDriver/Chrome/Windows/chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			break;
		
		case "iExplorer":
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/WebDriver/IExplorer/Windows/IEDriverServer.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false); 
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			capabilities.setCapability("allow-blocked-content", true);
			driver = new InternetExplorerDriver(capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			break;
		}
	}
}
