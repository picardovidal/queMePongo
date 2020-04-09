import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PrendaTest {

	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	 
	@Test
	public void EsValidaErrorCategoria() throws Exception {
		Color c = new Color();
		TipoDePrenda t = TipoDePrenda.zapato;
		Categoria cat = Categoria.parteInferior;
		Material m = new Material();

		exceptionRule.expect(Exception.class);
	    exceptionRule.expectMessage("La categoría no se condice con su tipo");
	    new Prenda("Prueba",t, cat, c,m, null);
	}
	
	@Test
	public void EsValidaColorNulo() throws Exception{
		Color c = null;
		TipoDePrenda t = TipoDePrenda.zapato;
		Categoria cat = Categoria.calzado;
		Material m = new Material();
		
		exceptionRule.expect(NullPointerException.class);
	    exceptionRule.expectMessage("No se pueden crear prendas sin color");
	    new Prenda("Prueba",t, cat, c,m, null);
	}
	
	@Test
	public void EsValidaMaterialNulo() throws Exception{
		Color c = new Color();
		TipoDePrenda t = TipoDePrenda.zapato;
		Categoria cat = Categoria.calzado;
		Material m = null;
		
		exceptionRule.expect(NullPointerException.class);
	    exceptionRule.expectMessage("No se pueden crear prendas sin material");
	    new Prenda("Prueba",t, cat, c,m, null);
	}
	
	@Test
	public void EsValidaTipoNulo() throws Exception {
		Color c = new Color();
		TipoDePrenda t = null;
		Categoria cat = Categoria.calzado;
		Material m = new Material();

		exceptionRule.expect(NullPointerException.class);
	    exceptionRule.expectMessage("No se pueden crear prendas sin tipo");
	    new Prenda("Prueba",t, cat, c,m, null);
	}
	
	@Test
	public void EsValidaCategoriaNulo() throws Exception{
		Color c = new Color();
		TipoDePrenda t = TipoDePrenda.zapato;
		Categoria cat = null;
		Material m = new Material();

		exceptionRule.expect(NullPointerException.class);
	    exceptionRule.expectMessage("No se pueden crear prendas sin categoría");
	    new Prenda("Prueba",t, cat, c,m, null);
	}
}
