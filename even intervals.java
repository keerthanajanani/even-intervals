# even-intervals
import java.io.*;
import java.util.*;
public class even intervals
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the input:"):
n=Integer.parseInt(br.readLine());
for(i=1;i<=100;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}
