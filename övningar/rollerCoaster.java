import java.util.Scanner;

public class rollerCoaster {
     
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);

      // Prompt the user for their age and height
        System.out.println("Enter age:");
        int age = input.nextInt();

        System.out.println("Enter height in cm:");
        double height = input.nextDouble();

      // Define the age restriction and height limits
        int ageRestriction = 10;
        double heightLimit = 195.0;
        double heightMin = 110.0;

      // Check if the user meets the requirements to ride
        if (age < ageRestriction) {
            System.out.println("You are too young to ride.");
        }
         else if (age > ageRestriction) {
            System.out.println("You are old enough to ride.");
        }
        else if (height > heightLimit) {
            System.out.println("You are too tall to ride.");
        }
        else if (height < heightLimit) {
            System.out.println("You are within the height limit.");
        }
        else if (height < heightMin) {
            System.out.println("You are too short to ride.");
        }
        else if (height > heightMin) {
            System.out.println("You are tall enough to ride.");
        }
        else {
            System.out.println("You do not meet the requirements to ride.");
        }

        input.close(); // Close the scanner to prevent resource leaks
    }

}

