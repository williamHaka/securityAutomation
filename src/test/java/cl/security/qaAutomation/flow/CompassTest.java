package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuiteClasses({
//	NuevaPropuestaHombreStageSet.class,TC1StageSet.class,  //OK
//	NuevaPropuestaHombreStageSet.class,TC2StageSet.class,  //OK
//	NuevaPropuestaHombreStageSet.class,TC3StageSet.class,  //OK
//	NuevaPropuestaHombreStageSet.class,TC4StageSet.class,  //OK
//	NuevaPropuestaHombreStageSet.class,TC5StageSet.class,  //OK
//	NuevaPropuestaHombreStageSet.class,TC6StageSet.class,  //OK
//	NuevaPropuestaHombreStageSet.class,TC7StageSet.class,  //OK
//	NuevaPropuestaHombreStageSet.class,TC8StageSet.class,  //OK
//	NuevaPropuestaHombreStageSet.class,TC10StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC11StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC12StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC13StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC14StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC15StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC16StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC17StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC18StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC19StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC20StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC21StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC22StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC23StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC24StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC25StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC26StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC27StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC28StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC29StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC30StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC31StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC32StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC33StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC34StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC35StageSet.class, //OK
//	NuevaPropuestaMujerStageSet.class,TC36StageSet.class,  //OK
//	NuevaPropuestaHombreStageSet.class,TC37StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC38StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC39StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC40StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC41StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC42StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC43StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC49StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC50StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC51StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC52StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC53StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC54StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC55StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC56StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC57StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC58StageSet.class, //OK 
//	NuevaPropuestaHombreStageSet.class,TC59StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC60StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC61StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC62StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC63StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC64StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC65StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC66StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC67StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC68StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC69StageSet.class, //OK
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
//	NuevaPropuestaHombreStageSet.class,TC82StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC83StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC84StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC85StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC86StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC87StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC88StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC89StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC90StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC91StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC92StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC93StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC94StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC95StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC96StageSet.class, //OK
//	NuevaPropuestaHombreStageSet.class,TC97StageSet.class, //OK
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
