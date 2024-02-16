public class Ship {
    String name;
    String yearBuilt;

    public Ship(String name, String yearBuilt){
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void print(){
        System.out.println("Ship Name: " + name + ", Year Built: " + yearBuilt);;
    }
}
