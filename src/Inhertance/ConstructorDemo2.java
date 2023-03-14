package Inhertance;

class ConstructorDemo {
	String name;
	int age;
	ConstructorDemo(String name,int age){
		
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}
class ConstructorDemo2 extends ConstructorDemo{
	String addre;
	int mob;
	
	ConstructorDemo2(String name,int age,String Address,int MobN)
	{
		 super(name,age);
		addre=Address;
		mob=MobN;
		}
	public static void main(String[] args) {
		ConstructorDemo2 c=new ConstructorDemo2("afff", 23,"Latur", 897654);
		c.display();
	}
}