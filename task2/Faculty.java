package task2;

public class Faculty extends Employee{
    private String hour;
    private String rank;

    public Faculty(String name, String address, int phone, String email, int salary, int office, String date, String hour, String rank) {
        super(name, address, phone, email, salary, office, date);
        this.hour = hour;
        this.rank = rank;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return  getName() + " " + getAddress() + " " + getPhone() + " " + getEmail() + " " + hour + " " + rank;
    }
}
