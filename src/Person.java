public class Person {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Person() {
        this.name = "Unknown";
        this.position = "Unknown";
        this.email = "Unknown";
        this.phone = "Unknown";
        this.salary = 0;
        this.age = 1;
    }

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getage() {
        return age;
    }

    public void workerInfo() {
        System.out.println("Worker name: " + name + " position: " + position + " email: " + email + " phone: " + phone + " salary: " + salary + " age: " + age);
    }

}
