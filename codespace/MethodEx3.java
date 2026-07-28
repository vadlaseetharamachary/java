class MethodEx3{
  public void mymethod(int m){
   int n;
   m=20;
   n=m;
  }
  public static void main(String args []){
   int n=10;
   MethodEx3 obj=new MethodEx3();
   obj.mymethod(n);
   System.out.println(n);
  }
} 