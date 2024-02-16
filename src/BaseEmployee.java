public class BaseEmployee extends Employee{
    private double salary;
    public BaseEmployee(String firstName, String lastName, String ssn, double salary){
        super(firstName,lastName,ssn);
        this.salary = salary;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("$" + salary + " per year");
    }

}
