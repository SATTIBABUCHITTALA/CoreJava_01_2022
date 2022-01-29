 class StudentDetails{

//intialization int std;

int stdId;
String name; //instance variables
static String collegeName ="GVP"; 
static String principalName ="Aparna Rao"; //static varaiable

void getDetails(){

int i=21; //local variables
System.out.println("i value"+ i);
System.out.println("Details of a Student");

}

}

public class Student{

public static void main(String args[]){

StudentDetails std=new StudentDetails(); //
std.stdId=101;
std.name="Satti Babu";

System.out.println("First Student");
System.out.println(std.stdId);
System.out.println(std.name);
System.out.println(StudentDetails.collegeName);
System.out.println(StudentDetails.principalName);

StudentDetails std2=new StudentDetails();
std2.stdId=102;
std2.name="Ramesh";

System.out.println("Second Student");
System.out.println(std2.stdId);
System.out.println(std2.name);
System.out.println(std2.collegeName);
System.out.println(StudentDetails.principalName);

StudentDetails std3=new StudentDetails();
std3.stdId=103;
std3.name="Ravi";

System.out.println("Third Student");
System.out.println(std3.stdId);
System.out.println(std3.name);
System.out.println(std3.collegeName);
System.out.println(StudentDetails.principalName);








}

}