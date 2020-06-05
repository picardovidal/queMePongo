
public class IncluirPrenda implements Propuesta  {

	private boolean aplicada;
	private Prenda prenda;
	
	public IncluirPrenda(Prenda _prenda) {
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
			guardarropa.excluirPrenda(this.prenda);
		}
	}

	@Override
	public void Apicar(Guardarropa guardarropa) {
		// si aun no fue aplicada la aplico
		if (!aplicada) {
			aplicada = true;
			guardarropa.incluirPrenda(this.prenda);
		}
	}

}
