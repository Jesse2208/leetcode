public class FindGreatestSumOfSubArray {
		public int FindGreatestSumOfSubArray(int[] array) {
		        int max=array[0],count=0;
		        count=Math.max(0, count+array[0]);
		        for(int i=1;i<array.length;i++){
		        	max=Math.max(count+array[i], max);
		        	count=Math.max(0, count+array[i]);
		        }
		        return max;
		    }
		public static void main(String []args){
			FindGreatestSumOfSubArray s=new FindGreatestSumOfSubArray();
				int[]array={6,-3,-2,7,-15,1,2,2};
				System.out.println(s.FindGreatestSumOfSubArray(array));
			}	
}
