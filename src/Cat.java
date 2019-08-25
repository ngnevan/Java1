public class Cat extends Animal {
    public Cat() {
        this.run_distance = 200;
        this.swim_distance = 0;
        this.jump_height = 2;
    }

    public Cat(double run_distance, double swim_distance, double jump_height) {
        this.run_distance = run_distance;
        this.swim_distance = swim_distance;
        this.jump_height = jump_height;
    }

    public void swim(int distance) {
        System.out.println("swim: Cats cannot swim");

    }

}
