
public enum TipoDePrenda {
	zapato{
		public Categoria getCategoria(){
			return Categoria.calzado;
		}
	},
	camisa{
		public Categoria getCategoria(){
			return Categoria.parteSuperior;
		}
	},
	pantalon{
		public Categoria getCategoria(){
			return Categoria.parteInferior;
		}
	};
	
	public abstract Categoria getCategoria();
}
