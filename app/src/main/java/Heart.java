import java.util.Scanner;

public class Heart {
    String medicalCondition;
    int Rate;

    //constructor


    public Heart(String medicalCondition, int rate) {
        this.medicalCondition = medicalCondition;
        Rate = rate;
    }

    //method change rate
    public void heartRate(int heartrate){
        System.out.println("1. Change Rate");
        //get output from user
        Scanner scanRate = new Scanner (System.in);
        int scan = scanRate.nextInt();
        if (scan==1){
            System.out.println("Enter a heart rate: ");
            Scanner newRate = new Scanner(System.in);
            int newrate = newRate.nextInt();
            System.out.println(newrate);
        }else{
            System.out.println("Please type in 1");
        }
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
    }
}
