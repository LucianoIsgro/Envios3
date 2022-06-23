package enviosPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import Clases.Envio;

@SpringBootTest
class Envios3ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Test
	void validarLongitudCodigoEnvio() {
		Integer longitud = Envio.codigoEnvio.length();
		assertEquals(longitud, 10);
	}
	
	
	

}
