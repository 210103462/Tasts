package task2;

public class Student extends Person{

    private String status;

    public Student(String name, String address, int phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return getName() + " " + getAddress() + " " + getPhone() + " " + getEmail() + " " + status;
    }
}
