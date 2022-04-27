package task2;

public class Employee extends Person{
    private int salary;
    private int office;
    private String date;

    public Employee(String name, String address, int phone, String email, int salary, int office, String date) {
        super(name, address, phone, email);
        this.salary = salary;
        this.office = office;
        this.date = date;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  getName() + " " + getAddress() + " " + getPhone() + " " + getEmail() + " " + salary + " " + office + " " + date;
    }
}
