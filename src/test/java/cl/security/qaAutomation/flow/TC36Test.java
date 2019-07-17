package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.NuevaPropuestaMujerStageSet;
import cl.security.qaAutomation.stageSet.TC36StageSet;

@SuiteClasses({NuevaPropuestaMujerStageSet.class,TC36StageSet.class})

public class TC36Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC36Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("*****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC36 *");
        LOGGER.info("*****************************************");
    }
}