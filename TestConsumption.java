/**
 * Exercise 4: Inheritance.
 *
 * @author (Stanislav Cekunov)
 * @version (2014 - 02)
 */
import java.awt.*;
import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import java.lang.String.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//
class TestConsumption extends Frame
{
    /**
     * Main method
     */
    public static void main(String[] param)
    {
        //Fuel consumption of first car
        new GUI();



    }
}

/**
class GIU extends Frame
{
    public void actionPerformed(ActionEvent e){
        System.out.println("A");
    }
    // constructor
    public GIU(String s)
    {   super(s);    //construct Frame part of Gui
        setBackground(Color.gray);
        setLayout(new FlowLayout());
        Button buttonNewCar = new Button("Sport Car");
        Button buttonVan = new Button("Van");
        Button buttonExit = new Button("Exit");

        //Van button performance
        add(buttonNewCar);
        buttonNewCar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent evt){
                        int i = 1;
                        String result = "";
                        SportCar car1, car2, car3;
                        car1 = new SportCar(200, 1500, 0.5, 220);
                        car2 = new SportCar(100, 1000, 0.5, 170);
                        car3 = new SportCar(135, 1100.2, 0.5, 173);
                        //Question - without addition method getTopspeed in Vehicle class in would not work!??


                        Vehicle[] cars = {car1, car2, car3};
                        for (Vehicle car: cars){
                            result += "Fuel consumption "+i+" Car: " + (1000+(car.getWeight()/5))*(car.getTopspeed() / 100)*(car.getAerodynamics()* car.getHorsepower())/1000 +"\n" + "Car acceleration: " + car.getAcceleration() + "\n";
                            i++;
                        }
                        System.out.print(result);
                        Label l = new Label(result);
                        add(l);
                    }
                });
        //Van button performance
        add(buttonVan);
        buttonVan.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent evt){
                        //Van Acceleration
                        Vehicle van = new Van(100, 3500, 0.9, 160.4);
                        System.out.println("\nVan acceleration: " + van.getAcceleration());
                        }
                    });
        //Exit button performance
        add(buttonExit);
        buttonExit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        System.out.println("I am finished now");
                        System.exit(0);
                    }
                });
    }



}

*/


