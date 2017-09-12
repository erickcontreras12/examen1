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
		return "Soy " + nombre + "y estoy creciendo";
	}
	
	public String caminarLento() {
		return "Soy " + nombre + "y estoy caminando";
	}
	
	public String golpear() {
		return "Soy " + nombre + "y estoy golpeando";
	}
	@Override
	public void hacerAlgo() {
		// TODO Auto-generated method stub
		if(elemento.equals("aire")) {
			System.out.println("Soy " + nombre + "y estoy volando");
		}else if(elemento =="fuego"){
			System.out.println("Soy " + nombre + "y estoy quemando");
		}
	}

	@Override
	public boolean apilar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		if(centinela > lista.length) {
			
		}
		return false;
	}

	@Override
	public boolean desapilar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean encolar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean desencolar(Monstruo monstruo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Monstruo fabricar(String elemento) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
