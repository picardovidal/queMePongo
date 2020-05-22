import java.util.Optional;

public class Borrador {
	TipoDePrenda tipo;
	Color colorPrincipal;
	Optional<Color> colorSecundario;
	Material material;
	String nombre;
	Trama trama = Trama.lisa;
	Integer temperaturaAdecuada;
	
	public Borrador(TipoDePrenda _tipo)
	{
		if (_tipo == null) throw new PrendaInvalidaException("No se pueden crear prendas sin tipo");
		tipo = _tipo;
	}

	public void especificarColorPrincipal(Color _color)
	{
		if (_color == null) throw new PrendaInvalidaException("No se pueden crear prendas sin color");
		colorPrincipal = _color;
	}


	 public void  especificarMaterial(Material _material)
	 {
		if (_material == null) throw new PrendaInvalidaException("No se pueden crear prendas sin material");			
	    material = _material;
	 }
    
	 public void  especificarTemperaturaAdecuada(Integer _temperatura)
	 {		
		temperaturaAdecuada = _temperatura;
	 }
	 
 	 public Prenda crearPrenda() {
 		 return new Prenda(tipo, colorPrincipal, material,  colorSecundario, trama,temperaturaAdecuada);
 	 }
}
