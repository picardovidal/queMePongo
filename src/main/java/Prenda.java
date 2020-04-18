
public class Prenda {
	
	TipoDePrenda tipo;
	Color color;
	Color colorSecundario;
	Material material;
	String nombre;
	
	Prenda(String _nombre, TipoDePrenda _tipo, Color _color,Material _material, Color _colorSecundario) {
		// valido nulls
		if (_tipo == null) throw new PrendaInvalidaException("No se pueden crear prendas sin tipo");
		if (_color == null) throw new PrendaInvalidaException("No se pueden crear prendas sin color");
		if (_material == null) throw new PrendaInvalidaException("No se pueden crear prendas sin material");
		
		
		tipo = _tipo;
		color = _color;
		material = _material;
		nombre = _nombre;
		colorSecundario = _colorSecundario;
	}
	
	Categoria getCategoria() {
		return tipo.getCategoria();
	}
}


