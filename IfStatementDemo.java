public class IfStatementDemo{

public static void main(String args[]){

int x=0;

if ((x%2)==0 && x>0) {
System.out.println("It is an Even Number ");
} else if(x%2==1){

System.out.println("Odd Number ");
}else if(x<0){
System.out.println("Negative Number");

}else {
System.out.println(" Given value is Zero");
}

System.out.println("After If Block");

}


}