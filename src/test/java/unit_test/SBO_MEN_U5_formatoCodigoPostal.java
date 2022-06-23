package unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Clases.Domicilio;

class SBO_MEN_U5_formatoCodigoPostal {

	@Test
	void validarFormatoCodigoPostal() {
		boolean formato = Domicilio.codigoPostal.matches("^[0-9]+");
		
		assertEquals(formato, true);
	}

}
