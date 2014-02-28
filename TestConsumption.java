/**
 * Exercise 4: Inheritance.
 *
 * @author (Stanislav Cekunov)
 * @version (2014 - 02)
 */
import java.awt.*;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.*;
//
public class TestConsumption extends JFrame
{
    /**
     * Main method
     */
    public static void main(String[] param)
    {
        TestConsumption panel = new TestConsumption();
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(500, 500);
        panel.setVisible(true);
        panel.setTitle("Vehicle Consumption");
        //Fuel consumption of first car
        int i = 1;

        SportCar car1, car2, car3;
        car1 = new SportCar(200, 1500, 0.5, 220);
        car2 = new SportCar(100, 1000, 0.5, 170);
        car3 = new SportCar(135, 1100.2, 0.5, 173);
        //Question - without addition method getTopspeed in Vehicle class in would not work!??
        Vehicle[] cars = {car1, car2, car3};
        for (Vehicle car: cars){
            System.out.println("Fuel consumption "+i+" Car: " + (1000+(car.getWeight()/5))*(car.getTopspeed() / 100)*(car.getAerodynamics()* car.getHorsepower())/1000);
            System.out.println("Car acceleration: " + car.getAcceleration());
            i++;
        }
        //Van Acceleration
        Vehicle van = new Van(100, 3500, 0.9, 160.4);
        System.out.println("\nVan acceleration: " + van.getAcceleration());

    }
}