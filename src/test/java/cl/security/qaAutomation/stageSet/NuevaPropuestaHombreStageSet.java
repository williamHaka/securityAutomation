package cl.security.qaAutomation.stageSet;

import org.junit.runner.RunWith;

import cl.security.qaAutomation.stageSet.StageSet;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@NuevoAseguradoHombre"}
		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:ReporteHTML/FlujoCompassDPS.html" }
)
public class NuevaPropuestaHombreStageSet extends StageSet{

}