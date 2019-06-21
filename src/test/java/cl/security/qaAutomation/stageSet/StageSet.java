package cl.security.qaAutomation.stageSet;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "cl/security/qaAutomation/definition"
)
public class StageSet {
	@AfterClass
	public static void setUpFinal() throws Exception{
		String rutaXML = System.getProperty("user.dir")+"/Configs/extent-config.xml";
		Reporter.loadXMLConfig(rutaXML);
	}
	
}
