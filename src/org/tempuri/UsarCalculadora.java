package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class UsarCalculadora {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		String url = "http://www.dneonline.com/calculator.asmx?wsdl";
		Calculator calculadora = new Calculator(new URL(url));

		CalculatorSoap calculadoraSoap = calculadora.getCalculatorSoap();

		int resultadoAdd = calculadoraSoap.add(10, 5);
		int resultadoSubs = calculadoraSoap.subtract(120, 30);
		int resultadoMult = calculadoraSoap.add(3, 3);
		int resultadoDiv = calculadoraSoap.add(125, 5);

		System.out.println("Suma: " + resultadoAdd);
		System.out.println("Resta: " + resultadoSubs);
		System.out.println("Multiplicación: " + resultadoMult);
		System.out.println("División: " + resultadoDiv);
	}
}