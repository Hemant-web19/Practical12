/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportation;

/**
 *
 * @author hemant
 */
public class Truck extends LandTransport {
    public int loadcapacity;

    public Truck(int loadcapacity, int no_of_wheel, String fuel_type, String mode, int passenger_capacity, int avg_speed) {
        super(no_of_wheel, fuel_type, mode, passenger_capacity, avg_speed);
        this.loadcapacity = loadcapacity;
    }

    @Override
    public String toString() {
        return super.toString()+"Truck{" + "loadcapacity=" + loadcapacity + '}';
    }
    
}
