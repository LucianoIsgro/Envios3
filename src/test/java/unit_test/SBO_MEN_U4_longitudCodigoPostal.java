package unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Clases.Domicilio;

class SBO_MEN_U4_longitudCodigoPostal {

	@Test
	void validarLongitudCodigoPostal() {
		Integer longitud = Domicilio.codigoPostal.length();
		
		assertEquals(longitud, 4);
	}

}
