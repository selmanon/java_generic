import java.util.Arrays;
import java.util.List;
/**
 * The UpperBoundedWildcards class implements an application that
 * show Upper Bounded Wildcards example
 */
public class UpperBoundedWildcards {

	/**	
    *	1. Upper bounded wildcard : relax the restrictions on a variable.	
	*   2. To declare an upper-bounded wildcard, use the wildcard character ('?'), followed by the extends keyword, followed by its upper bound.   
	**/
	public static double sumOfList(List<? extends Number> list) {
    double s = 0.0;
    for (Number n : list)
        s += n.doubleValue();
    return s;
	}
	
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));
		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(ld));
    }
}