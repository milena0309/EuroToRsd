/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milena
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Definisi promenljive
        double amountInEuro;
        double rate;
        double amountInRsd;
        Scanner input = new Scanner (System.in);
        
        // Pozdravna poruka
        System.out.println("This app convert Euro to RSD.");
        
        // Unesi kurs 
        System.out.println("Enter rate for today.");
        rate = input.nextDouble();
        
        // Unesi iznos u evrima
        System.out.println("Enter amount in Euro to convert.");
        amountInEuro = input.nextDouble();
        
        // Izracunaj iznos u dinarima
        amountInRsd = amountInEuro * rate;
        System.out.println("Amount in RSD is " + amountInRsd + " RSD.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
