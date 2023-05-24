package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada {
	protected String tipoDeLlamada;
	private String emisor;
	private String remitente;
	public int dur;
	
	
	public Llamada(String tipoLlamada, String emi, String remi, int dur) {
		this.tipoDeLlamada = tipoLlamada;
		this.emisor= emi;
		this.remitente= remi;
		this.dur = dur;
	}

	public String getTipoDeLlamada() {
		return tipoDeLlamada;
	}

	public void setTipoDeLlamada(String tipoDeLlamada) {
		this.tipoDeLlamada = tipoDeLlamada;
	}
	public void setEmisor(String q) {
		emisor = q;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	
	public double calcularPrecioLlamada(double auxc) {
		// TODO Auto-generated method stub
		if (this.tipoDeLlamada == "nacional") {
			auxc += this.dur *3 + (this.dur*3*0.21);
		} else if (this.tipoDeLlamada == "internacional") {
			auxc += this.dur *200 + (this.dur*200*0.21);
		}
		return auxc;
	}
	
	
	
}
