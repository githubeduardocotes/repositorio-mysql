/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lcote
 */
public class lectorhuella {
    
    public String identificador;
    public String validarhuella;
    

    public static void main(String [] args)
    {
        lectorhuella   lectorhuella1 = new lectorhuella();
        lectorhuella1.identificador= "scaner";
        lectorhuella1.validarhuella = "validado";
        

        System.out.println("la identificacion del lector de huella1 es:"+ lectorhuella1.identificador);
        System.out.println("validarhuella del lectorhuella1 es:"+ lectorhuella1.validarhuella);
       
    }
    
}
