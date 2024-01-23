package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ejemplos.Calculadora;

class CalculadoraTest {

	
	@Test
	@DisplayName("prueba sumas dos números positivos")
	public void testSuma() {
		double valorEsperado=30;
		Calculadora calcu= new Calculadora (20,10);
		double resultado= calcu.suma();
		assertEquals(valorEsperado,resultado);
		
	}
	@Test
	@DisplayName("multiplica dos numeros positivos")
	public void testMulti() {
		double valorEsperado=200;
		Calculadora calcu= new Calculadora (20,10);
		double resultado= calcu.multiplica();
		assertEquals(valorEsperado,resultado);
		
	}
	@Test
	@DisplayName("resta dos numeros positivos, el segundo menor que el primero")
	public void testResta() {
		double valorEsperado=10;
		Calculadora calcu= new Calculadora (20,10);
		double resultado= calcu.resta();
		assertEquals(valorEsperado,resultado);
		
	}
	@Test
	@DisplayName("divide dos numeros positivos")
	public void testDivide() {
		double valorEsperado=2;
		Calculadora calcu= new Calculadora (20,10);
		double resultado= calcu.divide();
		assertEquals(valorEsperado,resultado);
		
	}
	@Test
	@DisplayName("divide por 0")
	public void testDivide0() {
		
		Calculadora calcu= new Calculadora (20,0);
		Exception exception =assertThrows(ArithmeticException.class,()-> calcu.divide0());
		assertEquals("División por 0",exception.getMessage());
		
	}
	
	

}
