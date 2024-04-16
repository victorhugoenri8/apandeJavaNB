package abstract2;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String nombre;
	static double totalTiempo;
	private String pais;
	private ArrayList<Ciclistas> nuevoEquipo;

//contructor
	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		this.nuevoEquipo= new ArrayList<>();
		
	}

//metodos
	public void anadirCiclistas(Ciclistas a){
		this.nuevoEquipo.add(a);
	};
	public void calcularTiempoTotal(){
		for (int i = 0; i < nuevoEquipo.size(); i++) {
			Ciclistas c = (Ciclistas) nuevoEquipo.get(i);
		Equipo.totalTiempo= Equipo.totalTiempo +c.getTiempoAcumulado() ;
		}
		System.out.println(Equipo.totalTiempo);
	};

	public void listarEquipo(){
			System.out.println("nombre del equipo: ");
		for (int i = 0; i < nuevoEquipo.size(); i++) {
			Ciclistas c = (Ciclistas) nuevoEquipo.get(i);
			System.out.println(c.getNombre());
		
		}
	};

	public void buscarCiclista(){};

	public void imprimir(){};



//gett y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}




}
