package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persoona {
	public List<Llamada> lista1 = new ArrayList<Llamada>();
	public String nya;
	public String tel;
	public String cuit;
	public String doc;
	public Persoonal sis;
	public TipoPersona tipo;
	
	public List<Llamada> getLista1() {
		return lista1;
	}
	public void setLista1(List<Llamada> lista1) {
		this.lista1 = lista1;
	}

	public String getNya() {
		return nya;
	}
	public void setNya(String nya) {
		this.nya = nya;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	
	public void setTipoPersona(String t,String data) {
		if(t.equals("juridica")) {
			Juridica j = new Juridica();
			this.tipo = j; 
			this.setCuit(data);
		}else {
			Fisica f= new Fisica();
			this.tipo = f;
			this.setDoc(data);;
		}
	}
	
	public TipoPersona getTipoPersona() {
		return this.tipo;
	}
	
	
		
	public double calcularDesc(double auxc) {
		// TODO Auto-generated method stub
		return this.tipo.calcularDesc(auxc);
	}
	public void instanciacionPersona(String data, String nombre, String t, String tel) {
		setNya(nombre);
		setTipoPersona(t, data);
		setTel(tel);
	}
	

	
}
