package unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Clases.Envio;

class SBO_MEN_U6_contenidoEstadoEnvio {

	@Test
	void validarContenidoEstadoEnvio() {
		boolean estadovacio = Envio.estado.isEmpty();
		
		assertEquals(estadovacio, false);
	}

}
