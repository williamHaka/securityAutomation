package cl.security.qaAutomation.stageSet;

import org.junit.runner.RunWith;

import cl.security.qaAutomation.stageSet.StageSet;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@examples"}
		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:ReporteHTML/automationCRM.html" }
)
public class NuevaPropuestaHombreStageSet extends StageSet{

}