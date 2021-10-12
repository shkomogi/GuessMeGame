import java.util.Scanner;

public class Stomach {
    String medicalCondition;
    String full;

    public Stomach(String medicalCondition, String full) {
        this.medicalCondition = medicalCondition;
        this.full = full;
    }

    public void belly() {
        System.out.println("1. Digest food");
        //get input from user
        Scanner stomach1 = new Scanner(System.in);
        int stomachAction = stomach1.nextInt();
        if (stomachAction == 1) {
            System.out.println("Food digested");
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

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }
}
