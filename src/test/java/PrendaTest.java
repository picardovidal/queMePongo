import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PrendaTest {

	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void EsValidaColorNulo() throws Exception{
		Color c = null;
		TipoDePrenda t = TipoDePrenda.zapato;
		Material m = new Material();
		
		exceptionRule.expect(PrendaInvalidaException.class);
	    exceptionRule.expectMessage("No se pueden crear prendas sin color");
	    new Prenda("Prueba",t, c,m, null);
	}
	
	@Test
	public void EsValidaMaterialNulo() throws Exception{
		Color c = new Color();
		TipoDePrenda t = TipoDePrenda.zapato;
		Material m = null;
		
		exceptionRule.expect(PrendaInvalidaException.class);
	    exceptionRule.expectMessage("No se pueden crear prendas sin material");
	    new Prenda("Prueba",t, c,m, null);
	}
	
	@Test
	public void EsValidaTipoNulo() throws Exception {
		Color c = new Color();
		TipoDePrenda t = null;
		Material m = new Material();

		exceptionRule.expect(PrendaInvalidaException.class);
	    exceptionRule.expectMessage("No se pueden crear prendas sin tipo");
	    new Prenda("Prueba",t, c,m, null);
	}
	
}
