/**
 * Created by 21343009_Mukhtarijal
 */

public class RelasiDemo {
    public static void main(String[] args){
        int i = 37;
        int j = 42;
        int k = 42;

        System.out.println("Nilai variable...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        //lebih besar dari
        System.out.println("lebih besar dari...");
        System.out.println("i > j = " + (i >j )); //false
        System.out.println("j > i = " + (j > i)); //true
        System.out.println("k > j = " + (k > j)); //false

        //lebih besar atau sama dengan
        System.out.println("lebih besar atau sama dengan...");
        System.out.println("i >= j = " + (i >= j )); //false
        System.out.println("j >= i = " + (j >= i)); //true
        System.out.println("k >= j = " + (k >= j)); //true

        //lebih besar dari
        System.out.println("lebih kecil dari...");
        System.out.println("i < j = " + (i < j )); //true
        System.out.println("j < i = " + (j < i)); //false
        System.out.println("k < j = " + (k < j)); //true

        //lebih kecil atau sama dengan
        System.out.println("lebih kecil atau sama dengan...");
        System.out.println("i <= j = " + (i <= j )); //true
        System.out.println("j <= i = " + (j <= i)); //false
        System.out.println("k <= j = " + (k <= j)); //true

        //sama dengan
        System.out.println("sama dengan...");
        System.out.println("i == j = " + (i == j )); //false
        System.out.println("k == j = " + (k == j)); //true

        //tidak sama dengan
        System.out.println("tidak sama dengan...");
        System.out.println("i != j = " + (i != j )); //true
        System.out.println("k != j = " + (k != j)); //false
    }
}
