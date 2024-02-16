public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    public void print(){
        System.out.print(firstName + " " + lastName + " " + ssn + " ");
    }

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    void setSsn(String ssn){
        this.ssn = ssn;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }

    String getSsn(){
        return ssn;
    }
}

