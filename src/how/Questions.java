package how;

import java.util.Scanner;

public class Questions {
//Question-4, We can use charAt() to find 2nd,4th, and 6th letters. Here what I have.
public static void main(String[] args) {

//	dayy();
//	
//	dayy();
//	ask();
	dayy();
	

for(int i=10;i<58;i++) {
	System.out.println(i);
}
for(int i=100;i>43;i-=2) {
	System.out.println(i);
}
for(int i=199;i>32;i-=2) {
	System.out.println(i);
}
int sum=0;
for(int i=23;i<58;i++) {
	sum+=i;
}
System.out.println(sum);
	
int product=1;
for(int i=7;i<16;i++) {
	product*=i;
}

StringBuilder file =new StringBuilder("Ramazan").reverse();
System.out.println(file);
System.out.println(product);


for(int i=199;i>0;i--) {
	if(i%5==0) {
		System.out.println(i);
	}
}


}
public static void dayy() {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a day");
	String day=in.next().toLowerCase();
	
	boolean isDay=day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")||day.equals("friday")||day.equals("saturday")||day.equals("sunday");
	boolean isLongEnough=day.length()>=6;
	if(isDay&&isLongEnough) {
		char second=day.charAt(1);
		char fourth=day.charAt(3);
		char sixth=day.charAt(5);
		System.out.println(""+second+fourth+sixth);
	}else {
		System.err.println("You need to enter a day.");
	}
}
public static void ask() {
	Scanner in=new Scanner(System.in);
	System.out.println("Name?");
	String name=in.next();
	System.out.println("LastName?");
	String lastName=in.next();
	System.out.println("SSN?");
	Integer ssn=in.nextInt();
	System.out.printf(name.toUpperCase().charAt(0)+name.substring(1).toLowerCase()+" "+lastName.toUpperCase().charAt(0)+lastName.substring(1).toLowerCase()+ " "+ "*".repeat(5)+ ssn.toString().substring(5));
}


}
