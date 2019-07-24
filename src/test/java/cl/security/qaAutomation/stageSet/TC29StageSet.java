package cl.security.qaAutomation.stageSet;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {
				"@NuevoAseguradoHombre"
				+ ",@P1TC9"
				+ ",@P2NO"
				+ ",@P3NO"
				+ ",@P4NO"
				+ ",@P5NO"
				+ ",@P6NO"
				+ ",@P7TC29"
				+ ",@P8NO"
				+ ",@P9NO"
				+ ",@P10TC29"
				+ ",@P11NO"
				+ ",@P12NO"
				+ ",@P13NO"
				+ ",@P14NO"
				+ ",@P34NO"
				+ ",@P15NO"
				+ ",@P16NO"
				+ ",@P17NO"
				+ ",@P18NO"
				+ ",@P19NO"
				+ ",@P20NO"
				+ ",@P21NO"
				+ ",@P22NO"
				+ ",@P23NO"
				+ ",@P24NO"
				+ ",@P25NO"
				+ ",@P26NO"
				+ ",@P27NO"
				+ ",@P28NO"
				+ ",@P29NO"
				+ ",@P30NO"
				+ ",@P31NO"
				+ ",@P32NO"
				+ ",@P33NO"
		},plugin = {"com.cucumber.listener.ExtentCucumberFormatter:ReporteHTML/FlujoCompassDPS.html" }
)
public class TC29StageSet extends StageSet{

}
