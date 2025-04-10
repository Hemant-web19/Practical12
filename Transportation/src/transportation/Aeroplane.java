/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportation;

/**
 *
 * @author hemant
 */
public class Aeroplane extends AirTransport {
    public double range;
    public boolean hasInFlightMeal;
    public String airlineName;

    public Aeroplane(double range, boolean hasInFlightMeal, String airlineName, int no_of_engines, int altitudeLimit, String mode, int passenger_capacity, int avg_speed) {
        super(no_of_engines, altitudeLimit, mode, passenger_capacity, avg_speed);
        this.range = range;
        this.hasInFlightMeal = hasInFlightMeal;
        this.airlineName = airlineName;
    }

    @Override
    public String toString() {
        return super.toString()+"Aeroplane{" + "range=" + range + ", hasInFlightMeal=" + hasInFlightMeal + ", airlineName=" + airlineName + '}';
    }
    
}
