package NinetiesHeader;

public class OfficeEligibility {
    public static void main(String[] args){
        int userAge = 33;
        
        if(userAge >= 30){
            System.out.println("You can run for the US Senate or House");
        } else if(userAge >= 25){
            System.out.println("You can run for the US House of Representatives");
        } else {
            System.out.println("You are not old enough for US Congress, sorry");
        } // close if-else blocks
    } // close main
} // close class

