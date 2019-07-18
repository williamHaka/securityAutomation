package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import cl.security.qaAutomation.stageSet.TC37StageSet;
import cl.security.qaAutomation.stageSet.TC38StageSet;
import cl.security.qaAutomation.stageSet.TC39StageSet;
import cl.security.qaAutomation.stageSet.TC3StageSet;
import cl.security.qaAutomation.stageSet.TC40StageSet;
import cl.security.qaAutomation.stageSet.TC41StageSet;
import cl.security.qaAutomation.stageSet.TC42StageSet;
import cl.security.qaAutomation.stageSet.TC43StageSet;
import cl.security.qaAutomation.stageSet.TC44StageSet;
import cl.security.qaAutomation.stageSet.TC45StageSet;
import cl.security.qaAutomation.stageSet.TC46StageSet;
import cl.security.qaAutomation.stageSet.TC47StageSet;
import cl.security.qaAutomation.stageSet.TC48StageSet;
import cl.security.qaAutomation.stageSet.TC49StageSet;
import cl.security.qaAutomation.stageSet.TC4StageSet;
import cl.security.qaAutomation.stageSet.TC50StageSet;
import cl.security.qaAutomation.stageSet.TC51StageSet;
import cl.security.qaAutomation.stageSet.TC52StageSet;
import cl.security.qaAutomation.stageSet.TC53StageSet;
import cl.security.qaAutomation.stageSet.TC54StageSet;
import cl.security.qaAutomation.stageSet.TC55StageSet;
import cl.security.qaAutomation.stageSet.TC56StageSet;
import cl.security.qaAutomation.stageSet.TC57StageSet;
import cl.security.qaAutomation.stageSet.TC58StageSet;
import cl.security.qaAutomation.stageSet.TC59StageSet;
import cl.security.qaAutomation.stageSet.TC5StageSet;
import cl.security.qaAutomation.stageSet.TC60StageSet;
import cl.security.qaAutomation.stageSet.TC61StageSet;
import cl.security.qaAutomation.stageSet.TC62StageSet;
import cl.security.qaAutomation.stageSet.TC63StageSet;
import cl.security.qaAutomation.stageSet.TC64StageSet;
import cl.security.qaAutomation.stageSet.TC65StageSet;
import cl.security.qaAutomation.stageSet.TC66StageSet;
import cl.security.qaAutomation.stageSet.TC67StageSet;
import cl.security.qaAutomation.stageSet.TC68StageSet;
import cl.security.qaAutomation.stageSet.TC69StageSet;
import cl.security.qaAutomation.stageSet.TC6StageSet;
import cl.security.qaAutomation.stageSet.TC70StageSet;
import cl.security.qaAutomation.stageSet.TC71StageSet;
import cl.security.qaAutomation.stageSet.TC72StageSet;
import cl.security.qaAutomation.stageSet.TC73StageSet;
import cl.security.qaAutomation.stageSet.TC74StageSet;
import cl.security.qaAutomation.stageSet.TC75StageSet;
import cl.security.qaAutomation.stageSet.TC76StageSet;
import cl.security.qaAutomation.stageSet.TC77StageSet;
import cl.security.qaAutomation.stageSet.TC78StageSet;
import cl.security.qaAutomation.stageSet.TC79StageSet;
import cl.security.qaAutomation.stageSet.TC7StageSet;
import cl.security.qaAutomation.stageSet.TC80StageSet;
import cl.security.qaAutomation.stageSet.TC81StageSet;
import cl.security.qaAutomation.stageSet.TC82StageSet;
import cl.security.qaAutomation.stageSet.TC83StageSet;
import cl.security.qaAutomation.stageSet.TC84StageSet;
import cl.security.qaAutomation.stageSet.TC85StageSet;
import cl.security.qaAutomation.stageSet.TC86StageSet;
import cl.security.qaAutomation.stageSet.TC87StageSet;
import cl.security.qaAutomation.stageSet.TC88StageSet;
import cl.security.qaAutomation.stageSet.TC89StageSet;
import cl.security.qaAutomation.stageSet.TC8StageSet;
import cl.security.qaAutomation.stageSet.TC90StageSet;
import cl.security.qaAutomation.stageSet.TC91StageSet;
import cl.security.qaAutomation.stageSet.TC92StageSet;
import cl.security.qaAutomation.stageSet.TC93StageSet;
import cl.security.qaAutomation.stageSet.TC94StageSet;
import cl.security.qaAutomation.stageSet.TC95StageSet;
import cl.security.qaAutomation.stageSet.TC96StageSet;
import cl.security.qaAutomation.stageSet.TC97StageSet;

