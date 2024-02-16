public class CommisionEmployee extends Employee{
    private double commissionRate;
    private double grossSales;

    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }


    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    @Override
    public void print(){
        super.print();
        System.out.println((commissionRate * 100) + "% commission, with $" + grossSales);
    }
}
