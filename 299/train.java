import java.util.Scanner;

 class Main{
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
    int i,j,k,t,n,b,c;
	int[] a = new int[100];
	t = in.nextInt();
    for(k=1;k<=t;k++)
    {
    c=0;
	n = in.nextInt();
    for(i=0;i<n;i++)
		a[i] = in.nextInt();        
 
    for(i=1;i<n;i++)
        for(j=n-1;j>=i;j--)
            if(a[j-1]>a[j])
                {
                c++;
                b=a[j-1];
                a[j-1]=a[j];
                a[j]=b;
                }
   System.out.println("Optimal train swapping takes " +c +" swaps.");
	}
 }

}