package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Fisica extends TipoPersona {

	static double descuento = 0;
	
	public double calcularDesc(double m) {
		m -= m*descuento;
		return m;
	}
}
