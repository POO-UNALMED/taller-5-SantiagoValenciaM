package zooAnimales;

import java.util.ArrayList;
public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio> listaan = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listaan.add(this);
	}

	public Anfibio() {
		super();
		listaan.add(this);
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static Anfibio crearRana(String nombre,int edad, String genero) {
		Anfibio anfibio1 = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return anfibio1;
	}
	public static Anfibio crearSalamandra(String nombre,int edad, String genero) {
		Anfibio anfibio1 = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return anfibio1;
	}
	
	public static int cantidadAnfibios() {
		return listaan.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
}