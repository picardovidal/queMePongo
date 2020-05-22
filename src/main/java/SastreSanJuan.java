
public class SastreSanJuan extends Sastre {

	@Override
	protected Prenda fabricarParteSuperior() {
		// TODO Auto-generated method stub
		Borrador borrador = new Borrador(TipoDePrenda.chomba);
        borrador.especificarColorPrincipal(new Color("Verde"));
        borrador.especificarMaterial(Material.Pique);
        return borrador.crearPrenda() ;          
	}

	@Override
	protected Prenda fabricarParteInferior() {
		Borrador borrador = new Borrador(TipoDePrenda.pantalon);
        borrador.especificarColorPrincipal(new Color("Gris"));
        borrador.especificarMaterial(Material.Acetato);
        return borrador.crearPrenda() ; 
	}

	@Override
	protected Prenda fabricarCalzado() {
		Borrador borrador = new Borrador(TipoDePrenda.zapatilla);
        borrador.especificarColorPrincipal(new Color("Blanca"));
        return borrador.crearPrenda() ; 
	}

}
