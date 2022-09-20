//Percobaan penggunaan Operator Kondisi (?:)

/**
 * Created by 21343009_Mukhtarijal
*/
public class KondisiOperator {
    public static void main(String[] args){
        String status = "";
        int grade = 50;

        //Mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";

        //print status
        System.out.println(status);
        
    }
}
