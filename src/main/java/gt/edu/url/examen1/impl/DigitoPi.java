package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.Chudnovsky;
 /**
  * 
  * @author Erick Contreras
  *
  */
public class DigitoPi implements Chudnovsky{
	
	/**
	 * 
	 * @param cantidadDigitos
	 * @return Sumatoria de numeros
	 */
	@Override
	public double calcularPi(int cantidadDigitos) {
		if(cantidadDigitos == 0) {
			return 0;
		}else {
			return  (Factorial(6*cantidadDigitos)*(545140134*cantidadDigitos+13591409))/(Factorial(3*cantidadDigitos)*Potencia(Factorial(cantidadDigitos),3)*Potencia(-2.625374127E17,cantidadDigitos)) + calcularPi(cantidadDigitos-1);
		}
	}
	/**
	 * 
	 * @param k Numero para calcular factorial
	 * @return Factorial de un numero
	 */
	public int Factorial(int k) {
		if(k==0) {
			return 1;
		}else {
			return k * Factorial(k-1);
		}
	}
	/**
	 * 
	 * @param base
	 * @param exponente
	 * @return
	 */
	public double Potencia(double base, int exponente) {
		if(exponente==0) {
			return 1;
		}else {
			return base * Potencia(base,exponente-1);
		}
	}
}
