package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Persoonal {
	List<Persoona> lista1 = new ArrayList<Persoona>();
	List<Llamada> lista2 = new ArrayList<Llamada>();

	SortedSet<String> guia = new TreeSet<String>();
	
	public boolean agregarTelefono(String str) {
		boolean encontre = guia.contains(str);
		if (!encontre) {
			guia.add(str);
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;
		}
	}
	
	
	public Persoona registrarUsuario(String data, String nombre, String t) {
		Persoona var = new Persoona();
		String tel = guia.last();
		guia.remove(tel);
		var.instanciacionPersona(data, nombre, t, tel);
		var.sis = this;
		lista1.add(var);
		return var;
	}

	public boolean eliminarUsuario(Persoona p) {
		List<Persoona> l = p.sis.lista1.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < lista1.size()) {
			this.lista1 = l;
			this.guia.add(p.getTel());
			borre = true;
		}
		return borre;
		
	}
	
	
	public Llamada registrarLlamada(Persoona persona1, Persoona persona2, String tipoL, int dur) {
        Llamada x = new Llamada(tipoL,persona1.getTel(),persona2.getTel(),dur);
        lista2.add(x);
        persona1.lista1.add(x);
        return x;

    }
	
	public double calcularMontoTotalLlamadas(Persoona p) {
		double c = 0;
		Persoona aux = null;
		for (Persoona pp : lista1) {
			if (pp.tel == p.getTel()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.lista1) {
				double auxc = 0;
				auxc = l.calcularPrecioLlamada(auxc);
				c += aux.calcularDesc(auxc);
			}
		}
		return c;
	}


	public int cantidadDeUsuarios() {
		return lista1.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return lista1.contains(persona);
	}
	
}
