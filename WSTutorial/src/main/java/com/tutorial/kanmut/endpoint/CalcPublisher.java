package com.tutorial.kanmut.endpoint;
 
import javax.xml.ws.Endpoint;

import com.tutorial.kanmut.ws.CalcImpl;
 
//Endpoint publisher
public class CalcPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/calc", new CalcImpl());
    }
 
}