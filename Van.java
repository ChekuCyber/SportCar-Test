public class Van extends Vehicle
{
    // instance variables - replace the example below with your own
    private double carryweight, aerodynamics;

    /**
     * Constructor for objects of class SportCar
     */
    public Van(double initialHorsepower, double initialWeight, double initialAerodynamics, double initialCarryweight)
    {
        // initialise instance variables
        super(initialHorsepower, initialWeight, 0.9);
        carryweight = initialCarryweight;
        aerodynamics = initialAerodynamics;
    }

    /**
     * getter method for the new instance variable
     */
    public double getAerodynamics()
    {
        return aerodynamics;
    }

    public double getCarryweight()
    {
        return carryweight;
    }
}
