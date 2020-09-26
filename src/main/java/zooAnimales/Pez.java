package zooAnimales;

import java.util.ArrayList;
public class Pez extends Animal {
	
	private static ArrayList<Pez>listaan= new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listaan.add(this);
	}

	public Pez() {
		super();
		listaan.add(this);
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public static Pez crearSalmon(String nombre,int edad,String genero) {
		Pez pez1 = new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones++;
		return pez1;
	}
	
	public static Pez crearBacalao(String nombre,int edad,String genero) {
		Pez pez1 = new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos++;
		return pez1;
	}
	
	public static int cantidadPeces() {
		return listaan.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
}