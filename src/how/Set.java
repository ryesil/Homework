package how;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Set {
public static void main(String[] args) {

int arr[][]= {{14,1,0,32,12},{3,-3,5,7,8,1,0}};
System.out.println(spiral(arr));	
}	
public static TreeSet<Integer> spiral(int[][] arr){
	TreeSet<Integer> set=new TreeSet<>();
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			set.add(arr[i][j]);
		}
	}
	return set;
}
public static String spiral1(int[][] arr) {
	String str="";
	List<Integer> list=new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			list.add(arr[i][j]);
		}
	}
	Collections.sort(list);
	
	for(int i=0;i<list.size();i++) {
		str+=list.get(i)+" ";
	}
	return str.trim();
}
public static String spiral3(int[][] arr) {
	
	List<Integer> list=new ArrayList<>();	
	list.stream().sorted();
	
	
	return "";
}
}

