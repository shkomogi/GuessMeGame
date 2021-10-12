public class MainPhone {
    public static void main(String[] args) {
        //Define object
        Phone myiPhone = new Phone("iPhone 300i",64,6,16);
        //to access Phone class properties
        //myiPhone.setName("iPhone 3000");
        System.out.println("Phone Name: "+myiPhone.getName());

        //method access
        myiPhone.PlayMusic("Believer");

        //use setter method to set value
        //myiPhone.setCamera(16);
        System.out.println("Camera MegaPixels: "+ myiPhone.getCamera());

        //myiPhone.setMemoryRam(64);
        System.out.println("RAM size: "+ myiPhone.getMemoryRam());

        //myiPhone.setScreensize(6);
        System.out.println("Screensize: "+ myiPhone.getScreensize()+" inches");

        //Define a new object
        Phone Pixel = new Phone("Pixel 200x",8,5,8);

        //use getter method to print object's values
        System.out.println("----------------------------------");
        System.out.println("Phone Name: "+Pixel.getName());
        System.out.println("Camera: "+Pixel.getCamera()+" MegaPixels");
        System.out.println("RAM size: "+Pixel.getMemoryRam()+" GB");
        System.out.println("Screensize "+Pixel.getScreensize()+" inches");



    }
}
