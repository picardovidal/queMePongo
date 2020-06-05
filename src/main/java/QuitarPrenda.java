
public class QuitarPrenda implements Propuesta {

	private boolean aplicada;
	private Prenda prenda;
	
	public QuitarPrenda(Prenda _prenda) {
		// TODO Auto-generated constructor stub
		this.prenda = _prenda;
		this.aplicada = false;
	}

	@Override
	public void volverAtras(Guardarropa guardarropa) {
		// TODO Auto-generated method stub
		if(aplicada)
		{
			aplicada = false;
			guardarropa.incluirPrenda(this.prenda);
		}
	}

	@Override
	public void Apicar(Guardarropa guardarropa) {
		// si aun no fue aplicada la aplico
		if (!aplicada) {
			aplicada = true;
			guardarropa.excluirPrenda(this.prenda);
		}
	}

}
