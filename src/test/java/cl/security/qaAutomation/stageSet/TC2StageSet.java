package cl.security.qaAutomation.stageSet;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {
			    "@NuevaPropuestaTC1,@P1TC2,@P2TC2"
		}
		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:ReporteHTML/FlujoCompassDPS.html" }
)
public class TC2StageSet extends StageSet{

}
