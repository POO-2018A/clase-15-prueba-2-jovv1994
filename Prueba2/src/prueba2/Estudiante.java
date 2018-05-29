package prueba2;

import java.util.Scanner;

public class Estudiante 
{
    private String Nombre;
    private int Edad;
    private Materia M = new Materia();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public static void main(String[] args) 
     {
        for (int i = 1; i <=5; i++) 
        {
            System.out.println("Ingrese el nombre del estudiante "+i+":");
            Scanner leerNombre=new Scanner(System.in);
            Nombre = leerNombre.next();
            System.out.println("Ingrese la edad del estudiante "+i+":");
            Scanner leerEdad=new Scanner(System.in);
            Edad = leerEdad.nextInt();
            System.out.println("Ingrese las materias del estudiante "+i+":");
            Scanner leerMateria=new Scanner(System.in);
            M.getNombre(leerMateria.next()); 
            M.getNivel(leerMateria.next());
            
        }
          
    }
    
    
}
