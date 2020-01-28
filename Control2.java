import java.io.*;
class Control2
{
public static void main(String[]args)
{
int a=Integer.parseInt(args[0]);
 
int i,count=0;
for(i=1;i<=a;i++)
{
if(a%i==0)
count++;
}
if(a==0)
System.out.println("neither");

else if(count==2)
System.out.print("prime");
else
System.out.println("not a prime");
}
}