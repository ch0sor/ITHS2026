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
                System.out.println("Du har valt Pizza. Här kommer receptet:");
                printRecipe("Pizza.txt"); // Call the printRecipe method with the corresponding recipe file
                break;
            case "hamburgare":
                System.out.println("Du har valt Hamburgare. Här kommer receptet:");
                break;
            case "sushi":
                System.out.println("Du har valt Sushi. Här kommer receptet:");
                break;
            case "tacos":
                System.out.println("Du har valt Tacos. Här kommer receptet:");
                break;
            case "pasta": 
                System.out.println("Du har valt Pasta. Här kommer receptet:");
                break;

            default:
                System.out.println("Tyvärr, vi har inte det alternativet på menyn.");
                break;
        }

        input.close();
    }

    public static void printRecipe(String recipeFileName) {
        try {
            File recipeFile = new File(recipeFileName);
            Scanner fileInput = new Scanner(recipeFile);

            while (fileInput.hasNextLine()) {
                System.out.println(fileInput.nextLine());
            }
            fileInput.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Receptfilen hittades inte: " + recipeFileName);
        }
    }

}
