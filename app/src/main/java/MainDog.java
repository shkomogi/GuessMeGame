public class MainDog {
    public static void main(String[] args) {
        //Initialize and define objects using a Constructor
        Dog myDog = new Dog("Buddy","Brown",4,true);

        //Initialize Bird
        Bird Cockatoo =new Bird("Cocky","White",2,true);

        System.out.println("Dog's name: "+myDog.getName());
        System.out.println("Bird's name: "+Cockatoo.getName());
        myDog.eating("Sausage");

        //Can have access to all fields and public properties
        //since field in Dog class are Private, we have to generate setter/getter methods
        //setter having this keyword and getter having return keyword
        //In Main, constructor is used to define a new object - myDog
    }
}
