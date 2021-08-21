import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.io.Serializable;

public class Athlete{
    Scanner scan = new Scanner(System.in);
    String Name;
    public Athlete(String firstName)
    {
        this.Name = firstName;

    }

    public String toString()
    {
        return Name;
    }

    public  int[] addSymptoms()
    {

        int score[]= new int[22];
        System.out.println("Please enter your Headache score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        int userInput=scan.nextInt();
        score[0] = userInput;
        System.out.println("Please enter your Pressure in head score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        userInput=scan.nextInt();
        score[1] = userInput;
        System.out.println("Please enter your Neck pain score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        userInput=scan.nextInt();
        score[2] = userInput;
        System.out.println("Please enter your Nausea or vomitting score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[3] = scan.nextInt();
        System.out.println("Please enter your Dizziness score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[4] = scan.nextInt();
        System.out.println("Please enter your Blurred vision score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[5] = scan.nextInt();
        System.out.println("Please enter your Balance problem score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[6] = scan.nextInt();
        System.out.println("Please enter your Sensitivity to light score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[7] = scan.nextInt();
        System.out.println("Please enter your Sensitivity to noise score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[8] = scan.nextInt();
        System.out.println("Please enter your Feeling slowed down score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[9] = scan.nextInt();
        System.out.println("Please enter your Feeling like in a fog score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[10] = scan.nextInt();
        System.out.println("Please enter your Don't feel right score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[11] = scan.nextInt();
        System.out.println("Please enter your Difficulty concentrating score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[12] = scan.nextInt();
        System.out.println("Please enter your Difficulty remembering score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[13] = scan.nextInt();
        System.out.println("Please enter your Fatigue or low energy score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[14] = scan.nextInt();
        System.out.println("Please enter your Confusion score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[15] = scan.nextInt();
        System.out.println("Please enter your Drowsiness score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[16] = scan.nextInt();
        System.out.println("Please enter your Trouble falling asleep score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[17] = scan.nextInt();
        System.out.println("Please enter your More emotional score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[18] = scan.nextInt();
        System.out.println("Please enter your Irritability score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[19] = scan.nextInt();
        System.out.println("Please enter your Sadness score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[20] = scan.nextInt();
        System.out.println("Please enter your Nervous or anxious score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
        score[21] = scan.nextInt();
        return score;

    }
}


