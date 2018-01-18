import java.io.*;
class Array
{
int a[],n;
void input()throws IOException
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter n");
n=Integer.parseInt(br.readLine());
a=new int[n];
for(int i=0;i<n;i++)
{
 System.out.println("enter"+(i+1)+"element:");
 a[i]=Integer.parseInt(br.readLine());
}
}
void output()
{
 for(int i=0;i<n;i++)
 System.out.println(a[i]);
}
}
class Amain
{
public static void main(String arg[])throws IOException
{
Array a=new Array();
a.input();
a.output();
}
}

 
