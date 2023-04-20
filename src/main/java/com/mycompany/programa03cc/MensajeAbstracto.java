/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa03cc;

//Una clase abstracta puede tener métodos abstractos y métodos concretos a diferencia de una interface

public abstract class MensajeAbstracto {
    
    public void Imprimir() {
        System.out.println("Hola mundo concreto");
    }
    
    public abstract void msg();
}
