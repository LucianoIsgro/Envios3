package unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Clases.Domicilio;

class SBO_MEN_U9_contenidoCodigoPostal {

	@Test
	void validarcontenidoCodigoPostal() {
		boolean formatopostal = Domicilio.codigoPostal.isEmpty();
		
		assertEquals(formatopostal, false);
	}

}
