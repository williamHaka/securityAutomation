package cl.security.qaAutomation.stageSet;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {
				   "@P1TC20"
				+ ",@P2NO"
				+ ",@P3NO"
				+ ",@P4NO"
				+ ",@P5NO"
				+ ",@P6NO"
				+ ",@P7TC20"
				+ ",@P8NO"
				+ ",@P9NO"
				+ ",@P10NO"//TODO agregar tc P10TC20
				+ ",@P11NO"//TODO agregar tc P11TC20
				+ ",@P12NO"//TODO agregar tc P12TC20 
				+ ",@P13NO"
				+ ",@P14NO"
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
public class TC20StageSet extends StageSet{

}
