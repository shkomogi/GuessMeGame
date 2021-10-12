import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Dan",38);
        System.out.println("Name: "+patient1.getName()+"\n"+"Age: "+patient1.getAge());

        Heart patient2 = new Heart("Normal",65);
        LeftEye patientEye = new LeftEye("Short sight","Brown");
        RightEye patientRightEye = new RightEye("normal","Hazel");
        Stomach patientStomach = new Stomach("Healthy","full");
        Skin patientSkin = new Skin("Burned","White",40);
           //while (patient1.options()!=6) {

               //patient1.options(2);


               //call options method
        //Switch case
        while (patient1.options()!=6) {
            System.out.println("Choose an organ: " + "\n" + "\t" + "1.Right Eye" + "\n" + "\t" + "2.Left Eye" +
                    "\n" + "\t" + "3.Heart" + "\n" + "\t" + "4.Stomach" + "\n" + "\t" + "5.Skin" + "\n" + "\t" + "6.Exit");
            Scanner userInput = new Scanner(System.in);
            int namba = userInput.nextInt();

            /*switch (namba) {
                case (3):
                    System.out.println("Medical Condition: " + patient2.getMedicalCondition() + "\n" + "Heart rate: " + patient2.getRate());
                    patient2.heartRate(patient2.getRate());
                    //patient1.options();
                    continue;

                case (2):
                    System.out.println("Medical Condition: " + patientEye.getMedicalCondition() + "\n" + "Eye Color: " + patientEye.getColor());
                    //patient1.options();
                    continue;

                case (4):
                    System.out.println("Medical Condition: " + patientStomach.getMedicalCondition() + "\n" + "Stomach is " + patientStomach.getFull());
                    patientStomach.belly();
                    //patient1.options();
                    continue;

                default:
                    System.exit(0);
                    break;

            }*/
            // }

            if (namba == 3) {
                System.out.println("Medical Condition: " + patient2.getMedicalCondition() + "\n" + "Heart rate: " + patient2.getRate());
                patient2.heartRate(patient2.getRate());
                //patient1.options();

            } else if (namba == 2) {
                System.out.println("Medical Condition: " + patientEye.getMedicalCondition() + "\n" + "Eye Color: " + patientEye.getColor());
                patientEye.Close();
                //patient1.options();
            } else if (namba == 4) {
                System.out.println("Medical Condition: " + patientStomach.getMedicalCondition() + "\n" + "Stomach is " + patientStomach.getFull());
                patientStomach.belly();
                //patient1.options();
            } else if (namba==1){
                System.out.println("Medical Condition: " + patientRightEye.getMedicalCondition() + "\n" + "Right Eye Color: " + patientRightEye.getColor());
                patientRightEye.CloseRight();
                //patient1.options();

            }else if(namba==5){
                System.out.println("Medical Condition: "+ patientSkin.getMedicalCondition()+"\n"+"Skin color: "+patientSkin.getColor()+"\n"+"Softness: "+patientSkin.Softness+" of 100");

            }

            else {
                System.out.println("Wrong input. Program exiting...");
                System.exit(0);
            }
        }







        //Ask for user's name, age and gives menu option
        /*System.out.print("Enter Patient's Name: ");
        Scanner username = new Scanner(System.in);
        String name = username.next();

        System.out.println("Hi "+ name);
        System.out.print("Enter Age: ");
        Scanner userAge = new Scanner(System.in);
        int Age = userAge.nextInt();
        //System.out.println(name + ", Age: "+ Age);
        System.out.println("Choose Organ:");
        System.out.println("\t"+"1.Right Eye"+"\n"+"\t"+"2.Left Eye"+
                "\n"+"\t"+"3.Heart"+"\n"+"\t"+"4.Stomach"+"\n"+"\t"+"5.Skin"+"\n"+"\t"+"6.Exit");
        Scanner userChoice = new Scanner(System.in);
        int Choice = userChoice.nextInt();
        if (Choice==6){
            System.exit(0);
        }else{
            System.out.println("OK!");
        }*/


    }
}
