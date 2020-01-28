import java.io.*;
class Control3
{
public static void main (String[ ]args)
{
String str=args[0];
char [] s=str.toCharArray();
int l=str.length();
int i=0,st=0;
while(i<=l-1)
{
if(s[i]!=s[l-1])
{
st=1;
break;
}
i++;
l--;
}
if(st==0)
System.out.println("palindrome");
else
System.out.println("not a palindrome");
}
}