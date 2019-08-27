public class Animals_usage_lesson5 {
    public static void main(String[] args) {
        bowl bowl1 = new bowl("bowl1", 10, 10);
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(("cat" + i), 200, 0, 2, 5);
            cats[i].setBowl(bowl1);
            cats[i].eat();
        }
    }

}
