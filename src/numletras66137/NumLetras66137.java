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
        int multiplo;
        int unidad;
        
        System.out.println("Introduce un número del 0 al 99: ");
        int num = entrada.nextInt();
    
    
        multiplo=num/10 ;
        unidad=num%10 ;
        String[] unidades = {"cero", "uno", "dos", "Tres", "Cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] distinto = {"Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve"};
    
        switch (multiplo){
            case 0:
                System.out.println(unidades[unidad]);
                 break;
            case 1:
                System.out.println(distinto[unidad]);
                break; 
            case 2:
                if( unidad==0){
                System.out.println("Veinte");
            } else {
                System.out.println ("Veinti"+unidades[unidad]); 
            }
                break;
            case 3: 
                if( unidad==0){
                 System.out.println("Treinta");
            } else {
                 System.out.println ("Treinta y "+unidades[unidad]);
            }
                 break;
            case 4: 
                if( unidad==0){
                System.out.println("Cuarenta");
            } else {
                System.out.println ("Cuarenta y "+unidades[unidad]);
            }
                break;
            case 5: 
                 if( unidad==0){
                 System.out.println("Cincuenta");
            } else {
            System.out.println ("Cincuenta y "+unidades[unidad]);
            }
            break;
        case 6: 
            if( unidad==0){
                System.out.println("Sesenta");
            } else {
                System.out.println ("Sesenta y "+unidades[unidad]);
            }
                break;
        case 7: 
            if( unidad==0){
                System.out.println("Setenta");
            } else {
            System.out.println ("Setenta y "+unidades[unidad]);
            }
            break;
        case 8: 
            if( unidad==0){
                System.out.println("Ochenta");
            } else {
            System.out.println ("Ochenta y "+unidades[unidad]);
            }
            break;
        case 9: 
            if( unidad==0){
                System.out.println("Noventa");
            } else {
            System.out.println ("Noventa y "+unidades[unidad]);
            }
             break ;
            
        default:
            System.out.println ("numero no disponible");
            break;
        }
        
    }
    
}
        
    
    

