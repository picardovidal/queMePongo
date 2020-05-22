
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
	};
	
	
	public abstract Categoria getCategoria();
}
