/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lcote
 */
public class tarjetaacceso {
    
     public int numerotarjeta;
    public String fechavencimiento;
    public String nivelacceso;

    public static void main(String [] args)
    {
        tarjetaacceso  tarjetaacceso1 = new tarjetaacceso();
        tarjetaacceso1.numerotarjeta = 98765;
        tarjetaacceso1.fechavencimiento = "año dosmil veintitres";
        tarjetaacceso1.nivelacceso = "alta";


        System.out.println("el numero de targeta de targeta de acceso1 es:"+ tarjetaacceso1.numerotarjeta);
        System.out.println("la fecha de vencimiento de tarjeta de acceso1 es:"+ tarjetaacceso1.fechavencimiento);
        System.out.println("el nivel de acceso de targeta de acceso1 es:"+ tarjetaacceso1.nivelacceso);
       

    }
    
}
