import java.util.Scanner;
public class billcalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int bill;
        if (units <= 100) {
            bill = units * 5;
        } else if (100 < units && units < 201) {
            bill = units * 7;
        } else {
            bill = units * 10;
        }
        System.out.println(bill);
    }
}
   
 
 