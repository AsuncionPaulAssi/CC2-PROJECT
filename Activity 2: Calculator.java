
package javaapplication7;

import java.util.*;

    public class Calculator {
        public static void main(String[] args) {
            Scanner eut = new Scanner(System.in);
            
            System.out.println("Enter First Value");
                double a = eut.nextDouble();
            System.out.println("Enter Second Value");
                double b = eut.nextDouble();
            System.out.println("Enter Arithmetic Operation");
            
                String operator = eut.next();
                
                    switch(operator){
                        case("+"):
                        case("add"):
                            System.out.println("sum: "+ (a+b));
                          break;
                        
                        case("-"):
                        case("subtract"):
                            System.out.println("difference: "+ (a-b));
                          break;
                        
                        case("*"):
                        case("multiply"):
                            System.out.println("pruduct: "+ (a*b));
                          break;
                          
                        case("/"):
                        case("divide"):
                            System.out.println("qoutient: "+ (a*b));
                          break;
                          
                        case("%"):
                        case("modulo"):
                            System.out.println("mod:"+ (a%b));
                          break;
                        
                          
        }
                
                
            
            
           
        }

    }
