import java.io.*;
class Control6
{
public static void main(String[]args)
{
int num=Integer.parseInt(args[0]);
int fact=1;

if(num==0)
System.out.println("1");
do
{
fact=fact*num;
num=num-1;
}
while(num>0);
System.out.println("factorial of num is :"+fact);
}
}
