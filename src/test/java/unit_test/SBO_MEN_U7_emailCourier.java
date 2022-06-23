package unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Clases.Courier;

class SBO_MEN_U7_emailCourier {

	@Test
	void validarFormatoMailCourier() {
		boolean formatoMail = Courier.email.matches("^(.+)@(.+)$") && Courier.email.contains(".");
		
		assertEquals(formatoMail, true);
	}

}
