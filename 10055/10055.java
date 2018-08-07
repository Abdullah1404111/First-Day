import java.util.Scanner;
class Main 
{
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      while(input.hasNext())
      {
          long num1=input.nextLong();
          long num2=input.nextLong();
          if(num1>num2)
              System.out.println(num1-num2);
          else
              System.out.println(num2-num1);
 
      }
    }
}