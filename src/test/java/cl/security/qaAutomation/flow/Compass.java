package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.PropuestaCompassStageSet;
import cl.security.qaAutomation.stageSet.PruebaStageSet;
import cl.security.qaAutomation.stageSet.TC10StageSet;
import cl.security.qaAutomation.stageSet.TC11StageSet;
import cl.security.qaAutomation.stageSet.TC12StageSet;
import cl.security.qaAutomation.stageSet.TC13StageSet;
import cl.security.qaAutomation.stageSet.TC14StageSet;
import cl.security.qaAutomation.stageSet.TC6StageSet;
import cl.security.qaAutomation.stageSet.TC7StageSet;
import cl.security.qaAutomation.stageSet.TC8StageSet;
import cl.security.qaAutomation.stageSet.TC9StageSetNOVA;


@SuiteClasses({
//	PropuestaCompassStageSet.class,PruebaStageSet.class,
//	PropuestaCompassStageSet.class,TC1StageSet.class,
//	PropuestaCompassStageSet.class,TC2StageSet.class,
//	PropuestaCompassStageSet.class,TC3StageSet.class,
//	PropuestaCompassStageSet.class,TC4StageSet.class,
//	PropuestaCompassStageSet.class,TC5StageSet.class,
//	PropuestaCompassStageSet.class,TC6StageSet.class,
//	PropuestaCompassStageSet.class,TC7StageSet.class,
//	PropuestaCompassStageSet.class,TC8StageSet.class,
//	PropuestaCompassStageSet.class,TC9StageSet.class,
//	PropuestaCompassStageSet.class,TC10StageSet.class,
//	PropuestaCompassStageSet.class,TC11StageSet.class,
//	PropuestaCompassStageSet.class,TC12StageSet.class,
//	PropuestaCompassStageSet.class,TC13StageSet.class,
	PropuestaCompassStageSet.class,TC14StageSet.class
})

public class Compass extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(Compass.class);
    @BeforeClass
    public static void flag() throws Exception {
        LOGGER.info("Ejecutando flujo de formulario DPS");
    }
}
