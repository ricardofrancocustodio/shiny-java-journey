package ExercisesOopNTU;

public class Employees {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employees(int id, String firstName, String lastName, int salary){
//        this.id         = getId();
//        this.firstName  = getFirstName();
//        this.lastName   = getLastName();
//        this.salary     = getSalary();

        this.id         = 1;
        this.firstName  = "Ricardo";
        this.lastName   = "Custodio";
        this.salary     = 2000;
    }

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getCompleteName(){
        return firstName +" "+ lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int sal){
        this.salary = sal;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int setRaiseSalary(int rsal){
        int divSal = getSalary() / 100;
        int rs = divSal * rsal;

        return rs;
    }

    public String toString(){
        return "";
    }



}
