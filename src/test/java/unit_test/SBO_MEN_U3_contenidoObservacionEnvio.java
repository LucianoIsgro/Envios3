package unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Clases.Envio;

class SBO_MEN_U3_contenidoObservacionEnvio {

	@Test
	void validarContenidoObservaciones() {
		boolean contenido = Envio.observaciones[0].isEmpty();
		assertEquals(contenido, false);
	}

}
