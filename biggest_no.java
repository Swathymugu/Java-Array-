import java.io.*;
class ArrayBig
{
int a[],n,big;
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
System.out.println(big);
}
void process()
{
 big=a[0];
for(int i=0;i<n;i++)
 if(a[i]>big)
 big=a[i];
}
}
class ArrayBigmain
{
public static void main(String arg[])throws IOException
{
ArrayBig a=new ArrayBig();
a.input();
a.process();
a.output();
}
}

 
