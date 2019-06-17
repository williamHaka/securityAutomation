package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.PropuestaCompassStageSet;
import cl.security.qaAutomation.stageSet.PruebaStageSet;
import cl.security.qaAutomation.stageSet.TC1StageSet;
import cl.security.qaAutomation.stageSet.TC2StageSet;
import cl.security.qaAutomation.stageSet.TC3StageSet;
import cl.security.qaAutomation.stageSet.TC4StageSet;
import cl.security.qaAutomation.stageSet.TC5StageSet;


@SuiteClasses({
	PropuestaCompassStageSet.class,PruebaStageSet.class
//	PropuestaCompassStageSet.class,TC1StageSet.class
//	,PropuestaCompassStageSet.class,TC2StageSet.class
//	,PropuestaCompassStageSet.class,TC3StageSet.class
//	PropuestaCompassStageSet.class,TC4StageSet.class
//	,PropuestaCompassStageSet.class,TC5StageSet.class
})

public class CompassTest extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(CompassTest.class);
    @BeforeClass
    public static void flag() throws Exception {
        LOGGER.info("Ejecutando flujo de formulario DPS");
    }
}
