package unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Clases.Envio;

class SBO_MEN_U2_formatoCodigoEnvio {

	@Test
	void validarFormatoCodigoEnvio() {
		boolean formato = Envio.codigoEnvio.matches("^[A-Z0-9]+");
		
		assertEquals(true, formato);
	}

}
