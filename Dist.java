class Dim_3
{
  int x,y,z;

  public Dim_3()
    {

    }
  public Dim_3(int a,int b,int c)
    {
       x=a;
       y=b;
       z=c;
    }
  public void Distance(int a,int b,int c)
    {
       double r;
       r=Math.sqrt(a*a+b*b+c*c);
       System.out.println("3d distance= "+r);
    }


}
class Dim_2 extends Dim_3
{
public Dim_2()
  {
   
  }
public Dim_2(int a,int b)
  {
     x=a;
     y=b;
  } 
public void Distance(int a,int b)
    {
       double r;
       r=Math.sqrt(a*a+b*b);
       System.out.println("2d distance= "+r);
    }
public static void main(String[] arg)
    {
 
  Dim_3 Three=new Dim_3(10,20,30);
  System.out.println("x= "+Three.x+"  "+"y= "+Three.y+"  "+"z= "+Three.z);
  Dim_2 Two=new Dim_2(40,50);
  System.out.println("x= "+Two.x+"  "+"y= "+Two.y+"  ");
  Three.Distance(2,2,2);
  Two.Distance(2,2);


    }
}
