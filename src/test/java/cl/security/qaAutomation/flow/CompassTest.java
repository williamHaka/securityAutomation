package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.PropuestaCompassStageSet;
import cl.security.qaAutomation.stageSet.TC10StageSet;
import cl.security.qaAutomation.stageSet.TC11StageSet;
import cl.security.qaAutomation.stageSet.TC12StageSet;
import cl.security.qaAutomation.stageSet.TC13StageSet;
import cl.security.qaAutomation.stageSet.TC14StageSet;
import cl.security.qaAutomation.stageSet.TC15StageSet;
import cl.security.qaAutomation.stageSet.TC16StageSet;
import cl.security.qaAutomation.stageSet.TC17StageSet;
import cl.security.qaAutomation.stageSet.TC18StageSet;
import cl.security.qaAutomation.stageSet.TC19StageSet;
import cl.security.qaAutomation.stageSet.TC1StageSet;
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
import cl.security.qaAutomation.stageSet.TC2StageSet;
import cl.security.qaAutomation.stageSet.TC30StageSet;
import cl.security.qaAutomation.stageSet.TC31StageSet;
import cl.security.qaAutomation.stageSet.TC32StageSet;
import cl.security.qaAutomation.stageSet.TC33StageSet;
import cl.security.qaAutomation.stageSet.TC34StageSet;
import cl.security.qaAutomation.stageSet.TC35StageSet;
import cl.security.qaAutomation.stageSet.TC3StageSet;
import cl.security.qaAutomation.stageSet.TC4StageSet;
import cl.security.qaAutomation.stageSet.TC5StageSet;
import cl.security.qaAutomation.stageSet.TC6StageSet;
import cl.security.qaAutomation.stageSet.TC7StageSet;
import cl.security.qaAutomation.stageSet.TC8StageSet;


@SuiteClasses({
	PropuestaCompassStageSet.class,TC1StageSet.class,
	PropuestaCompassStageSet.class,TC2StageSet.class,
	PropuestaCompassStageSet.class,TC3StageSet.class,
	PropuestaCompassStageSet.class,TC4StageSet.class,
	PropuestaCompassStageSet.class,TC5StageSet.class,
	PropuestaCompassStageSet.class,TC6StageSet.class,
	PropuestaCompassStageSet.class,TC7StageSet.class,
	PropuestaCompassStageSet.class,TC8StageSet.class,
	PropuestaCompassStageSet.class,TC10StageSet.class,//OK
	PropuestaCompassStageSet.class,TC11StageSet.class,//OK
	PropuestaCompassStageSet.class,TC12StageSet.class,//OK
	PropuestaCompassStageSet.class,TC13StageSet.class,//OK
	PropuestaCompassStageSet.class,TC14StageSet.class,//OK
	PropuestaCompassStageSet.class,TC15StageSet.class,//OK
	PropuestaCompassStageSet.class,TC16StageSet.class,//OK
	PropuestaCompassStageSet.class,TC17StageSet.class,//OK
	PropuestaCompassStageSet.class,TC18StageSet.class,//OK
	PropuestaCompassStageSet.class,TC19StageSet.class,//OK
	PropuestaCompassStageSet.class,TC20StageSet.class,//OK
	PropuestaCompassStageSet.class,TC21StageSet.class,//OK
	PropuestaCompassStageSet.class,TC22StageSet.class,//OK
	PropuestaCompassStageSet.class,TC23StageSet.class,//OK
	PropuestaCompassStageSet.class,TC24StageSet.class,//OK
	PropuestaCompassStageSet.class,TC25StageSet.class,//OK
	PropuestaCompassStageSet.class,TC26StageSet.class,//OK
	PropuestaCompassStageSet.class,TC27StageSet.class,//OK
	PropuestaCompassStageSet.class,TC28StageSet.class,//OK
	PropuestaCompassStageSet.class,TC29StageSet.class,//OK
	PropuestaCompassStageSet.class,TC30StageSet.class,//OK
	PropuestaCompassStageSet.class,TC31StageSet.class, //OK
	PropuestaCompassStageSet.class,TC32StageSet.class, //OK
	PropuestaCompassStageSet.class,TC33StageSet.class, //OK
	PropuestaCompassStageSet.class,TC34StageSet.class, //OK
	PropuestaCompassStageSet.class,TC35StageSet.class, //OK
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
