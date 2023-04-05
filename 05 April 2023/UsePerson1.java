//Create an interface called ""Person"" with a method called ""speak"". Create two classes called ""Student"" and "Teacher" that implement the 
//Person interface and implement the "speak"method. Create objects of both the Student and Teacher classes and call their respective ""speak"" methods.
interface Person
 {
     public void speak();
 }
 class Student implements Person
 {
    public void speak()
	{
	     System.out.println("This is student speak method");
	}
 }
class Teacher implements Person
{
     public void speak()
	 {
	      System.out.println("This is teacher speak method");
	 }
}
class UsePerson1
{
    public static void main(String args[])
	{
	     Student s1=new Student();
		 s1.speak();
		 Teacher t1=new Teacher();
		 t1.speak();
	}
}
    