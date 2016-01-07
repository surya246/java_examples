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
                  s=h;

           } 
          public void Area()
           {
                double r=0;
                r=(p*q*s)/2;
                System.out.println("Area of triangle= "+r);
           }  
           public void Perimeter()
           {
                double r=0;
                r=p+q+r;
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
          public void Area()
           {
               double r;
                r=(p*q);
                System.out.println("Area of Rectangle= "+r);
           }  
           public void Perimeter()
           {
               double r;
                r=2*(p+q);
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
          public void Area()
           {
               double r;
                r=(p*p);
                System.out.println("Area of Square= "+r);
           }  
           public void Perimeter()
           {
               double r;
                r=4*p;
                System.out.println("Perimeter of Square= "+r);
           } 
       
         public static void main(String[] arg)
                   {
                        Triangle T1=new Triangle(1,2,3);
                        T1.Area();
                        T1.Perimeter();
                        Rectangle R1=new Rectangle(1,2);
                        R1.Area();
                        R1.Perimeter();
                        Square S1=new Square(2);
                        S1.Area();
                        S1.Perimeter();
                   }
}

                          
