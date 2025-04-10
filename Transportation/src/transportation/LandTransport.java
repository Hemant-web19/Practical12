/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportation;

/**
 *
 * @author hemant
 */
public class LandTransport extends Transportation {
    public int no_of_wheel;
    public String fuel_type;

    public LandTransport(int no_of_wheel, String fuel_type, String mode, int passenger_capacity, int avg_speed) {
        super(mode, passenger_capacity, avg_speed);
        this.no_of_wheel = no_of_wheel;
        this.fuel_type = fuel_type;
    }

    @Override
    public String toString() {
        return super.toString()+"LandTransport{" + "no_of_wheel=" + no_of_wheel + ", fuel_type=" + fuel_type + '}';
    }
    
    
}
