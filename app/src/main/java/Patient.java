import java.util.Scanner;

public class Patient {
    //fields
    private String name;
    private int Age;
    public int Optimus;

//constructor
    public Patient(String name, int age) {
        this.name = name;
        Age = age;
    }
    //method
    /*public int options (int choice){

        System.out.println("\t"+"1.Right Eye"+"\n"+"\t"+"2.Left Eye"+
                "\n"+"\t"+"3.Heart"+"\n"+"\t"+"4.Stomach"+"\n"+"\t"+"5.Skin"+"\n"+"\t"+"6.Exit");
        return Optimus;
    }*/
    //setter getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int options() {
        System.out.println("Choose a medical condition:");
        System.out.println("\t"+"1.Right Eye"+"\n"+"\t"+"2.Left Eye"+
                "\n"+"\t"+"3.Heart"+"\n"+"\t"+"4.Stomach"+"\n"+"\t"+"5.Skin"+"\n"+"\t"+"6.Exit");
        Scanner userInput = new Scanner(System.in);
        int namba = userInput.nextInt();
        return namba;
    }
}
