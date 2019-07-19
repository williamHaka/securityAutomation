package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.TC45StageSet;
import cl.security.qaAutomation.stageSet.TC46StageSet;
import cl.security.qaAutomation.stageSet.TC47StageSet;
import cl.security.qaAutomation.stageSet.TC48StageSet;

@SuiteClasses({
//	 TC1StageSet.class  //OK
//	,TC2StageSet.class  //NOK
//	,TC3StageSet.class  //NOK
//	,TC4StageSet.class  //NOK
//	,TC5StageSet.class  //NOK
//	,TC6StageSet.class  //OK
//	,TC7StageSet.class  //OK
//	,TC8StageSet.class  //OK
//	,TC10StageSet.class //OK
//	,TC11StageSet.class //OK
//	,TC12StageSet.class //OK
//	,TC13StageSet.class //OK
//	,TC14StageSet.class //OK
//	,TC15StageSet.class //NOK
//	,TC16StageSet.class //NOK
//	,TC17StageSet.class //NOK
//	,TC18StageSet.class //NOK
//	,TC19StageSet.class //OK
//	,TC20StageSet.class //OK
//	,TC21StageSet.class //OK
//	,TC22StageSet.class //OK
//	,TC23StageSet.class //OK
//	,TC24StageSet.class //OK
//	,TC25StageSet.class //OK
//	,TC26StageSet.class //OK
//	,TC27StageSet.class //OK
//	,TC28StageSet.class //OK
//	,TC29StageSet.class //OK
//	,TC30StageSet.class //OK
//	,TC31StageSet.class //OK
//	,TC32StageSet.class //OK
//	,TC33StageSet.class //OK
//	,TC34StageSet.class //OK
//	,TC35StageSet.class //OK
//	,TC36StageSet.class //OK
//	,TC37StageSet.class //OK
//	,TC38StageSet.class //OK
//	,TC39StageSet.class //OK
//	,TC40StageSet.class //OK
//	,TC41StageSet.class //OK
//	,TC42StageSet.class //OK
//	,TC43StageSet.class //OK
//	,TC44StageSet.class //OK
	 TC45StageSet.class //OK
	,TC46StageSet.class //OK
	,TC47StageSet.class //NOK
	,TC48StageSet.class //NOK
//	,TC49StageSet.class //OK
//	,TC50StageSet.class //OK
//	,TC51StageSet.class //OK
//	,TC52StageSet.class //OK
//	,TC53StageSet.class //OK
//	,TC54StageSet.class //OK
//	,TC55StageSet.class //OK
//	,TC56StageSet.class //OK
//	,TC57StageSet.class //OK
//	,TC58StageSet.class //OK 
//	,TC59StageSet.class //OK
//	,TC60StageSet.class //OK
//	,TC61StageSet.class //OK
//	,TC62StageSet.class //OK
//	,TC63StageSet.class //OK
//	,TC64StageSet.class //OK
//	,TC65StageSet.class //OK
//	,TC66StageSet.class //OK
//	,TC67StageSet.class //OK
//	,TC68StageSet.class //OK
//	,TC69StageSet.class //OK
//	,TC70StageSet.class //OK
//	,TC71StageSet.class //OK
//	,TC72StageSet.class //OK
//	,TC73StageSet.class //OK
//	,TC74StageSet.class //OK
//	,TC75StageSet.class //OK
//	,TC76StageSet.class //OK
//	,TC77StageSet.class //OK
//	,TC78StageSet.class //OK
//	,TC79StageSet.class //OK
//	,TC80StageSet.class //OK
//	,TC81StageSet.class //OK
//	,TC82StageSet.class //OK
//	,TC83StageSet.class //OK
//	,TC84StageSet.class //OK
//	,TC85StageSet.class //OK
//	,TC86StageSet.class //OK
//	,TC87StageSet.class //OK
//	,TC88StageSet.class //OK
//	,TC89StageSet.class //OK
//	,TC90StageSet.class //OK
//	,TC91StageSet.class //OK
//	,TC92StageSet.class //OK
//	,TC93StageSet.class //OK
//	,TC94StageSet.class //OK
//	,TC95StageSet.class //OK
//	,TC96StageSet.class //OK
//	,TC97StageSet.class //OK
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
