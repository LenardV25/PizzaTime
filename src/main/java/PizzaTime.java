import java.util.Scanner;
import java.util.ArrayList;
public class PizzaTime {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pizza Time!");

        ArrayList<String> streetNames = new ArrayList<>();
        streetNames.add("Burrows");
        streetNames.add("Main");
        streetNames.add("Henderson");
        streetNames.add("Magnus");
        streetNames.add("Mountain");
        
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Street Name?");
            String street = scanner.nextLine();

            if (streetNames.contains(street)) {
                isValid = true;
            }
            else {
                System.out.println("We do not deliver to this street, try again");
            }
        }


        System.out.println("Street Number?");
        int streetNum = scanner.nextInt();


        String must = "Winnipeg";

        System.out.println("City Name?");
        String city = scanner.nextLine();

        if (city.equals(city) == false) {
            System.out.println("We do not deliver in city, please enter another valid city");
            
        }
        
        
            
        
        //A1A 1A1
        //computers count from 0,1,2
        ArrayList<Integer> postalNum = new ArrayList<>();   //possible postal nums, no zeros
        postalNum.add(1);
        postalNum.add(2);
        postalNum.add(3);
        postalNum.add(4);
        postalNum.add(5);
        postalNum.add(6);
        postalNum.add(7);
        postalNum.add(8);
        postalNum.add(9);

        ArrayList<String> firstCharsNot = new ArrayList<>();    //first characters only not allowed
        firstCharsNot.add("D");
        firstCharsNot.add("F");
        firstCharsNot.add("I");
        firstCharsNot.add("O");
        firstCharsNot.add("Q");
        firstCharsNot.add("U");
        firstCharsNot.add("W");
        firstCharsNot.add("Z");

        ArrayList<String> firstChars = new ArrayList<>();   //characters allowed throughout
        firstChars.add("D");
        firstChars.add("F");
        firstChars.add("I");
        firstChars.add("O");
        firstChars.add("Q");
        firstChars.add("U");

        //A1A 1A1
        boolean goodPostal = false;

        // while (!goodPostal) {
        //     System.out.println("Postal Code?");
        //     String postal = scanner.nextLine();
            
        //     postal = postal.toUpperCase();
            
        //     char first = postal.charAt(0);
        //     if (firstCharsNot.contains(first)) {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     }
        //     else if (postalNum.contains(first)){
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     } else goodPostal = true;

        //     char sec = postal.charAt(1);
        //     if (postalNum.contains(sec)) {
        //         goodPostal = true;
        //     }
        //     else if (firstChars.contains(sec)) {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     } else goodPostal = true;

        //     char third = postal.charAt(2);
        //     if (firstChars.contains(third)) {
        //         goodPostal = true;
        //     } else if (postalNum.contains(third)) {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     } else{ 
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     } 
           

        //     char between = postal.charAt(3);
        //     boolean isSpace = Character.isSpaceChar(between);
        //     if (isSpace = false) {
        //         System.out.println("Please add a space in between");
        //         goodPostal = false;
        //     } else goodPostal = true;

            
        //     char fourth = postal.charAt(4);
        //     if (postalNum.contains(fourth)){
        //         goodPostal = true;
        //     } else {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     }

        //     char fifth = postal.charAt(5);
        //     if (firstChars.contains(fifth)) {
        //         goodPostal = true;
        //     } else {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     }

        //     char sixthChar = postal.charAt(6);
        //     if (postalNum.contains(sixthChar)) {
        //         goodPostal = true;
        //     } else {
        //         goodPostal = false;
        //         System.out.println("Invalid postal code");
        //     }
    
        // }
        System.out.println("Order Customization");
        System.out.println("Small (10 inches), Medium (14 inches), or Large Pizza (16 inches)?");
        
        String pizChoice = scanner.nextLine();
        pizChoice.toUpperCase();

        while(pizChoice !="SMALL" || pizChoice != "MEDUIM" || pizChoice != "LARGE"){
            System.out.println("Invalid choice.");
            pizChoice = scanner.nextLine();
            pizChoice.toUpperCase();
        }
        
        

        switch (pizChoice) {
            case "SMALL":
                double small = 1 * 10;
                break;

            case "MEDIUM":
                double medium = 1 * 12;
                break;

            case "LARGE":
                double large = 1 * 15;
                break;
        
            default:
                break;
        }


    }
        


       
        


}
    


