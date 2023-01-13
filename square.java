import java.util.Scanner;
public class square
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("Pick a number user!");
  long num = scan.nextLong();
  long min = 0L;
  long max = 0L;
  for(long i = 0L; i < num; i ++)
  {
   if(((i*i)>=num)&&(((i-1)*(i-1))<=num))
   {
    min = i-1;
    max = i;
   }
  }
  double bestdiff = num;
  double topdawg = 0;
  for(double c = (double)min; c < (double)max; c = c + 0.000001)
  {
   if((double)((long)(c*c)-num)<Math.abs(bestdiff))
   {
    bestdiff = (double)((long)(c*c)-num);
    topdawg = c;
   }
  }
  System.out.println("The square root of " + num + " is " + topdawg);
 }
}
