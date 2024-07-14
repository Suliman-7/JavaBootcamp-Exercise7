public class Employee {

    private String id;
    private String name;
    private int salary = 0;


    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raisedSalary(double percent) {
        double newSalary = salary + ((percent/100)*salary) ;
        this.salary = (int) newSalary;
        return this.salary ;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }


}
