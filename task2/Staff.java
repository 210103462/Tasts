package task2;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, int phone, String email, int salary, int office, String date, String title) {
        super(name, address, phone, email, salary, office, date);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  getName() + " " + getAddress() + " " + getPhone() + " " + getEmail() + " " + title;
    }
}
