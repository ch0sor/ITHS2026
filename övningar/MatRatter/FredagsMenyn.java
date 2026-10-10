package MatRatter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FredagsMenyn {

    public static void printRecipe(String recipeFileName) {
        System.out.println(new File(recipeFileName).getAbsolutePath());
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
                printRecipe(choice); /* 
                break;
            case "hamburgare":
                recipeFileName = "Hamburgare.txt";
                break;
            case "sushi":
                recipeFileName = "Sushi.txt";
                break;
            case "tacos":
                recipeFileName = "Tacos.txt";
                break;
            case "pasta": 
                recipeFileName = "Pasta.txt";
                break;

            default:
                System.out.println("Tyvärr, vi har inte det alternativet. Vänligen välj en maträtt från listan.");
                break;
        }  */

        input.close();
    }

}

}
