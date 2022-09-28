public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mittens", 4, 10);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Bones", 8, 8.3);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
