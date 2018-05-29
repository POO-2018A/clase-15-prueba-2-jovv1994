package prueba2;

import java.util.Scanner;

public class Prueba2 
{
    
    public static void main(String[] args) 
    {
   
        byte Opcion;
        Materia M = new Materia();
        
        System.out.println("***LISTA DE ESTUDIANTES***");
        System.out.println("a)Estudiante 1");
        System.out.println("b)Estudiante 2");
        System.out.println("c)Estudiante 3");
        System.out.println("d)Estudiante 4");
        System.out.println("e)Estudiante 5");
        System.out.println("f)Salir");
        System.out.println("Ingrese la opcion deseada:");
        Scanner ingreso = new Scanner(System.in);
        Opcion = ingreso.nextByte();
        
        do{
            switch(Opcion)
            {
            case 'a':
                break;
            case 'b':
                break;
            case 'c':
                break;
            case 'd':
                break;
            case 'e':
                break;
            case 'f':
                System.out.println("Adios :)");
                break;
            default:
                System.out.println("La opcion deseada es incorrecta");
                break;
            }
        
        }while(Opcion!='f'); 
    }
    
}
