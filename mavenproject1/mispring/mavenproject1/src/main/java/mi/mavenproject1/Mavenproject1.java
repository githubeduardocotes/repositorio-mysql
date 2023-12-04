/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mi.mavenproject1;



/**
 *
 * @author lcote
 */
public class Mavenproject1 {
    
    public String nombre;
    public String apellido;
    public int identificacion;
    public String nivelacceso;
    public String rol;

    public static void main(String [] args)
    {
        empleado empleado2 = new empleado();
        
        empleado2.nombre = "luis eduardo";
        empleado2.apellido = "cotes";
        empleado2.identificacion =1234567;
        empleado2.nivelacceso = "bueno";
        empleado2.rol = "operario";

        System.out.println("el nombre de empleado1 es:"+ empleado2.nombre);
        System.out.println("el apellido del empleado1 es:"+ empleado2.apellido);
        System.out.println("la identificacion del empleado1 es:"+ empleado2.identificacion);
        System.out.println("nivel de acceso de empleado1 es:"+ empleado2.nivelacceso);
        System.out.println("el rol del empleado1 es:"+ empleado2.rol);
        System.out.println("el actual empleado que trabaja aqui es:"+empleado2.nombre);

    

   
    
    }

   
    
}
