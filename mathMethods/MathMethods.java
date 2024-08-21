public class MathMethods {
    public static void main(String[] args) {
        int a = 9, b = 2;

        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.pow(a, b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.abs(a));
        System.out.println(Math.random()); //random number generator between 0 and 1
        System.out.println(Math.floor(a));
        System.out.println(Math.ceil(a));
        System.out.println(Math.round(a));

        //Generating random numbers between 2 and 10
        rand(2, 10);

    }
    
    public static void rand(int a, int b) {
        int randNum = (int) (Math.random() * (b - a + 1) + a);
        System.out.println(randNum);
    }
}
