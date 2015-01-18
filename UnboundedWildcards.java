import java.util.Arrays;
import java.util.List;
/**
 * The UnboundedWildcards class implements an application that
 * show the Unbounded Wildcards example
 */
public class UnboundedWildcards {

	/**	
    *	1. The unbounded wildcard type is specified using the wildcard character (?)
	*   2. List<?> : Is a list of unknown type
	*   3. useful approach : 
	*	- If you are writing a method that can be implemented using functionality provided in the Object class.
	*   - When the code is using methods in the generic class that don't depend on the type parameter. 
	*	For example, List.size or List.clear. In fact, Class<?> is so often used because most of the methods in Class<T> do not depend on T.	
	**/
	public static void printList(List<?> list) {
		for (Object elem: list)
			System.out.print(elem + " ");
		System.out.println();
	}
	
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
		List<String>  ls = Arrays.asList("one", "two", "three");
		printList(li);
		printList(ls);
    }
}