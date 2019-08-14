package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.TC2StageSet;
import cl.security.qaAutomation.stageSet.TC3StageSet;
import cl.security.qaAutomation.stageSet.TC4StageSet;
import cl.security.qaAutomation.stageSet.TC5StageSet;
import cl.security.qaAutomation.stageSet.TC6StageSet;
import cl.security.qaAutomation.stageSet.TC7StageSet;
import cl.security.qaAutomation.stageSet.TC8StageSet;

@SuiteClasses({
//	TC1StageSet.class, 
	TC2StageSet.class, 
	TC3StageSet.class, 
	TC4StageSet.class, 
	TC5StageSet.class, 
	TC6StageSet.class, 
	TC7StageSet.class, 
	TC8StageSet.class, 
//	TC10StageSet.class,
//	TC11StageSet.class,
//	TC12StageSet.class,
//	TC13StageSet.class,
//	TC14StageSet.class,
//	TC15StageSet.class,
//	TC16StageSet.class,
//	TC17StageSet.class,
//	TC18StageSet.class,
//	TC19StageSet.class,
//	TC20StageSet.class,
//	TC21StageSet.class,
//	TC22StageSet.class,
//	TC23StageSet.class,
//	TC24StageSet.class,
//	TC25StageSet.class,
//	TC26StageSet.class,
//	TC27StageSet.class,
//	TC28StageSet.class,
//	TC29StageSet.class,
//	TC30StageSet.class,
//	TC31StageSet.class,
//	TC32StageSet.class,
//	TC33StageSet.class,
//	TC34StageSet.class,
//	TC35StageSet.class,
//	TC36StageSet.class,
//	TC37StageSet.class,
//	TC38StageSet.class,
//	TC39StageSet.class,
//	TC40StageSet.class,
//	TC41StageSet.class,
//	TC42StageSet.class,
//	TC43StageSet.class,
//	TC44StageSet.class,
//	TC45StageSet.class,
//	TC46StageSet.class,
//	TC47StageSet.class,
//	TC48StageSet.class, 
//	TC49StageSet.class,
//	TC50StageSet.class,
//	TC51StageSet.class,
//	TC52StageSet.class,
//	TC53StageSet.class,
//	TC54StageSet.class,
//	TC55StageSet.class,
//	TC56StageSet.class,
//	TC57StageSet.class,
//	TC58StageSet.class,
//	TC59StageSet.class,
//	TC60StageSet.class,
//	TC61StageSet.class,
//	TC62StageSet.class,
//	TC63StageSet.class,
//	TC64StageSet.class,
//	TC65StageSet.class,
//	TC66StageSet.class,
//	TC67StageSet.class,
//	TC68StageSet.class,
//	TC69StageSet.class,
//	TC70StageSet.class,
//	TC71StageSet.class,
//	TC72StageSet.class,
//	TC73StageSet.class,
//	TC74StageSet.class,
//	TC75StageSet.class,
//	TC76StageSet.class,
//	TC77StageSet.class,
//	TC78StageSet.class,
//	TC79StageSet.class,
//	TC80StageSet.class,
//	TC81StageSet.class,
//	TC82StageSet.class,
//	TC83StageSet.class,
//	TC84StageSet.class,
//	TC85StageSet.class,
//	TC86StageSet.class,
//	TC87StageSet.class,
//	TC88StageSet.class,
//	TC89StageSet.class,
//	TC90StageSet.class,
//	TC91StageSet.class,
//	TC92StageSet.class,
//	TC93StageSet.class,
//	TC94StageSet.class,
//	TC95StageSet.class,
//	TC96StageSet.class,
//	TC97StageSet.class,
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
