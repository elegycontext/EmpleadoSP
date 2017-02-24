package empleadosp;

import java.io.*;

public class Empleado {
    
    //Atributos del empleado.
    String nombre = "";
    int produccion;
    double sueldo;
    
    //Metodo para registrar el nombre del empleado.
    void Rnombre() throws IOException{
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        boolean x = true;
        
        while (x != false)
        {
            try
            {
            System.out.print("Ingrese el nombre del empleado: ");
            nombre = br.readLine();
            
            x = false;
            }
             catch(Exception e)
            {
                System.err.println("Se produjo un Error: " + e.getMessage() + ".Por favor vuelva a ingresar los datos");
            }
            finally
            {
                System.out.println("Proceso terminado satisfactoriamente.");
            }
        }
    }
    
    //Metodo para registrar la produccion del empleado.
    void Rproduccion() throws IOException{
        
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        boolean x = true;
        
        while (x != false)
        {
            try
            {
            System.out.print("Ingrese la produccion del empleado: ");
            produccion = Integer.parseInt(br.readLine());
            
            x = false;
            }
             catch(Exception e)
            {
                System.err.println("Se esperaba un numero entreo y usted introdujo: " + e.getMessage() + ".Por favor vuelva a ingresar los datos");
            }
            finally
            {
                System.out.println("Proceso terminado satisfactoriamente.");
            }
        }
    }
    
    //Metodo para calcular el sueldo del empleado.
    void Rsueldo(){
        if (produccion <= 500){
            sueldo = produccion * 20;
        }
        else{
            if (produccion > 800){
                sueldo = produccion * 30;
            }
            else {
                sueldo = produccion * 25;
            }
        }
    }
    
    //Metodo para mostrar el nombre del empleado.
    void MosNombre (){
        System.out.println("El nombre del empleado es: " + nombre);
    }
    
    //Metodo para mostar la produccion del empleado.
    void MosProduccion() {
        System.out.println("La produccion del empleado fue: " + produccion);
    }
    
    //Metodo para mostrar el sueldo del empleado.
    void MosSueldo() {
        System.out.println("El sueldo del empleado es: " + sueldo);
    }
}
