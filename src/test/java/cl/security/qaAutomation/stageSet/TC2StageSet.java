package cl.security.qaAutomation.stageSet;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@P1TC2,@P2TC1,@P3TC1,@P4TC1,@P5TC1,@P6TC1,@P7TC1,@P8TC1,@P9TC1,@P10TC1,@P11TC1,@P12TC1,@P13TC1,@P14TC1,@P15TC1,@P16TC1,@P17TC1,@P18TC1,@P19TC1,@P20TC1,@P21TC1,@P22TC1,@P23TC1,@P24TC1,@P25TC1,@P26TC1,@P27TC1,@P28TC1,@P29TC1,@P30TC1,@P31TC1,@P32TC1,@P33TC1,@GuardarPropuesta,@executeResult"}
		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:ReporteHTML/FlujoCompassDPS.html" }
)
public class TC2StageSet extends StageSet{

}
