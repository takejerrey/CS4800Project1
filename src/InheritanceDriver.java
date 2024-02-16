import java.util.*;
import java.io.*;
public class InheritanceDriver {

    public static void main(String args[]){

        SalariedEmployee joe = new SalariedEmployee("Joe","Jones","111-11-1111", 2500);
        SalariedEmployee renwa = new SalariedEmployee("Renwa","Chanel","555-55-5555", 1700);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie","Smith","222-22-2222",25,32);
        HourlyEmployee mary = new HourlyEmployee("Mary","Quinn","333-33-3333",19,47);
        CommisionEmployee nicole = new CommisionEmployee("Nicole","Dior","444-44-4444",.15,50000);
        CommisionEmployee mahnaz = new CommisionEmployee("Mahnaz","Vaziri","777-77-7777",.22,40000);
        BaseEmployee mike = new BaseEmployee("Mike","Davenport","666-66-6666",95000);

        System.out.println("Weekly Salary Employees below");
        joe.print();
        renwa.print();

        System.out.println("\nHourly Employees below");
        stephanie.print();
        mary.print();

        System.out.println("\nCommision Employees below");
        nicole.print();
        mahnaz.print();

        System.out.println("\nBase Salary Employees below");
        mike.print();
    }
}
