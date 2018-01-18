import java.io.*;
class ArrayAscending
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
void process()
{

 for(int i=0;i<n-1;i++)
  for(int j=i+1;j<n;j++)
  if(a[i]>a[j])
{
 int c=a[i];
 a[i]=a[j];
 a[j]=c;
}
}
}
class AAmain
{
public static void main(String arg[])throws IOException
{
ArrayAscending a=new ArrayAscending();
a.input();
a.process();
a.output();
 }
}
 