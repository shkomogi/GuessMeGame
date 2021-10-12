public class Skin {
    String MedicalCondition;
    String color;
    int Softness;

    public Skin(String medicalCondition, String color, int softness) {
        MedicalCondition = medicalCondition;
        this.color = color;
        Softness = softness;
    }



    public String getMedicalCondition() {
        return MedicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        MedicalCondition = medicalCondition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return Softness;
    }

    public void setSoftness(int softness) {
        Softness = softness;
    }
}
