import java.util.Scanner;

public class MultiDimenArray {
    public static void main(String[] args){
        Scanner eut = new Scanner(System.in);
            System.out.println("Enter Row Size");
         int a = eut.nextInt();
            System.out.println("Enter Column Size");
         int b = eut.nextInt();
            System.out.println("ENTER ELEMENTS:");
         
         int [][] numbers = new int [a][b];
        
            for(int i = 0; i < a; i++){
                for(int j = 0; j < b; j++){
                    System.out.printf("Row: " + i + "Column: " + j + "|" + "Enter Element:");                    
                    int c = eut.nextInt();
                    numbers [i][j] = c; 
                }
            }
            System.out.println("");
            System.out.println("");
                for(int o = 0; o < a; o++){
                    for(int p = 0; p < numbers[o].length; p++){
                        System.out.print(numbers[o][p] + "\t");    
                    }
                    System.out.println("");
                }
        
    }
}
