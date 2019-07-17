package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.NuevaPropuestaHombreStageSet;
import cl.security.qaAutomation.stageSet.TC6StageSet;

@SuiteClasses({NuevaPropuestaHombreStageSet.class,TC6StageSet.class})

public class TC6Test extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(TC6Test.class);
    @BeforeClass
    public static void flag() throws Exception {
    	LOGGER.info("****************************************");
        LOGGER.info("*  Ejecutando flujo de Compass DPS TC6 *");
        LOGGER.info("****************************************");
    }
}
