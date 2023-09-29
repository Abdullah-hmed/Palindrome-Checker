import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Word: ");
        
        String word = input.nextLine();
        word = word.toLowerCase().trim().replaceAll("\\s", ""); //Converts word into lovercase and removes all the spaces before, within and after the word
        
        String rev = Palindrome(word);
        
        
        System.out.println("Reversed Word: "+rev);
        
        System.out.println("Palindrome Status: "+PalindromeChecker(word,rev));
        
    }
    
    public static boolean PalindromeChecker(String word,String rev){ // This method checks if word is palindrome or not
        if(word.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static String Palindrome(String n){ // This method reverses the word
        String lastletter;
        String remaining;
        if(n.length() == 1){
            return n; // base case
        }
        else{
            char letter = n.charAt(n.length()-1);       // Last letter of the String is stored in char letter
            lastletter = Character.toString(letter);    // char stored in 'letter' is converted into String
            remaining = n.substring(0, n.length()-1);   //the remaining part of the word is stored in String 'remaining'
            return lastletter+Palindrome(remaining);
        }
    }
}
