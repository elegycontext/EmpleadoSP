
package empleadosp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *
 * @author Samy Mahmod
 * @author Victoria Borras
 * 
 */
public class EmpleadoSP {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        String opcion;
        String opcion2;
        boolean continuar = true;
        
        Empleado empleado = new Empleado();
        
        //Menu de operaciones
        try{
            while (continuar != false){
                System.out.println("Ingrese la opcion correspondiente a la operacion "
                        + "que desea realizar\nA.- Asignar nombre de empleado.\n"
                        + "B.- Asignar produccion de empleado.\nC.- Calcular "
                        + "sueldo de empleado.\nD.- Mostrar nombre de empleado.\n"
                        + "E.- Mostrar produccion de empleado.\nF.- Mostrar sueldo "
                        + "de empleado.\nX.- Salir.");
                opcion = br.readLine();
                
                switch(opcion.toLowerCase()){
                    case ("a"):
                        empleado.Rnombre();
                        break;
                    
                    case ("b"):
                        empleado.Rproduccion();
                        break;
                    
                    case ("c"):
                        empleado.Rsueldo();
                        break;
                    
                    case ("d"):
                        //Se valida que se registro el nombre del empleado.
                        if(empleado.nombre != ""){
                            empleado.MosNombre();
                        }
                        else{
                            System.out.println("No se a registrado un nombre. "
                                    + "Registrelo para luego visualizarlo?(S/N)");
                            opcion2 = br.readLine();
                            
                            switch (opcion2.toLowerCase()){
                                case("n"):
                                    break;
                                default:
                                    empleado.Rnombre();
                            }
                            empleado.MosNombre();
                        }
                        break;
                        
                    case ("e"):
                        //Se valida que se registro la produccion del empleado.
                        if(empleado.produccion < 1){
                            System.out.println("Quiza olvido introducir la "
                                    + "produccion del empleado\n\nDesea "
                                    + "registrar la produccion ahora?(S/N)");
                            opcion2 = br.readLine();
                            
                            switch(opcion2.toLowerCase()){
                                case ("n"):
                                    break;
                                    
                                default:
                                    empleado.Rproduccion();
                            }
                        }
                        empleado.MosProduccion();
                        break;
                    
                    case ("f"):
                        //Se valida tanto que se registro la produccion del empleado como si se calculo el sueldo.
                        if((empleado.produccion < 1)||(empleado.sueldo < 1)){
                            System.out.println("Quiza olvido introducir la "
                                    + "produccion del empleado o calcular el "
                                    + "sueldo del empleado.\n\nDesea "
                                    + "registrar la produccion y calcular el "
                                    + "sueldo ahora?(S/N)");
                            opcion2 = br.readLine();
                            switch(opcion2.toLowerCase()){
                                case ("n"):
                                    break;
                                    
                                default:
                                    empleado.Rproduccion();
                                    empleado.Rsueldo();
                                    
                            }
                    }
                        empleado.MosSueldo();
                        break;
                        
                    case ("x"):
                        //Se sale del programa.
                        continuar = false;
                        break;
                        
                    default:
                        System.out.println("Ested introdujo una opcion invalida, porfavor introduzca la opcion correcta.");
                        break;
                }
            }
        }
        catch(Exception e){
            System.out.print("");
        }
        finally{
            System.out.println("Gracias por usar el nuestro sistema.");
        }
    }
    
}
