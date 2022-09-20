/**Mencari Nilai terbesar dari 3 variables

 * 
 * Created by 21343009_Mukhtarijal
 */
public class BiggerValue {
    public static void main(String[] args){
        int a = 10;
        int b = 23;
        int c = 5;
        int bigger = 0;

        bigger = (b > c) ? (b > a) ? b : a : c;
        System.out.println("number 1 = "+ a);
        System.out.println("number 2 = "+ b);
        System.out.println("number 3 = "+ c);
        System.out.println("Nilai tertinggi adalah angka = "+ bigger);
    }
}
