import java.util.Scanner;
public class sqrt
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("pick a number user");
  int num = scan.nextInt();
  int min = 0;
  int max = 0;
  for(int i = 0; i < num; i++)
  {
   if(((i*i)>=num)&&(((i-1)*(i-1))<=num))
   {
    min = i-1;
    max = i;
   }
  }
  double bestdiff = 1000;
  double topdawg = 0;
  for(double c = (double)min; c < max; c = c + 0.0001)
  {
   if((double)((c*c)-num)<Math.abs(bestdiff))
   {
    bestdiff = (double)((c*c)-num);
    topdawg = c;
   }
  }
  System.out.println("The square root of " + num + " is " + topdawg);
 }
}
