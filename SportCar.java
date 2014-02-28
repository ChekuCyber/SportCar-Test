public class SportCar extends Vehicle
{
    // instance variables - replace the example below with your own
    private double topspeed, aerodynamics;

    /**
     * Constructor for objects of class SportCar
     */
    public SportCar(double initialHorsepower, double initialWeight, double initialAerodynamics, double initialTopspeed)
    {
        // initialise instance variables
        super(initialHorsepower, initialWeight, 0.5);
        topspeed = initialTopspeed;
    }

    /**
     * getter method for the new instance variable
     */
    public double getTopspeed()
    {
        return topspeed;
    }

    public double getAerodynamics()
    {
        return super.getAerodynamics();
    }
}
