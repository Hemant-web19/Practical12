/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportation;

/**
 *
 * @author hemant
 */
public class Helicopter extends AirTransport {
    public int rotorBlades;
    public boolean hasAutoPilot;
    public String landingType;

    public Helicopter(int rotorBlades, boolean hasAutoPilot, String landingType, int no_of_engines, int altitudeLimit, String mode, int passenger_capacity, int avg_speed) {
        super(no_of_engines, altitudeLimit, mode, passenger_capacity, avg_speed);
        this.rotorBlades = rotorBlades;
        this.hasAutoPilot = hasAutoPilot;
        this.landingType = landingType;
    }

    @Override
    public String toString() {
        return super.toString()+"Helicopter{" + "rotorBlades=" + rotorBlades + ", hasAutoPilot=" + hasAutoPilot + ", landingType=" + landingType + '}';
    }
    
    public static void main(String args[]){
        
    
    }
}
