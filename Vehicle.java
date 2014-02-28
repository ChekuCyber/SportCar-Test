//in git hub

public class Vehicle
{
    // instance variables - replace the example below with your own
    private double horsepower, aerodynamics, weight, topspeed;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        // initialise instance variables
        horsepower = 0;
        weight = 0;
    }

    public Vehicle(double initialHorsepower,double initialWeight, double initialAerodynamics )
    {
        // initialise instance variables
        horsepower = initialHorsepower;
        weight = initialWeight;
        aerodynamics = initialAerodynamics;

    }

    /**
     * getter methods for three instance variables
     */
    public double getHorsepower()
    {
        return horsepower;
    }

    public double getAerodynamics()
    {
        return aerodynamics;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getTopspeed()
    {
        return topspeed;
    }

    public double getAcceleration()
    {
        return (100/horsepower)*aerodynamics*weight/100;
    }
}
