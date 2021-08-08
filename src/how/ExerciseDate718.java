package how;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciseDate718 {
public static void main(String[] args) {
	
	//System.out.println(isTrue(new int[] {1,2,3,3,45,5,3,2,1,12}));
	System.out.println(isAnagram("elbov","below"));
	System.out.println(isAnagram2("Ali","ilA"));
	System.out.println(isAnagram3("Elbow","bElow"));
	System.out.println(Arrays.toString(sortWithoutSort(new int[] {1,2,3,4,5,645,3,2,3,565,0})));
	Integer arr[]={1,2,3,4,5,56,4,3,2,2,22,2,3,3,43,11};
	List<Integer> list=new ArrayList<>();
	Collections.addAll(list, arr);
	System.out.println(list(list));
	
	String str[]= {"Ali","Veli","veli","Veli","Veli"};
	List<String> list3=new ArrayList<>();
	Collections.addAll(list3, str);
	remover(list3,"Veli");
	
}

//16. Write a method that takes two parameters: an ArrayList of Strings called wordList, 
//and a String called targetWord. Method removes the targetWord from ArrayList.EX :ArrayList("hi","hey","hi","yo"));
//----> removeAll(wordList,"hi"); --->["hey","yo"].

public static void remover(List<String> arr1,String arr2) {
	List<String> list=new ArrayList<>();
	for(String w: arr1) {
		if(!w.equals(arr2))
			list.add(w);
	}
	System.out.println(list);
}

//Interview question: Write a method that checks to see if the words u pass is Anagram. EX: read and dear  --> true

public static int[] maxes(int arr[]) {
	int max=arr[0];
	int secondMax=arr[0];
	for(int i:arr) {
		if(i>max) {
			max=i;
		}
		if(i>secondMax&&i!=max) {
			secondMax=i;
		}
	}
	
	return new int[] {max,secondMax};
	
}

//14. Write a method that accepts an Array and returns the number/s that are not repeated 
//in an ArrayList. Method returns the numbers in aN ArrayList. EX: arr = {1,1,2,2,3,3,4,5}  ---> [4,5]

public static List<Integer> list(List<Integer> arr){
	List<Integer> list2=new ArrayList<>();
	
for(int i=0;i<arr.size();i++) {
	int count=0;
	for(int j=0;j<arr.size();j++) {
		if(arr.get(i)==arr.get(j)) {
			count++;
		}
	}
	if(count==1) {
		list2.add(arr.get(i));
	}
}

	return list2;
	
}


public static int[] sortWithoutSort(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		int temp=0;
		for(int j=i;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
	
	}
	
	System.out.println(Arrays.toString(arr));
	return arr;
}

public static int[] xxx(Integer arr[]) {
	int maxSecondMax[]=new int[2];
	List<Integer> list=new ArrayList<>();
	Collections.addAll(list, arr);
	Collections.sort(list);
	maxSecondMax[0] =list.get(arr.length-1);
	for(int i=(list.size()-1);i>=0;i--) {
		if(list.get(i)!=maxSecondMax[0]) {
			maxSecondMax[1]=list.get(i);
			break;
		}
	}
	return maxSecondMax;
	
}

public static boolean isAnagram3(String str1,String str2) {
	char[] arr1=str1.toCharArray();
	char[] arr2=str2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	return Arrays.equals(arr1, arr2);

}


public static boolean isAnagram2(String str1,String str2) {
	if(str1.length()!=str2.length()) return false;
	
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)!=str2.charAt(str2.length()-1-i)) {
			return false;
		}
		
	}
	return true;
	
}


public static boolean isAnagram( String str1, String str2) {
	return new StringBuilder(str1).reverse().equals(str2);
}



public static boolean isTrue(int arr[]) {
	int sum=0;
	for(int i: arr) {
		if(i==3) {
			sum+=i;
		}
	}
	if(sum==9) {
		return true;
	}else {
		return false;
	}
	
}

public static boolean isTrue1(int arr[]) {
	int count=0;
	for(int a:arr) {
		if(a==3) {
			count++;
		}
	}
	
return count==3;
}
	
}
