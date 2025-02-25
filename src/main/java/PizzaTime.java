import java.util.Scanner;
import java.util.ArrayList;
public class PizzaTime {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Pizza Time!---");
        System.out.println("Street Name?");
        
        String street = scanner.nextLine();
        street.toUpperCase().trim();

        boolean input = false;
        do {
            switch (street.toUpperCase().trim()) {
                case "BURROWS":
                input = true;
                break;

                case "MAIN":
                input = true;
                break;

                case "HENDERSON":
                input = true;
                break;

                case "MAGNUS":
                input = true;
                break;

                case "MOUNTAIN":
                input = true;
                break;

                default: 
                System.out.println("We don't deliver to this street, try again.");
                street = scanner.nextLine();
                input = false;
                break;
                
            }
        } while (!input);

    
        System.out.println("Street Number?");
        int streetNum = scanner.nextInt();

            
        System.out.println("Enter City");
        String city = scanner.nextLine().toUpperCase().trim();

        switch (city) {
            case "WINNIPEG":
            System.out.println("Valid City");
            break;
        
            default:
            System.out.println("error");
            city = scanner.nextLine().toUpperCase().trim();
            
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
        System.out.println("1: Small (10 inches) \n2: Medium (14 inches) \n3: Large Pizza (16 inches)");
        int pizChoice = scanner.nextInt();

        //while(pizChoice != "SMALL" || pizChoice != "MEDUIM" || pizChoice != "LARGE"){
           // System.out.println("Invalid choice.");
            //pizChoice = scanner.nextLine();
            //pizChoice.toUpperCase();
       // }
        
        switch (pizChoice) {
            case 1:
            double small = 10;

            case 2:
            double medium = 12;
                

            case 3:
            double large = 15;
                
        
            default:
                System.out.println("Invalid Choice. Try Again");
                pizChoice = scanner.nextInt();
        }
        
        System.out.println("Toppings");
        System.out.println("1: Pepperonis \n2: Bacon \n3: Ham \n4: Pineapples");
        int topChoice = scanner.nextInt();
        switch (topChoice) {
            case 1:
            double pepps = 3.50;
            break;
            
            case 2:
            double bacon = 4.00;
            break;

            case 3:
            double ham = 4.50;
            break;

            case 4:
            double pines = 5.00;
            break;

            default:
            System.out.println("Invalid Choice. Try Again");
            topChoice = scanner.nextInt();
        }

    }
        


       
        


}
    


