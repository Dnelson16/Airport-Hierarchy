package com.solvd.services;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionClassExample {
    public static void main(String[] args) throws Exception{

        // Beginning of reflection
        TransportationSecurity transportationSecurity = new TransportationSecurity("Officer", "Watches checkpoints");
        Field[] securityFields = transportationSecurity.getClass().getDeclaredFields();

        for (Field field : securityFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(transportationSecurity, "TSA Agent");
            }
        }
        Method[] securityMethods = transportationSecurity.getClass().getDeclaredMethods();

        for (Method method : securityMethods) {
            if (method.getName().equals("metalDetectors")) {
                method.invoke(transportationSecurity);
            }
            if (method.getName().equals("bombDogs")) {
                method.setAccessible(true);
                method.invoke(transportationSecurity);
            }
            if (method.getName().equals("xrayMachine")) {
                method.setAccessible(true);
                method.invoke(null);
            }
            if (method.getName().equals("proofOfID")) {
                method.setAccessible(true);
                method.invoke(null);
            }
        }
    }
}
