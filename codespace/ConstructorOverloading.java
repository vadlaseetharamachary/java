class ConstructorOverloading{
 
     int id;
	 String name;
	 
	 
	 ConstructorOverloading(){
		 id = 0;
		 name  = "Unknown";
	 }
	ConstructorOverloading(int i,String n){
		id = i;
		name = n;
	}
	   
	   
	void display() {
         System.out.println("ID:" +id);
		 System.out.println("Name:" +name);
		 System.out.println();
	}
	
	public static void main(String[] args){
		
		
		ConstructorOverloading obj1 = new ConstructorOverloading();
		
		ConstructorOverloading obj2 = new ConstructorOverloading( 9, "Bunny");
        obj1.display();
        obj2.display();
	}
}

		
		
		
		
	 
	 
	