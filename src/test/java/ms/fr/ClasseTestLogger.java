package ms.fr;

import org.junit.Test;
import org.slf4j.*;

public class ClasseTestLogger{
	
	static Logger logger = LoggerFactory.getLogger(ClasseTestLogger.class);

	@Test
	public void whatColor () {
		Voiture car = new Voiture("rouge");
		String couleur = car.getCouleur();
		logger.info("la voiture est "+ couleur);
	}
	
	@Test
	public void testLogger() {
		logger.info("Test une info");
		logger.error("Test une erreur");
		logger.warn("Test d'un warn");
		logger.debug("Test d'un debug");
		logger.trace("Test d'un trace");
		
	}

}
