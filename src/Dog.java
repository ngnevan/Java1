public class Dog extends Animal {
    public Dog() {
        this.run_distance = 500;
        this.swim_distance = 10;
        this.jump_height = 0.5;
    }

    public Dog(double run_distance, double swim_distance, double jump_height) {
        this.run_distance = run_distance;
        this.swim_distance = swim_distance;
        this.jump_height = jump_height;
    }

}
