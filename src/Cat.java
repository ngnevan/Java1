public class Cat extends Animal {
    protected int appetit;
    protected bowl catsBowl;

    public Cat() {
        this.run_distance = 200;
        this.swim_distance = 0;
        this.jump_height = 2;
        this.appetit = 1;
    }

    public Cat(double run_distance, double swim_distance, double jump_height, int appetit) {
        this.run_distance = run_distance;
        this.swim_distance = swim_distance;
        this.jump_height = jump_height;
        this.appetit = appetit;
    }

    public void swim(int distance) {
        System.out.println("swim: Cats cannot swim");
    }

    public void setBowl(bowl catsBowl) {
        this.catsBowl = catsBowl;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }
}
