package Recursividad;

public class Sumar{
    public class sumar {
        public static void main (String[] argv) {
            System.out.println(s(10));
    }
public static int s(int n) {
        if (n == 1) {
            return 1;
        } else {
            return s(n-1) + n;
        }
     }
}
}