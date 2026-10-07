class character {
    String name;
    int health;

    // konstruktor som tar emot liv och namn
    character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // metod som skriver ut liv 
    void present(){
        System.out.println("Din karaktärs namn är: " + name);
        System.out.println("Din karaktärs HP är: " + health);
    }

   
}


public class gamecharacter {
     public static void main(String[] args) {
        character david = new character("David", 10);
        character travis = new character("Travis", 10);
    
        david.present();
        travis.present();
    }
}

