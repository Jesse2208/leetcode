
public class UglyNumber {
	 public int GetUglyNumber_Solution(int index) {
		 if(index<=7)
	        return index;
		 int re[]=new int[index];
		 re[0]=1;
		 int t2=0,t3=0,t5=0;
		 for(int i=1;i<index;i++){
			 re[i]=Math.min(re[t2]*2, Math.min(re[t3]*3, re[t5]*5));
			 if(re[i]==re[t2]*2) t2++;
			 if(re[i]==re[t3]*3) t3++;
			 if(re[i]==re[t5]*5) t5++;
		 }
		 return re[index-1];
	    }
	 public static void main(String[] args){
		 UglyNumber u=new UglyNumber();
		 System.out.println(u.GetUglyNumber_Solution(17));
	 }
}
