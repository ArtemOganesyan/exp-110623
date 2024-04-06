package support;

public class Test1 {
    public static void main(String[] args) {

        Car2 car21 = new Car2();
        car21.drive(80);
        car21.fuelUp();
        car21.drive(50);
        car21.checkfuelLevel();
        car21.drive(50);
        car21.checkfuelLevel();

    }
}

class Car2
{
    public int fuelLevel;
    public int distance;
    public int maxfuellevel;

    Car2()
    {
        this.fuelLevel = 100;
        this.distance = 0;
        this.maxfuellevel = 100;
    }
    public void drive(int distance)
    {
        this.distance = distance;
        this.fuelLevel = this.fuelLevel - distance;
    }

    public void fuelUp()
    {
        if(this.fuelLevel < maxfuellevel)
        {
            int fuel = maxfuellevel - this.fuelLevel;
            int fuelreq = maxfuellevel - 20;
            this.fuelLevel = this.fuelLevel + fuelreq;
        }
    }

    public void checkfuelLevel()
    {
        if (fuelLevel == 0)
            System.out.println("Please refuel");
        else
            System.out.println("The fuel level is: " + this.fuelLevel);
    }
}