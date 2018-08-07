import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = 0, k = 0, q, temp = 0;
        while (input.hasNext()) {
            n = input.nextInt();
            q = temp = n;
            k = input.nextInt();
            while ((n =temp/k) > 0) {
                q+= n;
                temp = temp%k + n;
            }
            System.out.println(q);
        }
    }
}