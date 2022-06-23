package unit_test;
import Clases.Envio;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.junit.jupiter.api.Test;

class SBO_MEN_U10_formatoPrecioEnvio {

	@Test
	void validarFormatoPrecio() {
		DecimalFormat  formato1 = new DecimalFormat("#.##");
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
	    dfs.setDecimalSeparator('.');
	    formato1.setDecimalFormatSymbols(dfs);
		
		boolean formatoprecio = Double.parseDouble(formato1.format(Envio.precio)) == Envio.precio;
		
		assertEquals(formatoprecio, true);
	}

}
