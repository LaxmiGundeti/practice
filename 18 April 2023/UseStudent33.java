//Write a program to print the names of students by creating a Student class. If no name is passed while creating an object of
//Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.

class Student 
{
   String name;
   Student()
   {
        this.name = "unknown";
		System.out.println(name);
   }
   Student(String name)
   {
        this.name =name;
		System.out.println(name);
   }
   
}
class UseStudent33
{
   public static void main(String args[])
   {
        Student s1 = new Student();
		Student s2 = new Student("Laxmi");
		
   }
}
