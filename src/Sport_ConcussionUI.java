import java.util.Scanner;
public class Sport_ConcussionUI {
    public static Sport_Concussion SC= new Sport_Concussion();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do{
            displayMenu();
            int choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                    SC.addAthlete();
                    break;

                case 2:
                    SC.addMed_Pract();
                    break;
                case 3:
                    SC.addGame();
                    break;
                case 4:
                    SC.ShowResult();
                    break;
                case 5:
                    SC.GetResult();

                    break;
                case 6:
                    System.out.println("Exciting the program... ");
                    System.exit(0);

                default:
                    System.out.println("Invalid Input ");
            }

        } while(true);

    }
    static void displayMenu()
    {
        System.out.println("Welcome to Sport Concussion Assessment System!");
        System.out.println("==================================");
        System.out.println("\t\t  1. Add  Athlete");
        System.out.println("\t\t  2. Add  Medical Practitioner");
        System.out.println("\t\t  3. Add Game as Athlete");
        System.out.println("\t\t  4. As Medical Practitioner Show Total Symptoms and Severity score and Overall rating for Athlete");
        System.out.println("\t\t  5. Get Total Symptoms and Severity score and Overall rating as Athlete");
        System.out.println("\t\t  6. Exit");

    }
}

