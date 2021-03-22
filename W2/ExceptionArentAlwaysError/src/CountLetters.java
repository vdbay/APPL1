import java.util.Scanner;
public class CountLetters
{
    public static void main(String[] args)
    {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();//scan
        word = word.toUpperCase();
        for (int i=0; i < word.length(); i++) //count
            try{
                counts[word.charAt(i)-'A']++;
            }catch (Exception e){
                System.out.println(word.charAt(i)+" Not a letter!");
            }
        System.out.println(); //print
        for (int i=0; i < counts.length; i++)
            if (counts [i] != 0)
                System.out.println((char)(i +'A') + ": " + counts[i]);
    }
}