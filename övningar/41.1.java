public class MainClass {
    public static void main(String[] args) {
          
        // deklarera klass
        class Djur{
        String ljud;
        }

        Djur (String ljud){
            this.ljud = ljud;
        }
        
        // method 
        void gorLjud() {
            System.out.println(ljud);
        }
        
        // skapar nya objekt
       Djur hund = new Djur(ljud: "voff");
       Djur katt = new Djur(ljud: "Mjau");

        // kallar metoden
       hund.gorLjud();
       katt.gjorLjud();

    }
}