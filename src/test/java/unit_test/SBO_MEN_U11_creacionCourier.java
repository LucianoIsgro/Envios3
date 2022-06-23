package unit_test;
import Clases.Courier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Objects;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class SBO_MEN_U11_creacionCourier {

	@Test
	void validarClaseCourier() {
		boolean courierAtr = Stream.of(Courier.telefono, Courier.email, Courier.nombreCourier, Courier.direccion).anyMatch(Objects::isNull);
		
		assertEquals(courierAtr, false);
	}

}
