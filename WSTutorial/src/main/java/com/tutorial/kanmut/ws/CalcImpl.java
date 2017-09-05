package com.tutorial.kanmut.ws;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "com.mkyong.ws.HelloWorld")
public class CalcImpl implements Calc{
 
	public Double multiplyAsDouble(Double multiplicand, Double multiplier) {
		return multiplicand * multiplier;
	}
 
}