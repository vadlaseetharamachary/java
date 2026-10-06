class students implements Runnable{
private String name;
 public students(String name){
  this.name=name;
 }
public void run(){
 for(int i=1;i<=10;i++){
  System.out.println(name+"writing page"+i);
 }
 System.out.println(name+"completed writing");
 }
class ThrdEx{
 public static void main(String args[]){
  students r1=new students("r1");
  Thread t = new Thread(r1);
  t.start();
  }
 }
}