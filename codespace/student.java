class student{
  String name;
  int rollno;
  String branch;
  
  public student(){
     name = "lekhan";
	 rollno = 34;
	 branch = "csm";
	}
 public student(String n,int r,String b){
 name = n;
 rollno = r;
 branch = b;
 }
 public static void main(String args[]){
  student s1 = new student();
  student s2 = new student("ram",23,"cse");
  s1.display();
  s2.display();
 }
 public void display(){
 System.out.println(name);
 System.out.println(rollno);
 System.out.println(branch);
} 
}