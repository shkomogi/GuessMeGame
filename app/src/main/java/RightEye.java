import java.util.Scanner;

public class RightEye {
    String medicalCondition;
    String Color;

    public RightEye(String medicalCondition, String color) {
        this.medicalCondition = medicalCondition;
        Color = color;
    }
    public void CloseRight() {
        System.out.println("1. Close");
        //get input from user
        Scanner Righteye = new Scanner(System.in);
        int eyeAction = Righteye.nextInt();

            if (eyeAction == 1) {
                System.out.println("Right eye Closed");
            } else {
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
