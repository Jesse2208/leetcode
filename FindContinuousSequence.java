import java.util.ArrayList;
public class FindContinuousSequence {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
	       ArrayList<ArrayList<Integer>> array=new ArrayList<ArrayList<Integer>>();
		   int n=(int)Math.floor(Math.sqrt(2*sum));
		   int count=0;
	       for(int i=n;i>=2;i--){
	    	   if(i%2==1){
	    		   if(sum%i==0){
	    			   count=sum/i;
	    			   ArrayList<Integer> tmp=new ArrayList<Integer>();
	    			   for(int j=0;j<i;j++)
	    				   tmp.add(count-i/2+j);
	    			   array.add(tmp);
	    		   }else continue;   
	    	   }else{
	    		   if(sum%i==(i/2)){
	    			   count=sum/i;
	    		   	   ArrayList<Integer> tmp=new ArrayList<Integer>();
	    		   	   for(int j=0;j<i;j++)
	    				   tmp.add(count-i/2+j+1);
	    		   	   array.add(tmp);
	    		   	}
	    	   }
	       }
	       return array;
    }
	public static void main(String[]args){
		FindContinuousSequence f=new FindContinuousSequence();
		 ArrayList<ArrayList<Integer>> a=f.FindContinuousSequence(100);
			 System.out.println(a);
	}
}
