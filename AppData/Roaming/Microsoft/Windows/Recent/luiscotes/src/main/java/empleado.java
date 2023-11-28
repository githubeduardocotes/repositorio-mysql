/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lcote
 */
public class empleado {



    public String nombre;
    public String apellido;
    public int identificacion;
    public String nivelacceso;
    public String rol;

    public static void main(String [] args)
    {
        empleado empleado1 = new empleado();
        empleado1.nombre = "luis eduardo";
        empleado1.apellido = "cotes";
        empleado1.identificacion =1234567;
        empleado1.nivelacceso = "bueno";
        empleado1.rol = "operario";

        System.out.println("el nombre de empleado1 es:"+ empleado1.nombre);
        System.out.println("el apellido del empleado1 es:"+ empleado1.apellido);
        System.out.println("la identificacion del empleado1 es:"+ empleado1.identificacion);
        System.out.println("nivel de acceso de empleado1 es:"+ empleado1.nivelacceso);
        System.out.println("el rol del empleado1 es:"+ empleado1.rol);


    }
}
                      

