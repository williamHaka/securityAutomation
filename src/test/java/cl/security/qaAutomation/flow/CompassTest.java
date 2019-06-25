package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.NuevaPropuestaHombreStageSet;
import cl.security.qaAutomation.stageSet.NuevaPropuestaMujerStageSet;
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
import cl.security.qaAutomation.stageSet.TC36StageSet;
import cl.security.qaAutomation.stageSet.TC3StageSet;
import cl.security.qaAutomation.stageSet.TC4StageSet;
import cl.security.qaAutomation.stageSet.TC5StageSet;
import cl.security.qaAutomation.stageSet.TC6StageSet;
import cl.security.qaAutomation.stageSet.TC7StageSet;
import cl.security.qaAutomation.stageSet.TC8StageSet;


@SuiteClasses({
//	NuevaPropuestaHombreStageSet.class,TC1StageSet.class,
//	NuevaPropuestaHombreStageSet.class,TC2StageSet.class,
//	NuevaPropuestaHombreStageSet.class,TC3StageSet.class,
//	NuevaPropuestaHombreStageSet.class,TC4StageSet.class,
//	NuevaPropuestaHombreStageSet.class,TC5StageSet.class,
//	NuevaPropuestaHombreStageSet.class,TC6StageSet.class,
//	NuevaPropuestaHombreStageSet.class,TC7StageSet.class,
//	NuevaPropuestaHombreStageSet.class,TC8StageSet.class,
//	NuevaPropuestaHombreStageSet.class,TC10StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC11StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC12StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC13StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC14StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC15StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC16StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC17StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC18StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC19StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC20StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC21StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC22StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC23StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC24StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC25StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC26StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC27StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC28StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC29StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC30StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC31StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC32StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC33StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC34StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC35StageSet.class, //OK
	NuevaPropuestaMujerStageSet.class,TC36StageSet.class
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
