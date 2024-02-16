public class CargoShip extends Ship{
    int tonnage;

    public CargoShip(String name, String yearBuilt, int tonnage){
        super(name,yearBuilt);
        this.tonnage = tonnage;
    }

    public int getTonnage(){

        return tonnage;
    }

    public void setTonnage(int tonnage){

        this.tonnage = tonnage;
    }

    @Override
    public void print(){
        System.out.println("Cargo Ship Name: " + getName() + ", Cargo Capacity: " + tonnage + " tons");
    }
}
