public class StringWorkshop {
    public static void main(String[] args) {
        String firstName = "Anna"; 
        String lastName = "Andersson"; 
        String fullName = firstName + " " + lastName; 
        System.out.println(fullName); 
        System.out.println(fullName.length());

        String city = "Göteborg"; 
        String profession = "Mjukvarutestare";

        System.out.println(fullName + " bor i " + city + " och utbildar sig till " + profession); 
    }
    
}
