import java.util.Scanner;
    public class GuessingGame {
         public static void main(String[] args){
            Scanner eut = new Scanner(System.in);
             System.out.println("Input a number ");
             int x = eut.nextInt();
             
             while (x<0 || x>1000){
            System.out.println("Invalid number");
            System.out.println("Input a number");
            x = eut.nextInt();
             }
            
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println("");

            
            System.out.println("What is your guess");
            int y = eut.nextInt();
            
             while (y<0 || y>1000){
                 System.out.println("Your number is correct " + eut);
                 System.out.println("Input a number");
                 y = eut.nextInt();
             }
             
            while(y!=x){
                if (x%2 == 0){
                    System.out.println("Hint:The Number is Even ");
                }
                else {
                    System.out.println("Hint:The Number is Odd");
                }
            if (y<x){
                    System.out.println("The Number you input is too low");
            }
            else if (y>x){
                    System.out.println("The Number you input is too high");
            
            }
             System.out.println("What is your guess");
             y = eut.nextInt();
             if (y == x){
             
                 System.out.println("Correct");
         
    }
    }
    }
    }
