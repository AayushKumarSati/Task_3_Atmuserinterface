import java.util.Scanner;


//This Is A Atm User Interface IN Using Java Programming Language:
public class atm_Interface1 {
    private static double Balance = 50000.0; // This Is A Account Balance;
    // private static int password=789456;    //This Is A Atm Pin Number;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("-----Welcome To This ATM ! -----");
            System.out.println(" ---: 1.Check Your Balance Now :---");
            // System.out.println(" ---: Enter Your Atm Pin Number :---");
            System.out.println("---: 2.WithDraw Founds in :---");
            System.out.println("---: 3.Exit Now :---");
            System.out.print("<-- Enter Your Choice Now -->");
            int Choice = scn.nextInt();
            switch (Choice) {
                case 1:
                    checkBalance();
                    break;

                    // case 2:
                    // password_Enter();
                    // break;
                case 2:
                    withdrawFunds(scn);
                    break;

                case 3:
                    System.out.println(" <--Thank You For Using This Atm ! -->");
                    return;
                default:
                    System.out.println("Invalid Choice Sorry Plese Try Again Later!");
            }

        }
    }

    private static void checkBalance() {
        System.out.println("Your Account Balace Is : " + Balance);
    }
    // private static void password_Enter(){
    //     System.out.println("Enter Your Password in " + password);
    // }

    private static void withdrawFunds(Scanner scn) {
        System.out.print(" Enter The Ammount Is Withdraw : $");
        double Ammount = scn.nextDouble();

        if (Ammount > 0 && Ammount <= Balance) {
            Balance -= Ammount;
            System.out.println("Your Balance Successfully .Remaining Balance : $ " + Balance);

        } else {
            System.out.println("Sorry, invalid Ammounts In This Your Account ");
        }
    }

}
