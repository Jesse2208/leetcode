import java.util.Arrays;
//回溯法
public class HasPath {
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
		int[][]flag=new int[rows][cols];
		int index=0;
		for(int i=0;i<rows;i++)
			Arrays.fill(flag[i],0);
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++){
				if(tell(matrix,flag,str,i,j,rows,cols,index))
					return true;
				else for(int k=0;k<rows;k++)
						Arrays.fill(flag[k],0);
			}
		return false;
			
    }
	//起点为矩阵中某一个节点，如果和字符串第一个字符相等，则接着判断其相邻四个节点是否和字符串接下来的字符相等	
	public boolean tell(char[] matrix,int[][]flag,char[] str,int i,int j,int rows, int cols,int index){
		if(i>=0&&j>=0&&i<rows&&j<cols&&flag[i][j]==0){
			if(matrix[i*cols+j]==str[index]){
				if(index==str.length-1)
					return true;
				else{
					flag[i][j]=1;
					return 	tell(matrix,flag,str,i-1,j,rows,cols,index+1)||tell(matrix,flag,str,i+1,j,rows,cols,index+1)||tell(matrix,flag,str,i,j+1,rows,cols,index+1)||tell(matrix,flag,str,i,j-1,rows,cols,index+1);
				}
			}
			else return false;
		}
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasPath h=new HasPath();
		char[]matrix={'a','b','c','e','s','f','c','s','a','d','e','e'};
		int rows=3,cols=4;
		char[]str={'b','c','c','e','d'};
		char[]str2={'a','b','c','b'};
		System.out.println(h.hasPath(matrix, rows, cols, str2));
	}

}
