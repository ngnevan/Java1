public class Animal {
    protected double run_distance;
    protected double swim_distance;
    protected double jump_height;

    public Animal() {
        this.run_distance = 0;
        this.swim_distance = 0;
        this.jump_height = 0;
    }

    public Animal(double run_distance, double swim_distance, double jump_height) {
        this.run_distance = run_distance;
        this.swim_distance = swim_distance;
        this.jump_height = jump_height;
    }

    public void run(int distance) {
        if (distance <= run_distance) {
            System.out.println("run: true");
        } else {
            System.out.println("run: false");
        }
    }

    public void swim(int distance) {
        if (distance <= swim_distance) {
            System.out.println("swim: true");
        } else {
            System.out.println("swim: false");
        }
    }

    public void jump(int height) {
        if (height <= jump_height) {
            System.out.println("jump: true");
        } else {
            System.out.println("jump: false");
        }
    }
}
