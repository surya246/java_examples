abstract class Shapes
 {
    int p,q,r,s;
 }
    class Triangle extends Shapes
      {
         public Triangle()
           {
            
           }
         public Triangle(int l,int b,int h)
           {
                  p=l;
                  q=b;
                  r=h;

           } 
          public void Area(int l,int b,int h)
           {
                double r;
                r=(l*b*h)/2;
                System.out.println("Area of triangle= "+r);
           }  
           public void Perimeter(int l,int b,int h)
           {
                double r;
                r=l+b+h;
                System.out.println("Perimeter of triangle= "+r);
           } 
     } 
       
      class Rectangle extends Shapes
      {
         public Rectangle()
           {
            
           }
         public Rectangle(int l,int b)
           {
                  p=l;
                  q=b;
           } 
          public void Area(int l,int b)
           {
               double r;
                r=(l*b);
                System.out.println("Area of Rectangle= "+r);
           }  
           public void Perimeter(int l,int b)
           {
               double r;
                r=2*(l+b);
                System.out.println("Perimeter of Rectangle= "+r);
           } 

       }
       class Square extends Shapes
      {
         public Square()
           {
            
           }
         public Square(int l)
           {
                  p=l;
           } 
          public void Area(int l)
           {
               double r;
                r=(l*l);
                System.out.println("Area of Square= "+r);
           }  
           public void Perimeter(int l)
           {
               double r;
                r=4*l;
                System.out.println("Perimeter of Square= "+r);
           } 
       
         public static void main(String[] arg)
                   {
                        Triangle T1=new Triangle(1,2,3);
                        T1.Area(1,2,3);
                        T1.Perimeter(1,2,3);
                        Rectangle R1=new Rectangle(1,2);
                        R1.Area(1,2);
                        R1.Perimeter(1,2);
                        Square S1=new Square(2);
                        S1.Area(2);
                        S1.Perimeter(2);
                   }
}

                          
