package gestion;

import java.util.ArrayList;
public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> listazonas = new ArrayList<>();
			
	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return listazonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.listazonas = zonas;
	}

	public Zoologico() {
		super();
	}

	public int cantidadTotalAnimales() {
		int total=0;
		for(Zona i:listazonas) {
			total=total+i.cantidadAnimales();
		}
		return total;
	}
	
	public void agregarZonas(Zona z) {
		listazonas.add(z);
	}
}