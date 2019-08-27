public class bowl {
    protected int totalVolume;
    protected int foodVolume;

    public bowl() {

    }

    public bowl(int totalVolume, int foodVolume) {
        this.totalVolume = totalVolume;
        this.foodVolume = foodVolume;
    }

    public void increaseFoodVolume(int food) {
        this.foodVolume = this.foodVolume + food;
    }

    public int getFoodVolume() {
        return this.foodVolume;
    }
}
