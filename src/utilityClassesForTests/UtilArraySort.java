package utilityClassesForTests;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TODO - principais m�todos
 * 
 * Collections.sort( list ); //ascending order. Exemple List<Integer> list
 * 
 * Arrays.sort( vector );    //ascending order. Exemple int[] vector
 * 
 */
public class UtilArraySort {

	
	/**
	 * Receives a generic list (integer, String, etc) unsorted 
	 * and returns sorted in ascending or descending order.
	 * 
	 * @param orderType - 1 = ascending order or 2 = descending order
	 * @param list - disordered list
	 * 
	 * @return list - ordered list.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List sortList( int orderType, List list ) {
		
		Collections.sort( list );       //ascending order
		
		if( orderType == 2 ) 	  
			Collections.reverse(list);  //descending order  - ordenar primeiro, depois reverter
	
		return list;
	}

	/**
	 * Receives a Object array unsorted 
	 * and returns sorted in ascending or descending order.
	 * 
	 * @param orderType - 1 = ascending order or 2 = descending order
	 * @param array - disordered array
	 * 
	 * @return array - ordered array.
	 */
	public Object[] sortArray( int orderType, Object[] vector ) {
		
		if( orderType == 1 ) 	      //ascending order
			Arrays.sort( vector ); 

		else if( orderType == 2 ) 	  //descending order
			Arrays.sort( vector , Collections.reverseOrder() );
		
		return vector;
	}
	
	/**
	 * Return true if the array contais int k or false if not.
	 * 
	 * @param int[] ints
	 * @param int k 
	 * @return boolean b - true if contais or false if not
	 */
	public boolean arrayContains( int[] ints, int k ) {
		
		boolean b = false;
		
		Arrays.sort( ints );
		int index = Arrays.binarySearch(ints, k);
		if( index > -1 )
			b = true;
		
		return b;
	}
		
	
}
