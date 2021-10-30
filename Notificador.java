interface Notificador {
	public void notificar(Pago pago);
}

public class NotificacionSMS implements Notificador{
	
	public void notificar(Pago pago){
		//Send SMS
	}
}
public class NotificacionEmail implements Notificador{
	
	public void notificar(Pago pago){
		//Send EMAIL
	}
}
public class NotificacionTelegram implements Notificador{
	
	public void notificar(Pago pago){
		//Send Telegram
	}
}

