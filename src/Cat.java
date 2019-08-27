public class Cat extends Animal {
    protected int appetit;
    protected boolean fullness = false;
    protected bowl catsBowl;

    public Cat() {
        this.name = "Unknown";
        this.run_distance = 200;
        this.swim_distance = 0;
        this.jump_height = 2;
        this.appetit = 1;
        this.fullness = false;
    }

    public Cat(String name, double run_distance, double swim_distance, double jump_height, int appetit) {
        this.name = name;
        this.run_distance = run_distance;
        this.swim_distance = swim_distance;
        this.jump_height = jump_height;
        this.appetit = appetit;
        this.fullness = false;
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

    public void eat() {
        if (catsBowl.toFeed(appetit)) {
            this.fullness = true;
        } else {
            this.fullness = false;
        }
        System.out.println(this.name + ": fullness is " + this.fullness);
    }
}
