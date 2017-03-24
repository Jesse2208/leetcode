public class NumberOf1Between1AndN_Solution {
	//比如输入2208，从最低位开始计算，依次计算8,0,2,2。 每次循环计算0-9,0-99,0-999...
	//中1的个数,且情况分为当前数位是否等于1以及是否等于0
	public int NumberOf1Between1AndN_Solution(int n) {
        int result=0;
        int index=1;
        int q=n/index,r=0;
        int tmp=0;//numbers of 1 between 0 or 0-9 or 0-99...
    	while(q>0){
            r=(n%(index*10))/index;
            if(r>1){
                result+=r*tmp+index;
            }
            else{
                	if(r==1){
                result+=tmp+(n%index)+1;
            	}
            }
            tmp=tmp*10+index;//numbers of 1 between 0 or 0-9 or 0-99...
            index*=10;
            q=n/index;
        }
        return result;
    }
}
