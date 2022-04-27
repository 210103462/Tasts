package task2;

public class Task2 {
    public static void main(String[] args) {
        Person person = new Person("John", "12 Bell street",
                777777777, "john12@aol.com");

        Student student = new Student("Mary", "100 Town Ave", 777777777,
                "mary100@aol.com", "FRESHMAN");

        Employee employee = new Employee("Mike", "34 West street", 777777,
                "mike80@aol.com", 910, 60000, "1/1/2000");

        Faculty faculty = new Faculty("Sue", "28 Well street", 77777777,
                "sue28@aol.com", 101, 50000, "1/1/2001", "4pm to 6pm", "Professor");

        Staff staff = new Staff("Tom", "90 Country road", 7777777,
                "tomcat@aol.com", 12, 65000,"1/1/2002", "Executive Assistant");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
