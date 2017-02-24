package empleadosp;

import java.io.*;

public class Empleado {
    
    private int Produccion;
    private int Sueldo;
    private String NomObr;
    public int produccion;
    public int sueldo;
    public String nombre;
    
    void empleadofunciones(){
        Produccion = 0;
        Sueldo = 0;
        NomObr = "";
    }
    void obtenerNombre(String nombre){
        NomObr = nombre;
        this.nombre = nombre;
    }
    
    void obtenerProduccion(int produccion){
        Produccion = produccion;
        this.produccion = produccion;
    }
    
    int obtenerSueldo(){
        if (Produccion <= 500) {
            Sueldo = Produccion * 20;
        }
        else{
            if (Produccion > 500 && Produccion < 800){
                Sueldo = Produccion * 25;
            }
            else {
                Sueldo = Produccion * 30;
            }
        }
        sueldo = Sueldo;
        return sueldo;
    }
    
    void mosNombre(){
        System.out.println("El nombre del obrero es " + NomObr);
    }
    
    void mosProduccion(){
        System.out.println("La produccion del obrero "+ NomObr+ "es: " + Produccion);
    }
    void mosSueldo(){
        System.out.println("El sueldo del obrero " + NomObr + "es: " + Sueldo);
    }
}
