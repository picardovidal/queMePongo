
public class SastreJhonston extends Sastre {

	@Override
	protected Prenda fabricarParteSuperior() {
		// TODO Auto-generated method stub
		Borrador borrador = new Borrador(TipoDePrenda.camisa);
        borrador.especificarColorPrincipal(new Color("Blanca"));
        return borrador.crearPrenda() ;          
	}

	@Override
	protected Prenda fabricarParteInferior() {
		Borrador borrador = new Borrador(TipoDePrenda.pantalonDeVestir);
        borrador.especificarColorPrincipal(new Color("Negro"));
        return borrador.crearPrenda() ; 
	}

	@Override
	protected Prenda fabricarCalzado() {
		Borrador borrador = new Borrador(TipoDePrenda.zapatilla);
        borrador.especificarColorPrincipal(new Color("Negros"));
        return borrador.crearPrenda() ; 
	}

}
