public class HourlyEmployee extends Employee{
    private double wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }


    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("$" + wage + " per hour"+ " at " +hoursWorked + " worked");
    }
}

