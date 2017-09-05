package com.tutorial.kanmut.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.tutorial.kanmut.ws.Calc;

public class CalcClient {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:9999/ws/calc?wsdl");

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://kanmut.tutorial.com/",
				"CalcImplService");

		Service service = Service.create(url, qname);

		Calc calc = service.getPort(Calc.class);

		if (args.length < 3) {
			System.out.println("Usage:" + "\n"
					+ "multiply multiplicand multiplier");
		} else {
			if ("multiply".equalsIgnoreCase(args[0])) {
				try {
					System.out.println(calc.multiplyAsDouble(
							Double.valueOf(args[1]), Double.valueOf(args[2])));
				} catch (NumberFormatException nfe) {
					System.out.println("NumberFormatException");
				}
			}
		}
	}
}