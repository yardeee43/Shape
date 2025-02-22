/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12;

/**
 *
 * @author bachtiar
 */
public class Diamond {
    public static void main(String[] args) {
       int n = 9; // Harus Ganjil

        // Bagian atas diamond
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(""+j);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) { 
            for (int j = n; j > i; j--) {
                System.out.print(j);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    
        
       
            
                
            
            
            
        
        
        
    }
    
}
