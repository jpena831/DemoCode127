import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*; 

/**
 * @author Joslenne Pena
 * 
 * credit:https://www.geeksforgeeks.org/stream-in-java/
 */
public class stream {
    public static void main(String[] args) {
        
    // create a list of integers 
	// List<Integer> number = Arrays.asList(2,3,4,5); 
    // System.out.println(number);
	// System.out.println("------------------------");
	
	/**
	 * INTERMEDIATE OPERATIONS
	 */
	//demonstration of map method 
	//map method is used to returns a stream consisting of 
	//the results of applying the given function to the elements of this stream.
	// List<Integer> squared = number.stream().map(x -> x*x).collect(Collectors.toList()); 
    // System.out.println(squared); 

	// create a list of String 
	// List<String> names = Arrays.asList("Snape","Hermoine","Voldy", "Hagrid"); 

	// demonstration of filter method 
	// filter method is used to select elements as indicated passed as argument
	// List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList()); 
	// System.out.println(result); 

	// demonstration of sorted method 
	// this methods sorts the stream
	// List<String> show = names.stream().sorted().collect(Collectors.toList()); 
	// System.out.println(show); 

	/**
	 * TERMINAL OPERATIONS
	 */
	// create a list of integers 
	List<Integer> number = Arrays.asList(2,10,4,102,2); 

	// collect method returns a set, returns the result of the intermediate operations performed on the stream
	// Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
	// System.out.println(squareSet); 

	// demonstration of forEach method - used to iterate through every element of the stream
	// number.stream().map(x->x*x).forEach(y->System.out.println(y)); 

	//demonstration of reduce method - reduce the elements of a stream to a single value
	int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 
	System.out.println(even); 


    }
}
