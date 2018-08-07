import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    while(input.hasNext())
    {
      int total=input.nextInt();
      for(int i=1; i<=total; i++)
      {
        int sum=0;
        int num1=input.nextInt();
        int num2=input.nextInt();
        while(num1<=num2)
        {
          if(num1%2!=0)
          {
            sum+=num1;
          }
          num1++;
        }
        System.out.printf("Case %d: %d\n",i,sum);
      }
    }
  }
}