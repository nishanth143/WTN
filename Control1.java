import java.io.*;
class Control1
{
public static void main(String[]args)
{
int a=Integer.parseInt(args[0]);
if(args.length==0)
System.out.println("An integer number as argument is expected");
if(a>0)
{
System.out.println("a is a positive number");
}
else if(a<0)
{
System.out.println("a is a negative number");
}
else 
{
System.out.println("o is neither negative nor positive");
}
}
}

