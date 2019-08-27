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
	TC1StageSet.class, 
	TC2StageSet.class, 
	TC3StageSet.class, 
	TC4StageSet.class, 
	TC5StageSet.class, 
	TC6StageSet.class, 
	TC7StageSet.class, 
	TC8StageSet.class, 
	TC10StageSet.class,
	TC11StageSet.class,
	TC12StageSet.class,
	TC13StageSet.class,
	TC14StageSet.class,
	TC15StageSet.class,
	TC16StageSet.class,
	TC17StageSet.class,
	TC18StageSet.class,
	TC19StageSet.class,
	TC20StageSet.class,
	TC21StageSet.class,
	TC22StageSet.class,
	TC23StageSet.class,
	TC24StageSet.class,
	TC25StageSet.class,
	TC26StageSet.class,
	TC27StageSet.class,
	TC28StageSet.class,
	TC29StageSet.class,
	TC30StageSet.class,
	TC31StageSet.class,
	TC32StageSet.class,
	TC33StageSet.class,
	TC34StageSet.class,
	TC35StageSet.class,
	TC36StageSet.class,
	TC37StageSet.class,
	TC38StageSet.class,
	TC39StageSet.class,
	TC40StageSet.class,
	TC41StageSet.class,
	TC42StageSet.class,
	TC43StageSet.class,
	TC44StageSet.class,
	TC45StageSet.class,
	TC46StageSet.class,
	TC47StageSet.class,
	TC48StageSet.class, 
	TC49StageSet.class,
	TC50StageSet.class,
	TC51StageSet.class,
	TC52StageSet.class,
	TC53StageSet.class,
	TC54StageSet.class,
	TC55StageSet.class,
	TC56StageSet.class,
	TC57StageSet.class,
	TC58StageSet.class,
	TC59StageSet.class,
	TC60StageSet.class,
	TC61StageSet.class,
	TC62StageSet.class,
	TC63StageSet.class,
	TC64StageSet.class,
	TC65StageSet.class,
	TC66StageSet.class,
	TC67StageSet.class,
	TC68StageSet.class,
	TC69StageSet.class,
	TC70StageSet.class,
	TC71StageSet.class,
	TC72StageSet.class,
	TC73StageSet.class,
	TC74StageSet.class,
	TC75StageSet.class,
	TC76StageSet.class,
	TC77StageSet.class,
	TC78StageSet.class,
	TC79StageSet.class,
	TC80StageSet.class,
	TC81StageSet.class,
	TC82StageSet.class,
	TC83StageSet.class,
	TC84StageSet.class,
	TC85StageSet.class,
	TC86StageSet.class,
	TC87StageSet.class,
	TC88StageSet.class,
	TC89StageSet.class,
	TC90StageSet.class,
	TC91StageSet.class,
	TC92StageSet.class,
	TC93StageSet.class,
	TC94StageSet.class,
	TC95StageSet.class,
	TC96StageSet.class,
	TC97StageSet.class,
})

public class Compass extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(Compass.class); 
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("**************************************");
    	LOGGER.info("*  Ejecutando flujo de Compass DPS   *");
    	LOGGER.info("**************************************");
    }
}
