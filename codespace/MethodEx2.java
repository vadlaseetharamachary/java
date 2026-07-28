class MethodEx2{
public int display(){

    int sum=0;
    int count=0;
   for(int i=1;i<=1000;i++){
if (count!=5){
if(i%3==0 && i%5==0){
System.out.println(i);
sum = sum+i;
count=count+1;
}
}
   }
return(sum);
}
public static void main(String args[]){
	MethodEx2 akshay=new MethodEx2();
	int sum=akshay.display();
	System.out.println("sum is:"+sum);
}
}