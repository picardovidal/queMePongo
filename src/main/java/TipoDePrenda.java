
public enum TipoDePrenda {
	zapato{
		public Categoria getCategoria(){
			return Categoria.calzado;
		}
	},
	zapatilla{
		public Categoria getCategoria(){
			return Categoria.calzado;
		}
	},
	chomba{
		public Categoria getCategoria(){
			return Categoria.parteSuperior;
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
	},
	pantalonDeVestir{
		public Categoria getCategoria(){
			return Categoria.parteInferior;
		}
	},
	gorro{
		public Categoria getCategoria(){
			return Categoria.accesorios;
		}
	};
	
	
	public abstract Categoria getCategoria();
}
