//Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" 
//that inherits from Person and has an additional attribute called "grade" and a method called "study". 
//Create an object of the Student class and call both the "speak" and "study" methods.
class Person
{
    String name="Laxmi";
	int age= 21;
	void speak()
	{
	    System.out.println("Name of person:"+name);
		System.out.println("age of person:"+age);
		
	}
}
class Student extends Person
{
    String grade="B";
	void study()
	{
	    System.out.println("Grade of student:"+grade);
	}
}
class Usestudent
{
    public static void main(String args[])
	{
	   Student s1=new Student();
	   s1.speak();
	   s1.study();
	}
}
	