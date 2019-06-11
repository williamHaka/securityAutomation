package cl.security.qaAutomation.flow;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.security.qaAutomation.stageSet.CompassStageSet;
import cl.security.qaAutomation.stageSet.PropuestaCompassStageSet;


@SuiteClasses({
	PropuestaCompassStageSet.class,CompassStageSet.class,
})

public class CompassTest extends BaseFlow{
	private static final Logger LOGGER = LoggerFactory.getLogger(CompassTest.class);
    @BeforeClass
    public static void flag() throws Exception {
        LOGGER.info("Ejecutando flujo de formulario DPS");
    }
}
