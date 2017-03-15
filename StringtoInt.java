import java.util.Arrays;
public class StringtoInt {
	public int StrToInt(String str) {
		if(str==null||str.length()==0)
			return 0;
		int p=1,i=0,out=0;
		if(str.charAt(0)=='+')
			{
				p=1;
				i=1;
			}
		if(str.charAt(0)=='-')
			{
				p=-1;
				i=1;
			}
				
        try{
        	for(int j=str.length()-1,k=1;j>=i;j--,k*=10)
        		out+=Integer.parseInt(str.substring(j, j+1))*k;
        	return out*p;
        }catch(Exception e){
        	return 0;
        }
    }
}
