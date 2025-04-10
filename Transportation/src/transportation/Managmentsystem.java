/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportation;


/**
 *
 * @author hemant
 */
public class Managmentsystem {
 public static void main(String [] args){
Car mycar = new Car(4, 50.5, false, 4, "petrol", "1500cc", 6, 40);
Truck truck = new Truck(500, 14, "diesel", "land", 3, 35);
Helicopter heli = new Helicopter(4, true, "Vertical", 1, 12000, "Helicopter", 6, 250);
Aeroplane plane = new Aeroplane(3500.75, true, "IndiGo", 2, 40000, "Airplane", 180, 850);

System.out.println(mycar);
System.out.println(truck);
System.out.println(heli);
System.out.println(plane);

 }
}
