import java.util.Optional;

public class Prenda {
	
	TipoDePrenda tipo;
	Color color;
	Optional<Color> colorSecundario;
	Material material;
	Trama trama;
	
	Prenda(TipoDePrenda _tipo, Color _color,Material _material, Optional<Color> _colorSecundario, Trama _trama) {
		tipo = _tipo;
		color = _color;
		material = _material;
		colorSecundario = _colorSecundario;
		trama = _trama;
	}
	
	Categoria getCategoria() {
		return tipo.getCategoria();
	}
	
}


