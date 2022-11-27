package ExercisesOopNTU;

public class TestEmployees {

    public static void main(String[] args) {

        Employees emp = new Employees(1, "Ricardo", "Magal", 2500);

        //emp.setSalary(2500);
        emp.setRaiseSalary(10);

        System.out.println(emp.getSalary() + emp.setRaiseSalary(100));
        System.out.println(emp.getLastName());
    }
}
