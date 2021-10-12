import java.util.Scanner;

public class LeftEye {
    String medicalCondition;
    String Color;

    public LeftEye(String medicalCondition, String color) {
        this.medicalCondition = medicalCondition;
        Color = color;
    }


    //method
    public void Close(){
        System.out.println("1. Close");
        //get input from user
        Scanner eye = new Scanner(System.in);
        int eyeAction = eye.nextInt();
        if (eyeAction==1){
            System.out.println("Closed");
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

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
