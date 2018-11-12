package Krushkal_MST;

import java.util.*;
/**
 * MST algorithm also used input in class. 
 * Loading input: Please find in edges class(6 nodes and 12 edges) 
 * @author Le Thu Huong
 *
 */

public class Main{
	
	public static void main(String args[]){
		
	    Scanner scan = new Scanner(System.in);
	    Krushkal sameP = new Krushkal();     
	    
	    //initialise each node is the father of itself (implement the disjoint sets)
		for(int i=0; i<10; i++){
		    sameP.fathers[i]=i;
		}
	
		int node,edge;
		int a,b,w;
		ArrayList<Edges> edges = new ArrayList<Edges>();
		
		
		node = scan.nextInt();
		edge = scan.nextInt();
		for(int i=0;i<edge;i++){
		    a = scan.nextInt();
		    b = scan.nextInt();
		    w = scan.nextInt();
		    edges.add(new Edges(w,a,b));
		}
		
		System.out.println("----------------------------------");
		
		
		
		
		//Algorithm starts
		
		//STEP1 : Initialise the MST = 0 
		int mst_weight = 0;
		int mst_edges = 0;
		int mst_index = 0;
		
		
		//  STEP 2: Sort the list of edges in ascending order, implement class Comparator
		 Collections.sort(edges, new Comparator<Edges>() {
		        @Override 
		        public int compare(Edges p1, Edges p2) {
		            return p1.w - p2.w;
		        }
		 });
		 
		 
		 
		 
		//  STEP 3&4: start adding an edge(with smallest cost and not form a cycle)
		/**
		 * Program compare 2 nodes of an edge, is they are different(not form a cycle) then add its weight to the MST
		 * Keep increment all edges until we find a tree
		 * Keep increment all index until we have no more edge to process
		 */

		while( ( mst_edges < node-1) || (mst_index < edge) ){
		    a = edges.get(mst_index).a;
		    b = edges.get(mst_index).b;
		    w = edges.get(mst_index).w;
	
		    if( sameP.find(a) != sameP.find(b) ) {
		    	sameP.union(a,b);
		        mst_weight += w;
		        System.out.println("Start:"+a + "  End:" + b + "  Weight:" + w);
		        mst_edges++;
		    }
		    mst_index++;
		}
		
		System.out.println( "\nWeight of the MST tree have "+ mst_edges + " edges is " + mst_weight);
	}
 
}