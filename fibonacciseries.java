//PRINTING FIBONACCI SERIES TILL N.
import java.util.*;

public class fibonacciseries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 2000;
        while(a<n){
            System.out.print(a + " ");
            a = b;
            b = a+b;

        }
    }
}