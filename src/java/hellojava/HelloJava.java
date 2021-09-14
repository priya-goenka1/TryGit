package java.hellojava;

public class HelloJava {

     public static void main(String[] args) {
    	 String string = "Destination";      
         String reversedStr = "";        
         for(int i = string.length()-1; i >= 0; i--){    
             reversedStr = reversedStr + string.charAt(i);    
         }    
           //print reverse of string  
         System.out.println("Original string1: " + string);      
         System.out.println("Reverse of string: " + reversedStr); 
         System.out.println("All is well");
     }     
     }




