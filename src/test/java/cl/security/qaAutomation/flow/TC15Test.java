package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.TC15StageSet;

@SuiteClasses({TC15StageSet.class})

public class TC15Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC15Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("*****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC15 *");
        LOGGER.info("*****************************************");
    }
}
