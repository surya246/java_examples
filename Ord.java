import java.io.*;
import java.util.*;

class Coordinates
{
   int x;
   int y;
   public Coordinates(int x,int y)
   {
   this.x=x;
   this.y=y;
   }
}
class Triangle
   {
     
    public static void main(String[] arg)
        {
               Scanner s=new Scanner(System.in);
               Coordinates c;
               int x,y;  
	       int n=3;    
               Integer key;
               Map<Integer,Coordinates> map=new HashMap<Integer,Coordinates>();
            
         for(int i=1;i<=n;i++)
           {
           System.out.println("Enter"+i+"Coordinate value");
           System.out.println("Enter x Coordinate value");
           x=s.nextInt();
           System.out.println("Enter y Coordinate value");
           y=s.nextInt();
           c=new Coordinates(x,y);
           key=i;
           map.put(key,c);           
           }
  
          for(int i=1;i<=map.size();i++)
           {
             c=(Coordinates)map.get(i);
             System.out.println(i+"coordinate "+c.x+" "+c.y);

           }
 
       }
  }