@SuiteClasses({
	 TC1StageSet.class  //OK
	,TC2StageSet.class  //NOK
	,TC3StageSet.class  //NOK
	,TC4StageSet.class  //NOK
	,TC5StageSet.class  //NOK
	,TC6StageSet.class  //OK
	,TC7StageSet.class  //OK
	,TC8StageSet.class  //OK
	,TC10StageSet.class //OK
	,TC11StageSet.class //OK
	,TC12StageSet.class //OK
	,TC13StageSet.class //OK
	,TC14StageSet.class //OK
	,TC15StageSet.class //NOK
	,TC16StageSet.class //NOK
	,TC17StageSet.class //NOK
	,TC18StageSet.class //NOK
	,TC19StageSet.class //OK
	,TC20StageSet.class //OK
	,TC21StageSet.class //OK
	,TC22StageSet.class //OK
	,TC23StageSet.class //OK
	,TC24StageSet.class //OK
	,TC25StageSet.class //OK
	,TC26StageSet.class //OK
	,TC27StageSet.class //OK
	,TC28StageSet.class //OK
	,TC29StageSet.class //OK
	,TC30StageSet.class //OK
	,TC31StageSet.class //OK
	,TC32StageSet.class //OK
	,TC33StageSet.class //OK
	,TC34StageSet.class //OK
	,TC35StageSet.class //OK
	,TC36StageSet.class //OK
	,TC37StageSet.class //OK
	,TC38StageSet.class //OK
	,TC39StageSet.class //OK
	,TC40StageSet.class //OK
	,TC41StageSet.class //OK
	,TC42StageSet.class //OK
	,TC43StageSet.class //OK
	,TC44StageSet.class //OK
	,TC45StageSet.class //OK
	,TC46StageSet.class //OK
	,TC47StageSet.class //NOK
	,TC48StageSet.class //NOK
	,TC49StageSet.class //OK
	,TC50StageSet.class //OK
	,TC51StageSet.class //OK
	,TC52StageSet.class //OK
	,TC53StageSet.class //OK
	,TC54StageSet.class //OK
	,TC55StageSet.class //OK
	,TC56StageSet.class //OK
	,TC57StageSet.class //OK
	,TC58StageSet.class //OK 
	,TC59StageSet.class //OK
	,TC60StageSet.class //OK
	,TC61StageSet.class //OK
	,TC62StageSet.class //OK
	,TC63StageSet.class //OK
	,TC64StageSet.class //OK
	,TC65StageSet.class //OK
	,TC66StageSet.class //OK
	,TC67StageSet.class //OK
	,TC68StageSet.class //OK
	,TC69StageSet.class //OK
	,TC70StageSet.class //OK
	,TC71StageSet.class //OK
	,TC72StageSet.class //OK
	,TC73StageSet.class //OK
	,TC74StageSet.class //OK
	,TC75StageSet.class //OK
	,TC76StageSet.class //OK
	,TC77StageSet.class //OK
	,TC78StageSet.class //OK
	,TC79StageSet.class //OK
	,TC80StageSet.class //OK
	,TC81StageSet.class //OK
	,TC82StageSet.class //OK
	,TC83StageSet.class //OK
	,TC84StageSet.class //OK
	,TC85StageSet.class //OK
	,TC86StageSet.class //OK
	,TC87StageSet.class //OK
	,TC88StageSet.class //OK
	,TC89StageSet.class //OK
	,TC90StageSet.class //OK
	,TC91StageSet.class //OK
	,TC92StageSet.class //OK
	,TC93StageSet.class //OK
	,TC94StageSet.class //OK
	,TC95StageSet.class //OK
	,TC96StageSet.class //OK
	,TC97StageSet.class //OK
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
