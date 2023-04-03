//Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" 
//that inherits from Person and has an additional attribute called "grade" and a method called "study". 
//Create an object of the Student class and call both the "speak" and "study" methods. using construtors
class Person
{
    String name;
	int age;
	Person(String name,int age)
	{
	    this.name=name;
		this.age=age;
	}
	void speak()
	{
	    System.out.println("This is person class method speak");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
	}
}
class Student1 extends Person
{
    String grade;
	Student1(String name, int age,String grade)
	{
	    super(name, age);
	    this.grade=grade;
	}
	void study()
	{
	    System.out.println("This is student method study");
		System.out.println("Grade:"+grade);
	}
	
}
class UseStudent1
{
    public static void main(String args[])
	{
	    Student1 s=new Student1("Laxmi",21,"B");
		s.speak();
		s.study();
	}
	
}
	