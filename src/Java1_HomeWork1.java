public class Java1_HomeWork1 {
    public static void main(String[] args) {
        byte b =  10;
        short s = 20;
        int i = 100;
        char c = 'A';
        long l = 200L;
        float f = 20.0f;
        double d = 30.0;
        boolean bool = true;
        String str = "test";
        System.out.println(calculation(1, 2, 3, 4));
        System.out.println(checkSum(11, 2));
        checkMinus(-1);
        checkMinus(0);
        checkMinus(1);
        System.out.println(checkNegative(-1));
        printHelloName("Вася");
        printVisokosniy(4);
        printVisokosniy(100);
        printVisokosniy(400);
    }

    static double calculation (double a, double b, double c, double d){
        return (a*(b+(c/d)));
    }

    static boolean checkSum(int a, int b) {
        if ((a+b >= 10) && (a+b <= 20)) {
            return true;
        }
        return false;
    }

    static void checkMinus(int a) {
        if (a >= 0) {
            System.out.println("a положительное число");
        } else {
            System.out.println("a отрицательное число");
        }
    }

    static boolean checkNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    static void printHelloName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static void printVisokosniy(int year) {
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
