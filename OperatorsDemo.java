public class OperatorsDemo{


public static void main(String args[])


{
	int i=10;
	int j=20;
int k=i+j;
System.out.println("Addition of two Numbers"+k);

if(i<=10 && j<25){
System.out.println("Logical Operator"+ (i+j));
}else {

System.out.println("Logical Operator"+ (i-j));
}

//bitwise operator
int a=2;
int b=3;
int c=a&b;
System.out.println("Bitwise And Operator"+ c);

int d=a|b;
System.out.println("Bitwise Or "+d);



//ternary Operator
 i=10;
j=(i<10) ? 10: 20;
System.out.println("Ternary Operator"+ j);






}



}