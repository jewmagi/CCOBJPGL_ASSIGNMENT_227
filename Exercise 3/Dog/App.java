public class App {
    public static void main(String[] args) throws Exception {
         // Create object from pet class
         Labradoodle myPet = new Labradoodle();

         myPet.howl();
         System.out.println("The color of my Labradoodle's fur is " + myPet.furColor );
         System.out.println();
         System.out.println("And she is " + myPet.personality );
         System.out.println();
         
    }
}
