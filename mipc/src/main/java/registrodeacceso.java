/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lcote
 */
public class registrodeacceso {
    
    public String fecha;
    public String empleado;
    public String puertaacceso;

    public static void main(String [] args)
    {
        registrodeacceso  registrodeacceso1 = new registrodeacceso();
        registrodeacceso1.fecha = "diciembre 19";
        registrodeacceso1.empleado = "luis eduardo";
        registrodeacceso1.puertaacceso = "principal";


        System.out.println("la fecha de registro de acceso1 es:"+ registrodeacceso1.fecha);
        System.out.println("el empleado de registro de acceso1 es:"+ registrodeacceso1.empleado);
        System.out.println("la puerta de acceso de registro de acceso1 es:"+ registrodeacceso1.puertaacceso);
       

    }
}
