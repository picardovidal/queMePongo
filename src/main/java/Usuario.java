import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private List<Guardarropa> misGuardarropas;
	
	public Usuario() {
		misGuardarropas = new ArrayList<Guardarropa>();
	}
	
	public void agregarGuardarropa(Guardarropa guardarropa)
	{
		if (!misGuardarropas.contains(guardarropa)) {
			misGuardarropas.add(guardarropa);
		}
	}
	
	public void quitarGuardarropa(Guardarropa guardarropa) {
		if (misGuardarropas.contains(guardarropa)) {
			misGuardarropas.remove(guardarropa);
		}
	}

	public boolean mePerteneceEsteGuardarropa(Guardarropa guardarropa) {
		// TODO Auto-generated method stub
		return misGuardarropas.contains(guardarropa);
	}
}
