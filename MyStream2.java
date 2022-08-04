package com.globalLogic.streams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class MyStream2 {
public static void main(String args[]) {
	ArrayList<Integer>arr=new ArrayList<Integer>();
	arr.add(10);
	arr.add(2);
	arr.add(3);
	arr.add(3);
	arr.add(-78);
	Stream<Integer>ss=arr.stream();
	//ss.forEach(obj->System.out.println(obj));
	//arr.stream().forEach(obj->System.out.println(obj));
	//arr.stream().forEach(obj->System.out.println(obj));
	//arr.stream().filter(e->e>0).forEach(System.out::println);
	List<Integer>positiveNum= arr.stream().filter(e->e>0).collect(Collectors.toList());
	List<Integer> negativeNumber = arr.stream().filter(e -> e < 0).collect(Collectors.toList());
	System.out.println(positiveNum);
	
	System.out.println(negativeNumber);
}
}
