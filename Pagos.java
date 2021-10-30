interface IPago{
	public void realizarCobro(double monto);
}
public class Impuestos{
	public void calcularImpuestosFactura(){
		//calculo de los impuestos
	}
}
public class Factura{
	public void generarFactura(){
		//generar nueva factura
	}
}

public class PagoPaypal implements IPago{
	private boolean loggedIn;
	private IPagos pago;
	
	public void CobroPaypal(IPago pago){
		if(!loggedIn){
			pago.realizarCobro(double monto){
				//carga los montos de compra
			}
		}
	}
}

