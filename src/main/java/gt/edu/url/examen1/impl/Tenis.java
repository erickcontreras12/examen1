package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.Reportero;
/**
 * 
 * @author Erick Contreras
 *
 */
public class Tenis implements Reportero{
	private String[] lista = new String[9];
	private int contador = 0;
	@Override
	/**
	 * Calcula el ganador del set por los juegos que lleva cada jugador
	 * @param a Juegos ganados por el jugador A
	 * @param b Juegos ganados por el jugador B
	 */
	public String calcularGanador(int a, int b) {
		// TODO Auto-generated method stub
		String resultado = "";
		if(a <= 7 && b <=7) {
			if(a == 7 || b == 7) {
				if(a == b + 1 || a == b + 2) {
					resultado = "Gana A";
				}else if(b == a + 1 || b == a + 2) {
					resultado = "Gana B";
				}else {
					resultado = "Juego invalido";
				}
			}
			
			else if(a == 6 || b == 6) {
				if(a >= b + 2) {
					resultado = "Gane A";
				}else if(b >= a + 2) {
					resultado = "Gana B";
				}else {
					resultado = "El juego continua";
				}
			}
			
			else {
				resultado = "El juego continua";
			}
		}else {
			resultado = "Juego invalido";
		}
		
		apilar(resultado);
		return resultado;
		
	}

	@Override
	public String calcularCampeon() {
		// TODO Auto-generated method stub
		int a=0,b=0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]!= null && lista[i]=="Gana A") {
				a++;
			}else if(lista[i]!= null && lista[i]=="Gana B") {
				b++;
			}
		}
		
		if(a > b) {
			return "A es el campeon";
		}else if(b > a) {
			return "B es el campeon";
		}else {
			return "Ambos han ganando la misma cantidad de sets";
		}
	}

	@Override
	public String recordarGanador(int juego) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void apilar(String s) {
		if(lista[contador]==null) {
			lista[contador] = s;		
			contador++;
		}
	}
}
