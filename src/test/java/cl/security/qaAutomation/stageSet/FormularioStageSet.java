package cl.security.qaAutomation.stageSet;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@tag2"}
		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:ReporteHTML/FlujoFormulario.html" }
)
public class FormularioStageSet extends StageSet{

}
