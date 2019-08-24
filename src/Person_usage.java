public class Person_usage {
    public static void main(String[] args) {
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com ", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Petrov Petr", "Engineer", "petrov@mailbox.com ", "892412312", 10000, 30);
        persArray[2] = new Person("Sidorov Sidor", "Engineer", "sidorov@mailbox.com ", "892512312", 20000, 50);
        persArray[3] = new Person("Nikolaev Nikolay", "Engineer", "nikolaev@mailbox.com ", "892612312", 40000, 45);
        persArray[4] = new Person("Sergeev Sergey", "Engineer", "sergeev@mailbox.com ", "892712312", 50000, 35);

        for (Person per: persArray) {
            if (per.getage() > 40) {
                per.workerInfo();
            }
        }
    }
}
