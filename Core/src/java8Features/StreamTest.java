package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//a simple program to demonstrate the use of stream in java 
import java.util.*; 
import java.util.stream.*; 

class StreamTest 
{ 
public static void main(String args[]) 
{ 

	// create a list of integers 
	List<Integer> number = Arrays.asList(2,3,4,5); 

	// demonstration of map method 
	List<Integer> square = number.stream().map(x -> x*x). 
						collect(Collectors.toList()); 
	System.out.println("map method call " + square); 

	// create a list of String 
	List<String> names = 
				Arrays.asList("Reflection","Collection","Stream"); 

	// demonstration of filter method 
	List<String> result = names.stream().filter(s->s.startsWith("S")). 
						collect(Collectors.toList()); 
	System.out.println("filter method call " +result); 

	// demonstration of sorted method 
	List<String> show = 
			names.stream().sorted().collect(Collectors.toList()); 
	System.out.println("sorted method call " +show); 

	// create a list of integers 
	List<Integer> numbers = Arrays.asList(2,3,4,5,2); 

	// collect method returns a set 
	Set<Integer> squareSet = 
		numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
	System.out.println("collect method call " +squareSet); 

	// demonstration of forEach method 
	number.stream().map(x->x*x).forEach(y->System.out.println("forEach loop method call " +y)); 

	// demonstration of reduce method 
	int even = 
	number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 

	System.out.println("reduce method call " +even); 
} 
} 

