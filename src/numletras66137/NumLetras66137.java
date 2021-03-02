/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numletras66137;

import java.util.Scanner;

/**
 *
 * @author TRUJEQUE
 */
public class NumLetras66137 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int multitud;
        int cantidad;
        
        System.out.println("Introduce un número del 0 al 99: ");
        int num = entrada.nextInt();
    
    
        multitud=num/10 ;
        cantidad=num%10 ;
        String[] cantidades = {"cero", "uno", "dos", "Tres", "Cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] distinto = {"Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve"};
    
        switch (multitud){
            case 0:
                System.out.println(cantidades[cantidad]);
                 break;
            case 1:
                System.out.println(distinto[cantidad]);
                break; 
            case 2:
                if( cantidad==0){
                System.out.println("Veinte");
            } else {
                System.out.println ("Veinti"+cantidades[cantidad]); 
            }
                break;
            case 3: 
                if( cantidad==0){
                 System.out.println("Treinta");
            } else {
                 System.out.println ("Treinta y "+cantidades[cantidad]);
            }
                 break;
            case 4: 
                if( cantidad==0){
                System.out.println("Cuarenta");
            } else {
                System.out.println ("Cuarenta y "+cantidades[cantidad]);
            }
                break;
            case 5: 
                 if( cantidad==0){
                 System.out.println("Cincuenta");
            } else {
            System.out.println ("Cincuenta y "+cantidades[cantidad]);
            }
            break;
        case 6: 
            if( cantidad==0){
                System.out.println("Sesenta");
            } else {
                System.out.println ("Sesenta y "+cantidades[cantidad]);
            }
                break;
        case 7: 
            if( cantidad==0){
                System.out.println("Setenta");
            } else {
            System.out.println ("Setenta y "+cantidades[cantidad]);
            }
            break;
        case 8: 
            if( cantidad==0){
                System.out.println("Ochenta");
            } else {
            System.out.println ("Ochenta y "+cantidades[cantidad]);
            }
            break;
        case 9: 
            if( cantidad==0){
                System.out.println("Noventa");
            } else {
            System.out.println ("Noventa y "+cantidades[cantidad]);
            }
             break ;
            
        default:
            System.out.println ("No esta disponible");
            break;
        }
        
    }
    
}
        
    
    

