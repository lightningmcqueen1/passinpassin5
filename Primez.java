public class Primez
{
 public static void main(String[] args)
 {
  long SAM = 2L;
  int count = 0;
  long max = 0;
  while(SAM < (Math.pow(2,63)-1))
  {
   count = 0;
   for(long i = 1L; i < SAM/2 + 1; i++)
   {
    if(SAM%i == 0)
    {
     count ++;
    }
   }
   if(count == 1)
   {
    max = SAM;
    System.out.println(MAX);
