/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transportation;

/**
 *
 * @author hemant
 */
public class AirTransport extends Transportation {
    public int no_of_engines;
    public int altitudeLimit;

    public AirTransport(int no_of_engines, int altitudeLimit, String mode, int passenger_capacity, int avg_speed) {
        super(mode, passenger_capacity, avg_speed);
        this.no_of_engines = no_of_engines;
        this.altitudeLimit = altitudeLimit;
    }

    @Override
    public String toString() {
        return super.toString()+"AirTransport{" + "no_of_engines=" + no_of_engines + ", altitudeLimit=" + altitudeLimit + '}';
    }
    
}
