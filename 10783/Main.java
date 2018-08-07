import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext())
    {
      int total=sc.nextInt();
      for(int j=1; j<=total; j++)
      {
        int sum=0;
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a<=b)
        {
          if(a%2!=0)
          {
            sum+=a;
          }
          a++;
        }
        System.out.printf("Case %d: %d\n",j,sum);
      }
    }
  }
}