import java.util.Optional;

public class Prenda {
	
	TipoDePrenda tipo;
	Color color;
	Optional<Color> colorSecundario;
	Material material;
	Trama trama;
	Integer temperaturaAdecuada;
	
	Prenda(TipoDePrenda _tipo, Color _color,Material _material, Optional<Color> _colorSecundario, Trama _trama, Integer _temperaturaAdecuada) {
		tipo = _tipo;
		color = _color;
		material = _material;
		colorSecundario = _colorSecundario;
		trama = _trama;
		temperaturaAdecuada =  _temperaturaAdecuada;
	}
	
	Categoria getCategoria() {
		return tipo.getCategoria();
	}
	
	public boolean esAcordeParaLaTemperatura(Integer temperatura)
	{
		return temperatura <= temperaturaAdecuada;
	}
}


