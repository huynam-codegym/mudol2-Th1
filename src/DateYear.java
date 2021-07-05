
import java.util.Scanner;

public class DateYear {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print( "hien thi so ngay");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("thang  '" + month + "' có 31 ngay!");
                break;
            case 2:
                System.out.print(" thang dăc biệt"+ month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("thang co 30 ngay "+ month);
                break;
            default:
                System.out.print("khong co");
                break;



        }
    }
}
