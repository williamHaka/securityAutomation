package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.TC7StageSet;

@SuiteClasses({TC7StageSet.class})

public class TC7Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC7Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC7 *");
        LOGGER.info("****************************************");
    }
}
