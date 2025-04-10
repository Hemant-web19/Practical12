/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportation;

/**
 *
 * @author hemant
 */
public class Car extends LandTransport {
    public int noofdoors;
    public double trunkcapacity;
    public boolean isconverible;

    public Car(int noofdoors, double trunkcapacity, boolean isconverible, int no_of_wheel, String fuel_type, String mode, int passenger_capacity, int avg_speed) {
        super(no_of_wheel, fuel_type, mode, passenger_capacity, avg_speed);
        this.noofdoors = noofdoors;
        this.trunkcapacity = trunkcapacity;
        this.isconverible = isconverible;
    }

    @Override
    public String toString() {
        return super.toString()+"Car{" + "noofdoors=" + noofdoors + ", trunkcapacity=" + trunkcapacity + ", isconverible=" + isconverible + '}';
    }
    
}
