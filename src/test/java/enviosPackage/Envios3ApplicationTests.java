package enviosPackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Objects;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import Clases.Courier;
import Clases.Domicilio;
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
	
	@Test
	void validarFormatoCodigoEnvio() {
		boolean formato = Envio.codigoEnvio.matches("^[A-Z0-9]+");
		
		assertEquals(true, formato);
	}
	@Test
		void validarContenidoObservaciones() {
			boolean contenido = Envio.observaciones[0].isEmpty();
			assertEquals(contenido, false);
		}
	
	@Test
	void validarLongitudCodigoPostal() {
		Integer longitud = Domicilio.codigoPostal.length();
		
		assertEquals(longitud, 4);
	}
	
	@Test
	void validarFormatoCodigoPostal() {
		boolean formato = Domicilio.codigoPostal.matches("^[0-9]+");
		
		assertEquals(formato, true);
	}
	
	@Test
	void validarContenidoEstadoEnvio() {
		boolean estadovacio = Envio.estado.isEmpty();
		
		assertEquals(estadovacio, false);
	}
	@Test
	void validarFormatoMailCourier() {
		boolean formatoMail = Courier.email.matches("^(.+)@(.+)$") && Courier.email.contains(".");
		
		assertEquals(formatoMail, true);
	}

	@Test
	void validarNuevasObservaciones() {
		boolean ultimaobs = Envio.observaciones[Envio.observaciones.length-1].isEmpty();
		
		assertEquals(ultimaobs, false);
	}
	@Test
	void validarcontenidoCodigoPostal() {
		boolean formatopostal = Domicilio.codigoPostal.isEmpty();
		
		assertEquals(formatopostal, false);
	}
	
	@Test
	void validarFormatoPrecio() {
		DecimalFormat  formato1 = new DecimalFormat("#.##");
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
	    dfs.setDecimalSeparator('.');
	    formato1.setDecimalFormatSymbols(dfs);
		
		boolean formatoprecio = Double.parseDouble(formato1.format(Envio.precio)) == Envio.precio;
		
		assertEquals(formatoprecio, true);
	}
	
	
	@Test
	void validarClaseCourier() {
		boolean courierAtr = Stream.of(Courier.telefono, Courier.email, Courier.nombreCourier, Courier.direccion).anyMatch(Objects::isNull);
		
		assertEquals(courierAtr, false);
	}
	
	@Test
	void validarCodigoAreaCourier() {
		String codArea = Courier.telefono.substring(0,5);
		
		assertEquals(codArea, "+54 9");
	}

	

	
	
	

}
