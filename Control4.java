import java.io.*;
class Control4
{
public static void main(String[]args)
{
int s=Integer.parseInt(args[0]);
int r,t=0;
while(s>0){
r=s%10;
t=t+r;
s=s/10;
}
System.out.println("the sum of the digits of s is:"+t);
}
}