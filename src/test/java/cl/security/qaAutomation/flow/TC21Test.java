package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.TC21StageSet;

@SuiteClasses({TC21StageSet.class})

public class TC21Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC21Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("*****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC21 *");
        LOGGER.info("*****************************************");
    }
}
