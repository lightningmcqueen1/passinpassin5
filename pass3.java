import java.util.Scanner;
public class pass3
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  String password = "sh";
  String input = "";
  System.out.println("Please enter password");
  input = scan.nextLine();
  if(input.equals(password))
  {
   System.out.println("login correct");
  }
  else
  {
   System.out.println("login incorrect");
  }
 }
}
