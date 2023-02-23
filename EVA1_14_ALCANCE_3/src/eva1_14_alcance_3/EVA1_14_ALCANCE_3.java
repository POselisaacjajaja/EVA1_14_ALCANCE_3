/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_alcance_3;

/**
 *
 * @author isaaczapatto
 */
public class EVA1_14_ALCANCE_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 100;
        System.out.println(x);
        
        for (int i = 0; i < 10; i++) {
        int x = 1; //La variable ya está declarada en el main, y este sub bloque tiene acceso a ella.
        System.out.println(i);
        System.out.println(x);
        if(i == 5){
        System.out.println(x);
        }
        }
        
        for (int i = 0; i < 10; i++) {
        System.out.println(i);
        System.out.println(x);
    }
    
    }
    
    public static void Algo(int x){
        
        
    }
    public static void Algo2(int x){
        
        
    }
    public static void Algo3(int x){
        
        
    }
}
