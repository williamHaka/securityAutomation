package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.PropuestaCompassStageSet;
import cl.security.qaAutomation.stageSet.TC1StageSet;


@SuiteClasses({
	PropuestaCompassStageSet.class,TC1StageSet.class,
//	PropuestaCompassStageSet.class,TC2StageSet.class,
//	PropuestaCompassStageSet.class,TC3StageSet.class,
//	PropuestaCompassStageSet.class,TC4StageSet.class,
//	PropuestaCompassStageSet.class,TC5StageSet.class,
//	PropuestaCompassStageSet.class,TC6StageSet.class,
//	PropuestaCompassStageSet.class,TC7StageSet.class,
//	PropuestaCompassStageSet.class,TC8StageSet.class,
//	PropuestaCompassStageSet.class,TC10StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC11StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC12StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC13StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC14StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC15StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC16StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC17StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC18StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC19StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC20StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC21StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC22StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC23StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC24StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC25StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC26StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC27StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC28StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC29StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC30StageSet.class,//OK
//	PropuestaCompassStageSet.class,TC31StageSet.class, //OK
//	PropuestaCompassStageSet.class,TC32StageSet.class, //OK
//	PropuestaCompassStageSet.class,TC33StageSet.class, //OK
//	PropuestaCompassStageSet.class,TC34StageSet.class, //OK
//	PropuestaCompassStageSet.class,TC35StageSet.class, //OK
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
