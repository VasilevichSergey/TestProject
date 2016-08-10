public class Main {

    public static void main(String[] args) {

        int p = 1, i = 1;
        int n = 9;
        while(i <= n){
            p *= i;
            i++;}
        System.out.println("Hello World!");
        System.out.println("Факториал числа \"" + n + "\" равен: " + n + "!=" + p);

    }
}
