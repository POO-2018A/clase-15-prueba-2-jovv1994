package prueba2;

import java.util.Scanner;

public class Materia {
    
    private String Nombre;
    private int Nivel;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }
    
     public static void main(String[] args) 
     {
         
        Materia M1= new Materia();
        System.out.println("Ingrese la materia 1:"+ M1.Nombre);
        Scanner ingresoM1=new Scanner(System.in);
        M1.Nombre = ingresoM1.next();
        System.out.println("Ingrese el nivel de la materia 1:"+ M1.Nivel);
        Scanner ingresoN1 = new Scanner(System.in);
        M1.Nivel = ingresoN1.nextInt();
       
        
        Materia M2 = new Materia();
        System.out.println("Ingrese la materia 2:"+ M2.Nombre);
        Scanner ingresoM2 = new Scanner(System.in);
        M2.Nombre = ingresoM2.next();
        System.out.println("Ingrese el nivel de la materia 1:"+ M2.Nivel);
        Scanner ingresoN2 = new Scanner(System.in);
        M2.Nivel = ingresoN2.nextInt();
        
    }

}
