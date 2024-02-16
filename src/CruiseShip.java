public class CruiseShip extends Ship{
    int numPassengers;

    public CruiseShip(String name, String yearBuilt, int numPassengers){
        super(name,yearBuilt);
        this.numPassengers = numPassengers;
    }

    public int getNumPassengers(){
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers){
        this.numPassengers = numPassengers;
    }
    @Override
    public void print(){
        System.out.println("Cruise Ship Name: " + getName() + ", Maximum Passengers: " + numPassengers);
    }
}
