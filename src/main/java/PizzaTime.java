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
                System.out.println("Invalid Street Name. Pleae Try Again");
            }
        }


        System.out.println("Street Number?");
        int streetNum = scanner.nextInt();


        String must = "Winnipeg";
        boolean valid = false;

         while (!valid) {
            System.out.println("City Name?");
            String city = scanner.nextLine();

            if (city.equals(must)) {
                valid = true;
            }
            else {
                System.out.println("Please enter another valid city");
            }
        }
        
        //A1A 1A1
        //computers count from; 0,1,2
        System.out.println("Postal Code?");
        String postal = scanner.nextLine();

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

        ArrayList<String> firstCharsNot = new ArrayList<>();    //not first characters
        firstCharsNot.add("D");
        firstCharsNot.add("F");
        firstCharsNot.add("I");
        firstCharsNot.add("O");
        firstCharsNot.add("Q");
        firstCharsNot.add("U");
        firstCharsNot.add("W");
        firstCharsNot.add("Z");

        ArrayList<String> firstChars = new ArrayList<>();
        firstChars.add("D");
        firstChars.add("F");
        firstChars.add("I");
        firstChars.add("O");
        firstChars.add("Q");
        firstChars.add("U");


        char firstChar = postal.charAt(0);
        boolean isChar;
        if (firstCharsNot.contains(firstChar)) {
            isChar = false;
        }
        else {
            isChar = true;
            System.out.println(isChar);
        }

        char secChar = postal.charAt(1);
        boolean isNum;
        if (postalNum.contains(secChar)) {
            isNum = true;
            System.out.println(isNum);
        }
        else {
            isNum = false;
        }



        



            
    }
        


       
        


}
    


