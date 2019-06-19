package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.PropuestaCompassStageSet;
import cl.security.qaAutomation.stageSet.TC15StageSet;
import cl.security.qaAutomation.stageSet.TC16StageSet;
import cl.security.qaAutomation.stageSet.TC17StageSet;
import cl.security.qaAutomation.stageSet.TC18StageSet;
import cl.security.qaAutomation.stageSet.TC19StageSet;
import cl.security.qaAutomation.stageSet.TC20StageSet;
import cl.security.qaAutomation.stageSet.TC21StageSet;
import cl.security.qaAutomation.stageSet.TC22StageSet;
import cl.security.qaAutomation.stageSet.TC23StageSet;
import cl.security.qaAutomation.stageSet.TC24StageSet;
import cl.security.qaAutomation.stageSet.TC25StageSet;
import cl.security.qaAutomation.stageSet.TC26StageSet;
import cl.security.qaAutomation.stageSet.TC27StageSet;
import cl.security.qaAutomation.stageSet.TC28StageSet;
import cl.security.qaAutomation.stageSet.TC29StageSet;


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
//	PropuestaCompassStageSet.class,TC14StageSet.class,
	PropuestaCompassStageSet.class,TC15StageSet.class,
	PropuestaCompassStageSet.class,TC16StageSet.class,
	PropuestaCompassStageSet.class,TC17StageSet.class,
	PropuestaCompassStageSet.class,TC18StageSet.class,
	PropuestaCompassStageSet.class,TC19StageSet.class,
	PropuestaCompassStageSet.class,TC20StageSet.class,
	PropuestaCompassStageSet.class,TC21StageSet.class,
	PropuestaCompassStageSet.class,TC22StageSet.class,
	PropuestaCompassStageSet.class,TC23StageSet.class,
	PropuestaCompassStageSet.class,TC24StageSet.class,
	PropuestaCompassStageSet.class,TC25StageSet.class,
	PropuestaCompassStageSet.class,TC26StageSet.class,
	PropuestaCompassStageSet.class,TC27StageSet.class,
	PropuestaCompassStageSet.class,TC28StageSet.class,
	PropuestaCompassStageSet.class,TC29StageSet.class,
})

public class CompassTest extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(CompassTest.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("**************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS   *");
        LOGGER.info("**************************************");
    }
}
