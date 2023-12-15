
import java.util.Scanner;

public class RESERVATION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. login ");
            System.out.println("2. Reservation");
            System.out.println("3. Cancel Reservation ");
            int option = sc.nextInt();
            switch (option) {
                     case  1:
                         login();
                         break;

                    case  2:
                        reservation();
                        break;

                        case  3:
                            cancel();
                            break;
            }
        }

    }
    static String login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Registered Email id or Phone number:");
        String    email = sc.next();
        System.out.print("Enter your Password:");
         String password = sc.next();
        return null;
    }

    static String registration(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Email id or Phone number:");
        String email1= sc.next();
        System.out.print("Enter a Password:");
        String password1 = sc.next();

        return null ;
    }
    static String reservation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter seat number (1-10): ");
        int seatNumber = sc.nextInt();
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid seat number!");
        }
        if (seatNumber < 10) {
            System.out.println("Seat Reserved your pnr number is 1234567890 ");
        }
        return null;
    }


    static int  cancel(){
               Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter seat number (1-10): ");
            int seatNumber = sc.nextInt();
            if (seatNumber < 1 || seatNumber > 10) {
                System.out.println("Invalid seat number!");
            }
        if (seatNumber < 10) {
            System.out.println("Seat Cancelled 1234567890 ");
        }
        return 0 ;
    }
}
