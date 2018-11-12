package Krushkal_MST;

/**
 * This class contains disjoint set data structure
 * Follow instruction of : https://www.geeksforgeeks.org/union-find/
 * @author Le Thu Huong
 *
 */

public class Krushkal {
	int fathers[] = new int[10];
	
	/**
	 * Find method: Determine which subset x is in
	 * Initialise that all node is the father of its self 
	 * @param x : a node
	 * @return  : subsets that x belongs to
	 */
	public int find(int x){    		
	    if(fathers[x] == x){
	        return x;
	    }
	    return find(fathers[x]);    
	}
	
	
 
	/**
	 * Union method: join two subsets into one single subset
	 * @param x : x is found in subset x
	 * @param y : y is found in subset y
	 * Since x, y are different -> take union of them, to be represented as y 
	 */
	
	
	public void union(int x, int y){	
	    int fx = find(x);				
	    int fy = find(y);
	    fathers[fx] = fy;
	}

}
