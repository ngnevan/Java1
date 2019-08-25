public class Animals_usage {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(400, 10, 0.5);
        Dog dog3 = new Dog(600, 10, 0.5);

        cat1.run(250);
        cat1.swim(20);
        dog1.run(350);
        dog2.run(500);
        dog3.run(500);
    }
}
