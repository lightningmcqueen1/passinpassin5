import java.util.Scanner;
public class Password
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  String word = "g";
  String input = "";
  while(true)
  {
   input = scan.nextLine();
   if(input.equals(word))
   {
    System.out.println("yay");
    break;
   }
   else
   {
    System.out.println("nay");
   }
  }
 }
}
# Password-Assignment-1
