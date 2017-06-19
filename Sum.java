import java.util.*;
import java.util.Scanner;
class Sum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int sum=0;
N=N*(N+1);
for(int i=0;i<=N;i++)
{
sum=sum+i;
System.out.println("Sum:"+sum);
}
}
}
