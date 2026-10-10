package MatRatter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FredagsMenyn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] matRatter = {"Pizza", "Hamburgare", "Sushi", "Tacos", "Pasta"};
        System.out.println("Välkommen till Fredagsmenyn! Här är våra alternativ:");

        for (String matRatt : matRatter) {
            System.out.println("- " + matRatt);
        }
        System.out.println("Välj en maträtt för att få ut receptet.");

        String choice = input.nextLine().toLowerCase(); // Convert the input to lowercase for case-insensitive comparison
        
        switch (choice) {
            case "pizza":
                printRecipe(choice + ".txt"); 
                choice = "pizza";
                break;
            case "hamburgare":
                printRecipe(choice + ".txt"); 
                choice = "hamburgare";
                break;
            case "sushi":
                printRecipe(choice + ".txt"); 
                choice = "sushi";
                break;
            case "tacos":
                printRecipe(choice + ".txt"); 
                choice = "tacos";
                break;
            case "pasta": 
                printRecipe(choice + ".txt"); 
                choice = "pasta";
                break;

            default:
                System.out.println("Tyvärr, vi har inte det alternativet. Vänligen välj en maträtt från listan.");
                break;
        }  

        input.close();
    }

     public static void printRecipe(String recipeFileName) {
        System.out.println("Här är receptet för ditt val:");
        try {
            File recipeFile = new File(recipeFileName);
            Scanner fileInput = new Scanner(recipeFile);

            while (fileInput.hasNextLine()) {
                System.out.println(fileInput.nextLine());
            }
            fileInput.close(); // Close the file scanner after reading
        }
        catch (FileNotFoundException e) { // Handle the case where the recipe file is not found
            System.out.println("Receptfilen hittades inte: " + recipeFileName);
        }

    }


}


