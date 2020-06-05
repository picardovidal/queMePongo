import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
	private String nombre;
	private List<Prenda> prendas;
	private List<Propuesta> propuestas;
	
	public Guardarropa(String _nombre) {
		this.nombre = _nombre;
		prendas = new ArrayList<Prenda>();
		propuestas = new ArrayList<Propuesta>();
	}
	
	public void agregarPrenda(Prenda prenda, Usuario user) {
		//si el usuario posee este guardarropa agrego la prenda al listado, sino creo una propuesta para que alguien luego la valide.
		if (user.mePerteneceEsteGuardarropa(this))
			incluirPrenda(prenda);
		else {
			Propuesta p = new IncluirPrenda(prenda);
			propuestas.add(p);		
		}
	}
	
	public void quitarPrenda(Prenda prenda, Usuario user) {
		//si el usuario posee este guardarropa quito la prenda al listado, sino creo una propuesta para que alguien luego la valide.
		if (user.mePerteneceEsteGuardarropa(this))
			excluirPrenda(prenda);
		else {
			Propuesta p = new QuitarPrenda(prenda);
			propuestas.add(p);		
		}
	}
	
	public void aplicarPropuesta(Propuesta p) {
		if (propuestas.contains(p))
			p.Apicar(this);
	}
	
	public void deshacerPropuesta(Propuesta p) {
		if (propuestas.contains(p))
			p.volverAtras(this);
	}

	public void incluirPrenda(Prenda prenda) {
		//verifico que el guardarropa no posea ya la prenda
		if(!prendas.contains(prenda))
		{
			prendas.add(prenda);
		}
	}

	public void excluirPrenda(Prenda prenda) {
		//verifico que el guardarropa posea ya la prenda
		if(prendas.contains(prenda))
		{
			prendas.remove(prenda);
		}
	}
}
