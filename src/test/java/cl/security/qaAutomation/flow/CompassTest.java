package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.NuevaPropuestaHombreStageSet;
import cl.security.qaAutomation.stageSet.TC4StageSet;



@SuiteClasses({
//	NuevaPropuestaHombreStageSet.class,TC1StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC2StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC3StageSet.class, //OK
	NuevaPropuestaHombreStageSet.class,TC4StageSet.class,
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
//	NuevaPropuestaMujerStageSet.class,TC36StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC37StageSet.class,//OK
//	NuevaPropuestaHombreStageSet.class,TC38StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC39StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC40StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC41StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC42StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC43StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC49StageSet.class, // OK
//	NuevaPropuestaHombreStageSet.class,TC50StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC51StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC52StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC53StageSet.class, //NOK
//	NuevaPropuestaHombreStageSet.class,TC54StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC55StageSet.class, //NOK
//	NuevaPropuestaHombreStageSet.class,TC56StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC57StageSet.class, //NOK
//	NuevaPropuestaHombreStageSet.class,TC58StageSet.class, //OK 
//	NuevaPropuestaHombreStageSet.class,TC59StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC60StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC61StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC62StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC63StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC64StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC65StageSet.class, //NOK
//	NuevaPropuestaHombreStageSet.class,TC66StageSet.class, //OK
	
	//TODO pendientes de revision en matriz
//	NuevaPropuestaHombreStageSet.class,TC67StageSet.class, //NOK
//	NuevaPropuestaHombreStageSet.class,TC68StageSet.class, //NOK
//	NuevaPropuestaHombreStageSet.class,TC69StageSet.class, //NOK
	
//	NuevaPropuestaHombreStageSet.class,TC70StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC71StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC72StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC73StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC74StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC75StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC76StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC77StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC78StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC79StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC80StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC81StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC82StageSet.class,
	
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
