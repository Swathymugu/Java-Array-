import java.io.*;
class Stud
{
 int sno;
 String name;
 float wt;
void input()throws IOException
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter no,name & wt");
 sno=Integer.parseInt(br.readLine());
 name=br.readLine();
 wt=Float.parseFloat(br.readLine());
}
void output()
{
System.out.println(sno+"\t"+name+"\t"+wt);
}
void process(Stud s[],int n)
{
for(int i=0;i<n-1;i++)
 for(int j=i+1;j<n;j++)
  if(s[i].wt>s[j].wt)
{
  Stud c=s[i];
  s[i]=s[j];
 s[j]=c;
}
}
}
class Smain
{
 public static void main(String arg[])throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter n");
int n=Integer.parseInt(br.readLine());
 Stud s[]=new Stud[n];
for(int i=0;i<n;i++)
 s[i]=new Stud();
for(int i=0;i<n;i++)
 s[i].input();
Stud t=new Stud();
t.process(s,n);
for(int i=0;i<n;i++)
 s[i].output();
}
}
