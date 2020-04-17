package problems;
import java.util.Scanner;
public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int   length= scanner.nextInt();

        String  games =scanner.next();
        int  countA=0, countB=0;


        for (int i=0; i<games.length(); i++){
            if (games.charAt(i)=='A') {
                countA++;
            }else{ countB++; } }
        if  (countA >countB){
            System.out.println("Anton");
        }else if (countB>countA){
            System.out.println("Danik");
        }else {
            System.out.println("Friendship");
        }
    }
}
