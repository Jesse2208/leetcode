import java.util.Set;
public class word_break {
	   public boolean wordBreak(String s, Set<String> dict) {
			int len=s.length();
			boolean array[]=new boolean[len+1];
			array[0]=true;
			for(int i=0;i<len;i++)
				for(int j=0;j<=i;j++)
					if(array[j]&&dict.contains(s.substring(j, i+1))){
						array[i+1]=true;
						break;
						}
			return array[len];
	   }
}

