/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transportation;

/**
 *
 * @author hemant
 */
public class Transportation {
    String mode ;
    int passenger_capacity;
    int avg_speed ;
    Transportation(String mode , int passenger_capacity , int avg_speed){
        this.mode = mode ;
        this.passenger_capacity = passenger_capacity ;
        this.avg_speed =avg_speed ;
    }
    Transportation(){}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
