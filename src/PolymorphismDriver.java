public class PolymorphismDriver {
    public static void main(String args[]){
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Ship One", "2024");
        ships[1] = new CruiseShip("Ship two", "4321", 10000);
        ships[2] = new CargoShip("ShipThree", "1234", 1000000);

        for (Ship ship : ships) {
            ship.print();
        }
    }
}
