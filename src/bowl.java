public class bowl {
    protected int totalVolume;
    protected int foodVolume;
    protected String name;

    public bowl() {

    }

    public bowl(String name, int totalVolume, int foodVolume) {
        this.name = name;
        this.totalVolume = totalVolume;
        this.foodVolume = foodVolume;
    }

    public void fullFoodVolume() {
        this.foodVolume = this.totalVolume;
        System.out.println("Миска наполнена едой, остаток " + this.foodVolume);
    }

    public int getFoodVolume() {
        return this.foodVolume;
    }

    public boolean toFeed(int volume) {
        boolean result = false;
        if (volume <= this.foodVolume) {
            this.foodVolume = this.foodVolume - volume;
            System.out.println(this.name + ": выдано " + volume + " еды, остаток " + this.foodVolume);
            result = true;
        } else {
            System.out.println(this.name + ": недостаточно еды для кормления");
            fullFoodVolume();
        }
        return result;
    }
}
