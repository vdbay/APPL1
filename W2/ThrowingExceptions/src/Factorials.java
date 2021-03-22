import java.util.Scanner;
public class Factorials
{
    public static void main(String[] args)
    {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y"))
        {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            if(val<0){
                try{
                    throw new IllegalArgumentException("Cant input negative value");
                }catch(Exception e){
                    System.out.println(e);
                }
            }else{
                System.out.println("Factorial(" + val + ") = "
                        + MathUtils.factorial(val));
            }
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
    }
}