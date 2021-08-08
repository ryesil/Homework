package how;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class how1 {
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		String name=scanner.next();
//		char chr=scanner.next().charAt(0);
//		int count=0;
//		for(int i=0;i<name.length();i++){
//		if(name.charAt(i)==chr){
//		  count++;
//		}
//		}
//		System.out.println("Number of "+chr+ " = "+count);
//		int numA = 2;
//		int numB = 3;
//		String str1 = "Study";
//		String str2 = "Hard";
////61study-1
//		System.out.println(numA * numB + str1 + (numA - numB));
	
//		Scanner input = new Scanner(System.in);
		
//System.out.println("Enter a number");
//int a=input.nextInt();
//if(a%2==1) {
//	System.out.println("odd");
//}else { 
//	
//	System.out.println("even");
//}

//		System.out.println("Letter?");
//
//		char day = Character.toLowerCase(input.next().charAt(0));
//
//		if (day == 'm') {
//			System.out.println("Monday");
//		} else if (day == 't') {
//			System.out.println("Tuesday\nor\nThursday");
//		} else if (day == 'f') {
//			System.out.println("Friday");
//		} else if (day == 's') {
//			System.out.println("Sunday\nor\nSaturday");
//		}
//
//		if (day == 'm' || day == 't' || day == 'f') {
//			System.out.println("Weekday");
//		} else if (day == 's') {
//			System.out.println("Weekend");
//		}
//
////System.out.println("Enter a number");
////double aa=input.nextDouble();
////System.out.println("Enter another number");
////double bb=input.nextDouble();
////if(aa==bb) {
////	System.out.println(aa+" and "+bb+" make up a square");
////} else {System.out.println(aa+" and "+bb+" make up a rectangle");
////}
////
////System.out.println("What is your age?");
////int age=input.nextInt();
////if(age>=18&&age<=65) {
////	System.out.println("work work work!!!");
////} else {
////	System.out.println("don't work");
////}
//
//		System.out.println("Age?");
//		int agee = input.nextInt();
//		System.out.println("gender?");
//		String gender = input.next();
//
//		if (gender.compareToIgnoreCase("male") == 0 && agee > 65) {
//			System.out.println("You are retired");
//		} else {
//			System.out.println("No need to work");
//		}
//		//add the digits of a given number.
		
//		System.out.println("Please enter a 4 digit-integer.");
//		Integer digit4= input.nextInt();
//		String a=digit4.toString();
//		String b=a.substring(0,1);
//		String c=a.substring(3);
//		System.out.println(Integer.parseInt(b)+Integer.parseInt(c));
//		
//	sum(2,3);
//	System.out.println(sum(2,3));
//	System.out.println(sum(-2,-3));
//	System.out.println(sum(2,-3));
//ageCalc(23);
//ageCalc(12);
//ageCalc(67);
//	
//grading(45);
//	
//grading(90);
//leapYear(2000);
//leapYear(2013);

//StringBuilder sb=new StringBuilder("Able was I ere I saw Elba.");
////		System.out.println(sb.capacity());
//int i=1;
////while(i<6) {
////	System.out.println(i);
////i++;
////}
//int j=0;
//while(i<31) {
//	System.out.println(2*j+1);
//	j++;
//	i++;
//}
//
//Scanner in=new Scanner(System.in);
//System.out.println("A number");
//int num=in.nextInt();
//i=1;
//while(i<13) {
//	System.out.println(num*i);
//	i++;
//}
//System.out.println("A number?");
//int x=input.nextInt();
//i=1;
//while (x>0) {
//	i*=x;
//	x--;
//}
//System.out.println(i);

//i=1;
//System.out.println("A number to factor");
//int y=input.nextInt();
//while(i<=y) {
//	if(y%i==0) {
//		System.out.println(i);
//	}
//	i++;
//}

//System.out.println("enter a number to add.");
//Integer z=input.nextInt();
//
//i=0;
//while (i<z) {
//	z+=i;
//	i++;
//}
//System.out.println(z);
//		System.out.println(reverse("Coding is greate."));
		  ars(new int[]{1,2,3,4}, new int[]{5,6});
		summer("ade1r4d3");
		System.out.println(array("John"));
	}
	
	public static int[] ars(int arr[], int arr2[]){
		int arr3[]=new int[arr.length+arr2.length];
		for(int i=0;i<arr.length;i++){
		arr3[i]=arr[i];
		}
		for(int i=arr.length;i<arr.length+arr2.length;i++){
		arr3[i]=arr2[i-arr.length];
		}


		System.out.println(Arrays.toString(arr3));
		return arr3;
		}
	
	
	public static String array(String str){
		String st="";
		for(int i=0;i<str.length();i++){
		if(i==0){
		  st+="["+str.charAt(i)+", ";
		}else if(i==(str.length()-1)){
		st+=str.charAt(i)+"]";
		} else{
		  st+=str.charAt(i)+", ";
		}



		}



		return st;

		  }
	
	   public static int summer(String str){
		   int sum=0;
		   
		   for(int i=0;i<str.length();i++){
		   if(Character.isDigit(str.charAt(i))){
		   sum+=Integer.valueOf(str.charAt(i)+"");
		  System.out.println(str.charAt(i));
		 System.out.println(Integer.valueOf(str.charAt(i)+""));

		   }
		   }
		   System.out.println(sum);
		   return sum;
		      }
	
	
	public static List reverse(String in){
		  List<String> list=new ArrayList<>();

		  for(int i=in.length()-1;i>=0;i--){
			  
		  list.add(""+in.charAt(i));

		  }
		  return list;
		      }
	public static Object sum(int a,int b) {
		if(a>0&&b>0) {
			return a+b;
		} else if(a<0&b<0) {
			return a*b;
		} else {
			String c="signs are different";
			return c;
		}
	}
	
	public static void ageCalc(int age) {
		if(age<13) {
		System.out.println("No work");
		} else if(age>65) {
			System.out.println("retired");
		} else {
			System.out.println("Work");
		}
	}
	public static void grading(int grade) {
		if(grade<50) {
			System.out.println("D");
		}else if(grade<=59) {
			System.out.println("C");
		} else if(grade<=80) {
			System.out.println("B");
		}else if(grade<=100) {
			System.out.println("A");
		}
	}
	
	public static void leapYear(int year) {
		System.out.println(year+" is "+ (year%4==0?" a ":" not a ")+"leap year.");
	}
	
	public static void salary(int salary) {
		System.out.println("I ");
	}
	
}