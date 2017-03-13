import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class MatrixClockwiseOutput {
	 public ArrayList<Integer> printMatrix(int [][] matrix) {
	       int row=matrix.length;
	       int column=matrix[0].length;
	       int sum=row*column,I=0,J=0;
	       ArrayList<Integer> array=new ArrayList<Integer>();
	       while(row>0&&column>0){
	    	   for(int i=I,j=J;j<J+column;j++)
	    		   array.add(matrix[i][j]);
	    	   for(int j=J+column-1,i=I+1;i<I+row;i++)
	    		   array.add(matrix[i][j]);
	    	   for(int i=I+row-1,j=J+column-2;i>I&&j>=J;j--)
	    		   array.add(matrix[i][j]);
	    	   for(int i=I+row-2,j=J;j<J+column-1&&i>I;i--)
	    		   array.add(matrix[i][j]);
	    	   row=row-2;
	    	   column=column-2;
	    	   I++;J++;
	       }
	       return array;
	       
	    }

}