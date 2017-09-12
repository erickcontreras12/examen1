/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.FabricaRanger;

/**
 *
 * @author Erick Contreras
 */
public class Monstruo implements FabricaRanger{
	private String nombre;
	private String elemento;
	private int edad;
	private String color;
	private Monstruo[] lista;
	private int centinela = -1;
	
	/**
	 * 
	 * @param nombre
	 * @param elemento
	 * @param edad
	 * @param color
	 */
	public Monstruo(String nombre, String elemento, int edad, String color) {
		super();
		this.nombre = nombre;
		this.elemento = elemento;
		this.edad = edad;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String agigantarse() {
		return "Soy " + nombre + " y estoy creciendo";
	}
	
	public String caminarLento() {
		return "Soy " + nombre + " y estoy caminando";
	}
	
	public String golpear() {
		return "Soy " + nombre + " y estoy golpeando";
	}
	
	public String volar() {
		if(elemento.equals("aire")) {
			return "Soy " + nombre + " y estoy volando";
		}else {
			return "Soy " + nombre + " y no puedo volar";
		}
	}
	
	public String quemar() {
		if(elemento.equals("fuego")) {
			return "Soy " + nombre + "y estoy quemando";
		}else{
			return "Soy " + nombre + " y no puedo quemar";
		}
	}
	@Override
	/**
	 * El método llama al método toString() y a los otros metodos ya que al crear el Monstruo en la clase Main
	 * este solo puede llamar a los métodos dentro de FabricaRanger.java
	 */
	public void hacerAlgo() {
		// TODO Auto-generated method stub
		System.out.println(toString());
		System.out.println(agigantarse());
		System.out.println(caminarLento());
		System.out.println(volar());
		System.out.println(quemar());
		System.out.println(golpear());
	}

	@Override
	/**
	 * Ingresa a la pila al monstruo deseado
	 * @param monstruo Monstruo para trabajar
	 */
	public boolean apilar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		if(centinela < lista.length) {
			lista[centinela + 1] = monstruo;
			return true;
		}else {
		return false;
		}
	}

	@Override
	/**
	 * Saca de la pila al monstruo deseado
	 * @param monstruo Monstruo para trabajar
	 */
	public boolean desapilar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		if(lista[lista.length - 1] != null) {
			lista[lista.length - 1] = null;
			return true;
		}else {
			return false;
		}
	}

	@Override
	/**
	 * Ingresa a la cola al monstruo deseado
	 * @param monstruo Monstruo para trabajar
	 */
	public boolean encolar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		if(centinela < lista.length) {
			lista[centinela + 1] = monstruo;
			return true;
		}else {
		return false;
		}
	}

	@Override
	/**
	 * Saca de la cola al monstruo deseado
	 * @param monstruo Monstruo para trabajar
	 */
	public boolean desencolar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		if(lista[0] != null) {
			lista[0] = null;
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Crea un monstruo con propiedades nulas
	 * @param elemento elemento del monstruo
	 */
	@Override
	public Monstruo fabricar(String elemento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Monstruo [nombre=" + nombre + ", elemento=" + elemento + ", edad=" + edad + ", color=" + color + "]";
	}
    
	
}
