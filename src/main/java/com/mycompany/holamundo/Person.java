/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

/**
 *
 * @author Usuario
 */
public class Person {
    public String nombre;
    public String apellido;
    public int edad;
    private int ci;

    public Person(String nombre, String apellido, int edad ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public int getCi(){
        return ci;
    }
    
    public void setCi(int ci){
        this.ci=ci;
    }
    
}
