import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sport_Concussion {
    Scanner scan = new Scanner(System.in);
    HashMap<String, ArrayList<int[]>> SypmResult = new HashMap<String, ArrayList<int[]>>();
    ArrayList<Athlete> athletesList = new ArrayList<Athlete>();
    ArrayList<MedicalPractitioner> medpractList = new ArrayList<MedicalPractitioner>();


    public void addAthlete() {
        scan.nextLine(); // clear the input stream
        System.out.println(" Name of Athlete?: ");
        String name = scan.nextLine();
        //scan.next();
        boolean temp = false;
        for (int i = 0; i < athletesList.size(); i++) {
            if (athletesList.get(i).toString().equals(name)) {
                temp = true;
                System.out.println("Athlete already exists");
                break;

            }
        }
        if (temp == false) {
            Athlete a = new Athlete(name);
            athletesList.add(a);
            ArrayList<int[]> atharray = new ArrayList<int[]>();
            SypmResult.put(name, atharray);
            System.out.println("Athlete added");
        }
    }

    public void addMed_Pract() {
        scan.nextLine(); // clear the input stream
        System.out.println("Name of Medical Practitioner?: ");
        String name = scan.nextLine();
        //scan.nextLine();
        boolean temp = false;
        for (int i = 0; i < medpractList.size(); i++) {
            if (medpractList.get(i).toString().equals(name)) {
                temp = true;
                System.out.println("Practitioner already exists");
                break;

            }
        }
        if (temp == false) {
            MedicalPractitioner m = new MedicalPractitioner(name);
            medpractList.add(m);
            System.out.println("Practitioner added");
        }
    }

    public void addGame() {
        if(athletesList.size()==0){
            System.out.println("No Athlete is in the list Please add Athlete first");
        }
        else {
            scan.nextLine();
            boolean flag = false;
            boolean checkAth=false;
            System.out.println("Please enter Athlete name");
            String Athlete_Name = scan.nextLine();
            Athlete Ath= new Athlete(Athlete_Name);
            for (int i = 0; i < athletesList.size(); i++) {
                if (athletesList.get(i).toString().equals(Athlete_Name)) {
                    checkAth=true;
                    ArrayList<int[]> atharray = SypmResult.get(Athlete_Name);
                    atharray.add(Ath.addSymptoms());
                    if (atharray.size() > 5) {
                        flag = true;
                        atharray.remove(0);
                        SypmResult.put(Athlete_Name, atharray);
                        System.out.println("Game added remove 1st");
                        break;
                    } else if (flag == false) {
                        SypmResult.put(Athlete_Name, atharray);
                        System.out.println("Game added");
                    }

                    break;
                }
            }
            if(checkAth==false)
            {
                System.out.println("Athlete doesn't exist");
            }
        }

    }
    public void  GetResult(){
        int symptomDifference=0;
        int symptomSeverityScore=0;
        if(athletesList.size()==0){
            System.out.println("No Athlete is in the list");
        }
        else {
            scan.nextLine();
            System.out.println("Enter Athlete Name");
            String Ath_Name = scan.nextLine();
            boolean test = false;
            boolean countCheck = false;
            for (int i = 0; i < athletesList.size(); i++) {
                if (athletesList.get(i).toString().equals(Ath_Name)) {
                    test = true;
                    //System.out.println(Ath_Name);
                    ArrayList<int[]> atharrayList = SypmResult.get(Ath_Name);
                    ArrayList<Integer> total_sympList = new ArrayList<Integer>();
                    ArrayList<Integer> severity_scoreList = new ArrayList<Integer>();

                    //System.out.println(SypmResult.get(Ath_Name).size());
                    for (int j = 0; j < atharrayList.size(); j++) {
                        int total_symp = 0;
                        int severity_score = 0;

                        System.out.println("Symptoms for game " + (j + 1));
                        int[] tmp = atharrayList.get(j);
                        for (int k = 0; k < tmp.length; k++) {
                            if (tmp[k] > 0) {
                                total_symp = total_symp + 1;
                                severity_score = severity_score + tmp[k];

                            }
                            System.out.print(tmp[k] + " ");

                        }
                        System.out.println();
                        System.out.println("Total no. of symptoms is : " + total_symp + " And Symptom Severity score is:  " + severity_score);
                        total_sympList.add(total_symp);
                        severity_scoreList.add(severity_score);


                    }
                    if(atharrayList.size() == 0)
                    {
                        System.out.println("Not a single game added");
                        break;
                    }
                    else if (atharrayList.size() == 1) {
                        countCheck = true;
                        symptomDifference=total_sympList.get((atharrayList.size()) - 1);
                        symptomSeverityScore= severity_scoreList.get((atharrayList.size()) - 1);

                    } else if (atharrayList.size() >= 1) {
                        symptomDifference = total_sympList.get((atharrayList.size()) - 1) - total_sympList.get((atharrayList.size()) - 2);
                        symptomSeverityScore = severity_scoreList.get((atharrayList.size()) - 1) - severity_scoreList.get((atharrayList.size()) - 2);
                    }
                    String overallRating = "";
                    if (symptomDifference < 3 && symptomSeverityScore < 10) {
                        System.out.println("No Difference");
                        overallRating = "No Difference";
                    } else if (symptomDifference < 3 && symptomSeverityScore >= 10) {
                        System.out.println("Unsure");
                        overallRating = "Unsure";
                    } else if (symptomDifference >= 3 || symptomSeverityScore >= 15) {
                        System.out.println("Very Different");

                        overallRating = "Very Different";
                    }
                    //display Risky condition indicator
                    String ANSI_RESET = "\u001B[0m";
                    String ANSI_BLACK_BACKGROUND = "\u001B[40m";
                    String ANSI_RED_BACKGROUND = "\u001B[41m";
                    String ANSI_GREEN_BACKGROUND = "\u001B[42m";
                    String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
                    String ANSI_BLUE_BACKGROUND = "\u001B[44m";
                    String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
                    String ANSI_CYAN_BACKGROUND = "\u001B[46m";
                    String ANSI_WHITE_BACKGROUND = "\u001B[47m";

                    System.out.println("The following is the Risky Condition indicator :");
                    System.out.println("");
                    if (overallRating.equals("Very Different")) {
                        System.out.println(ANSI_RED_BACKGROUND + overallRating.toString() + ANSI_RESET);
                    } else if (overallRating.equals("Unsure")) {
                        System.out.println(ANSI_YELLOW_BACKGROUND + overallRating.toString() + ANSI_RESET);
                    } else if (overallRating.equals("No Difference")) {
                        System.out.println(ANSI_GREEN_BACKGROUND + overallRating.toString() + ANSI_RESET);
                    }
                    break;
                }


            }
            if(test==false)
            {
                System.out.println("Athlete doesn't exist");
            }
        }
    }
    public void  ShowResult(){
        if(medpractList.size()==0)
        {
            System.out.println("No Medical Practitioner is in the list");
        }
        else {
            boolean check = false;
            scan.nextLine();
            System.out.println("Enter Medical Practitioner name");
            String Med_Pract = scan.nextLine();
            for (int i = 0; i < medpractList.size(); i++) {
                if (medpractList.get(i).toString().equals(Med_Pract)) {
                    check = true;

                    break;

                }
            }
            if (check == true) {
                GetResult();
            } else {
                System.out.println("Practitioner doesn't exist");
            }

        }
    }

}
