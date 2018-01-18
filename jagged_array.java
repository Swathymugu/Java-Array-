import java.io.*;
class Jag
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter r");
int r=Integer.parseInt(br.readLine());
 int a[][]=new int[][r];
int c;
 for(int i=0;i<r;i++)
 {
 System.out.println("enter no of columns for"+"\t"+(i+1)+"\t"+"row:");
 c=Integer.parseInt(br.readLine());
 a[i]=new int[c];
}
for(int i=0;i<r;i++)
 for(int j=0;j<a[i].length;j++)
{
 System.out.println("enter ele:");
 a[i][j]=Integer.parseInt(br.readLine());
}
for(int i=0;i<r;i++)
{
 for(int j=0;j<a[i].length;j++)
System.out.println("\t"+a[i][j]);
System.out.println(" ");
}
}
}