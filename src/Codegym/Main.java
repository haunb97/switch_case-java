package Codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String dayInmonth ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("which month that you want to count day?");
        int month = sc.nextInt();
        switch (month) {
            case 2 :
                dayInmonth = "28 or 29";
                break;
            case 4 :
            case 6:
            case 9 :
            case 11 :
                dayInmonth = "30";
                break;
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10:
            case 12 :
                dayInmonth = "31" ;
                break;
            default:
                dayInmonth = "";
        }
        if(dayInmonth != ""){
            System.out.printf("the month %d has %s day !",month , dayInmonth);
        }
        else {
            System.out.printf("invalid input");
        }
    }
}
