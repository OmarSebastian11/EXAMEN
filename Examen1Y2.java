/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg1.y.pkg2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Examen1Y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double guitarra = 1250.45
        double flauta = 3743.00
        double bajo = 2683.78
        
        Scanner entrada=new Scanner(System.in);

        System.out.println("dime el nombre del instrumento");
        String nombre1=entrada.nextLine();
        System.out.println("dime el nombre del instrumento");
        String nombre2=entrada.nextLine();
        System.out.println("dime el nombre del instrumento");
        String nombre3=entrada.nextLine();

        System.out.println("ingrese el precio de compra");
        double precioCompra1 = entrada.nextDouble();
        System.out.println("ingrese el precio de compra");
        double precioCompra2 = entrada.nextDouble();
        System.out.println("ingrese el precio de compra");
        double precioCompra3 = entrada.nextDouble();

        double ganancia1 = guitarra - precioCompra1;
        double ganancia2 = flauta - precioCompra2;
        double ganancia3 = bajo - precioCompra3;

        double total1 = (guitarra/precioCompra1)*100;
        double total2 = (flauta/precioCompra2)*100;
        double total3 = (bajo/precioCompra3)*100;

        System.out.println("ganancia de la guitarra" + ganancia1);
        System.out.println("ganancia de la flauta" + ganancia2);
        System.out.println("ganancia de bajo" + ganancia3);

        System.out.println("total de la guitarra" + total1);
        System.out.println("total de la flauta" + total2);
        System.out.println("total del bajo" + total3);
        
        
      

        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
    }
    
}
