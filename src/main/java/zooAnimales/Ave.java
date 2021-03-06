package zooAnimales;

import java.util.ArrayList;
public class Ave extends Animal {
	
	private static ArrayList<Ave>listaan= new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listaan.add(this);
	}
	public Ave() {
		super();
		listaan.add(this);
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static  Ave crearHalcon(String nombre,int edad,String genero) {
		Ave ave1 = new Ave(nombre,edad,"monta�as",genero,"cafe glorioso");
		halcones++;
		return ave1;
	}
	
	public static  Ave crearAguila(String nombre,int edad,String genero) {
		Ave ave1 = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return ave1;
	}
	
	public static int  cantidadAves() {
		return listaan.size();
	}
	
	public String movimiento() {
		return "volar";
	}
}