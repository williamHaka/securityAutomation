package cl.security.qaAutomation.flow;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.PageFactory;

import cl.security.qaAutomation.model.FormularioModel;

@RunWith(Suite.class)
@SuiteClasses({})
public class BaseFlow {
	private static final Log log = LogFactory.getLog(BaseFlow.class);
	public static WebDriver driver;
	public static SessionId session;
	public static FormularioModel pageModel;
	static DesiredCapabilities caps = null;
	public static final String USERNAME = "hugoHaka";
	public static final String ACCESS_KEY = "cf258cd2-347e-4954-afea-0f3864b4ec4b";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	public static String navegador = "chrome";
	
	@BeforeClass
	public static void InitializeWebDriver() throws Exception {
//		if (null != System.getenv("navegador")) {
//		capabilityBrowser(System.getenv("navegador"));
			//capabilityBrowser("iExplore");
//		}else {
			setDriverDesa();
//		}
		//driver = new RemoteWebDriver(new java.net.URL(URL), caps);
//		CreateFileExcel.createFileExcel("UsuarioGuest_", "Guest_");
		
//		ManagementMicrosoftService.createNewFileExcel();
	    pageModel = PageFactory.initElements(driver, FormularioModel.class);
	    
	}
	    
	    
	  //pageComponentCart = PageFactory.initElements(driver,PageComponentCart.class);

	@AfterClass
	public static void setUpFinal() throws Exception {
	driver.quit();
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
//			System.setProperty("webdriver.ie.driver", Constants.iExplorerDriver);
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();    
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);    
			caps.setCapability("requireWindowFocus", true);
			driver = new InternetExplorerDriver(caps);
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Runtime.getRuntime().exec("C:/Users/HugoyNathalie/Desktop/will/cencosud_test/WebDriver/IExplorer/Windows/aut.exe");
			break;
		
		}
		
	}
	
	
	public static Capabilities capabilityBrowser(String dispositivo) {
		switch (dispositivo) {
		case "firefox":
			caps = DesiredCapabilities.firefox();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "61.0");
			break;
		case "chrome":
			caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "67.0");
			break;
		case "iExplore":
			 caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("platform", "Windows 10");
			caps.setCapability("version", "11.103");
		break;
		}

		return caps;

	}
	
	public static void isActiveSessionDriver() throws Exception {
		
		session =  ((RemoteWebDriver) driver).getSessionId();
		try {
			if(session==null) {
//				throw new PSCException("Session de driver web finalizada");
			}else {
//				return true;
			}
		}catch (Exception e) {
			log.error(e,e);
			throw e;
		}
	}
}
