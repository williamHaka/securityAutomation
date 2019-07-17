package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.NuevaPropuestaHombreStageSet;
import cl.security.qaAutomation.stageSet.TC84StageSet;

@SuiteClasses({NuevaPropuestaHombreStageSet.class,TC84StageSet.class})

public class TC84Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC84Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("*****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC84 *");
        LOGGER.info("*****************************************");
    }
}
