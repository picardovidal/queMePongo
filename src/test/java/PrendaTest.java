import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PrendaTest {

	private Borrador borrador;

    @Before
    public void init() {
	    borrador = new Borrador(TipoDePrenda.zapato);
    }
	
    @Test(expected = PrendaInvalidaException.class)
    public void CrearBorradorConTipoNull() {
    	Borrador borrador2 = new Borrador(null);
    }
	
	@Test(expected = PrendaInvalidaException.class)
	public void NoEspecificaColorValido() throws Exception{
		borrador.especificarColorPrincipal(null);
	}
	
	@Test(expected = PrendaInvalidaException.class)
	public void NoEspecificaMaterialValido() throws Exception{
		borrador.especificarMaterial(null);
	}
	
	@Test
	public void CreaPrenda()
	{
		borrador.especificarColorPrincipal(new Color("Blanco"));
		borrador.especificarMaterial(Material.Pique);
		assertNotNull(borrador.crearPrenda());
	}
}
