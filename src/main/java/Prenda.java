
public class Prenda {
	
	TipoDePrenda tipo;
	Categoria categoria;
	Color color;
	Color colorSecundario;
	Material material;
	String nombre;
	
	Prenda(String _nombre, TipoDePrenda _tipo,Categoria _categoria, Color _color,Material _material, Color _colorSecundario) throws Exception{
		// valido nulls
		if (_tipo == null) throw new NullPointerException("No se pueden crear prendas sin tipo");
		if (_categoria == null) throw new NullPointerException("No se pueden crear prendas sin categoría");
		if (_color == null) throw new NullPointerException("No se pueden crear prendas sin color");
		if (_material == null) throw new NullPointerException("No se pueden crear prendas sin material");
		
		//valido que el tipo y la categoria del tipo coincidan
		if (!_tipo.getCategoria().equals(_categoria)) throw new Exception("La categoría no se condice con su tipo");
		
		tipo = _tipo;
		categoria = _categoria;
		color = _color;
		material = _material;
		nombre = _nombre;
		colorSecundario = _colorSecundario;
	}
}
