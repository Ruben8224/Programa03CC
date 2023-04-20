package com.mycompany.programa03cc;

/**
 *
 * @author irvin
 */
public class Programa03CC {

    public static void main(String[] args) {
        
        MensajeAbstracto ma = null;
        IMensaje maI = null;
        
        ma = new MensajeSaludo();
        ma.msg();
        
        ma = new MensajeDespedida();
        ma.msg();
        
        //REALIZAR UNA INSTANCIA ANONIMA 
        
        ma = new MensajeAbstracto() {
            @Override
            public void msg() {
                System.out.println("Instanciar una clase anonima");      
            }
        };
       
        
        ma.msg();
        
        maI = new MensajeSaludoI();  
        maI.msg();                      
                                        
        maI = new MensajeDespedidaI();
        maI.msg();                     
        
        maI = new IMensaje() {
            @Override
            public void msg() {
                System.out.println("Instanciar Anonimamente la interface");            }
        };
        maI.msg();
    }
}
