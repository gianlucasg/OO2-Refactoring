package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Juridica extends TipoPersona {

	static double descuento = 0.15;
	
	public double calcularDesc(double m) {
		m -= m*descuento;
		return m;
	}
}
