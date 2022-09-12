package com.hubberspot.webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

// @WebService annotation makes a class a Web Service
@WebService(serviceName = "CalculatorService")
public class CalculatorService {

    // @WebMethod annotation expose a method as a service.
    @WebMethod(operationName = "sum")
    // @WebParam annotation indicates parameters to method coming from SOAP request.
    public int sum(@WebParam(name = "number1") int number1, 
                   @WebParam(name = "number2") int number2) {
        
        int sum = 0;
        
        sum = number1 + number2;
        
        return sum;
    }    
}