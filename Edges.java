package Krushkal_MST;
/**
 * This is an edge class, to be an edge, it is contains 3 parameters
 * @author Le Thu Huong
 *
 */
public class Edges {
	 
    public int w,a,b;
   /**
    * constructor of an edge
    * @param w : weight of an edge
    * @param a : start from node a
    * @param b : end at node b
    */
    public Edges(int w,int a, int b){
        this.a =a;
        this.b =b;
        this.w =w;
    }
           
}




/*  input:
6 12
1 3 1
2 3 1 
3 4 2 
4 5 1
4 6 1
3 5 3
3 1 1
3 2 1 
4 3 2 
5 4 1
6 4 1
5 3 3
 
/*  output:
1 3 1
2 3 1
4 5 1
4 6 1
3 4 2
 
Weight of the MST is 6
*/