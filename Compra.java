public class Compra {
	private Pago pago;
	private PagoPaypal pagoPaypal;
	private List articulos;
	
	public Compra (Pago pago){
		//inicializaciones
	}
}

public class ManejoArticulos {
	private Compra _compra;
	
	public void agregarArticulo (Articulo articulo, Compra compra){
		//codigo
	}
	public void removerArticulo (Articulo articulo, Compra compra){
		//codigo
	}
}

