package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio>lista1= new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		lista1.add(this);
	}

	public Anfibio() {
		super();
		lista1.add(this);
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static Anfibio crearRana(String nombre,int edad, String genero) {
		Anfibio a = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return a;
	}
	public static Anfibio crearSalamandra(String nombre,int edad, String genero) {
		Anfibio a = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return a;
	}
	
	public static int cantidadAnfibios() {
		return lista1.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
}