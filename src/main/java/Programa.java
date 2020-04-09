import java.util.List;

public class Programa {

	List<Prenda> prendas;
	
	void crearPrenda(String _nombre, TipoDePrenda _tipo,Categoria _categoria, Color _color,Material _material, Color _colorSecundario) 
	{	
		try {
			Prenda p = new Prenda(_nombre,_tipo,_categoria,_color,_material,_colorSecundario);
			prendas.add(p);
		}
		catch (Exception e) {
            e.printStackTrace();
		}
	}
}
