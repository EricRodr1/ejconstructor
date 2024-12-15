/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioconstructor;

/**
 *
 * @author Eric Rodriguez
 */
public class persona {
    //atributos
    String nombre;
    int edad;
    
    //metodo constructor
    public persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        
        
    } 
    public  void mostrar(){
        System.out.println("El nombre es"+nombre);
        System.out.println("La edad es"+edad);
    }
    
   
}
