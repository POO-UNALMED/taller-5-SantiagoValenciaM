package zooAnimales;

import java.util.ArrayList;
public class Mamifero extends Animal{
	
	private static ArrayList<Mamifero>listaan= new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listaan.add(this);
	}
	public Mamifero() {
		super();
		listaan.add(this);
	}
	
	public static Mamifero crearCaballo(String nombre,int edad, String genero) {
		Mamifero mamifero1 = new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos++;
		return mamifero1;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero mamifero1= new Mamifero(nombre,edad,"selva",genero,true,4);
		leones++;
		return mamifero1;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		return listaan.size();
	}
}