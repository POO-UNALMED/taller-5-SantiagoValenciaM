package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;
public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private  ArrayList<Animal> an = new ArrayList<>();
		
	public Zona(String nombre, Zoologico zoo) {
		super();
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public void agregarAnimales(Animal a) {
		an.add(a);
	}
	
	public Zona() {
		super();
	}
	
	public int cantidadAnimales() {
		return an.size();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public ArrayList<Animal> getAnimal() {
		return an;
	}

	public void setAnimal(ArrayList<Animal> animal) {
		this.an = animal;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
}