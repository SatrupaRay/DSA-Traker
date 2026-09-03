//longest common prefix

import java.util.Arrays;

class prefix{
public String longest_common_prefix(String[] words){
    Arrays.sort(words);
    String first=words[0];
    String last=words[words.length-1];
    int i=0;
    while (i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)) {
        i++;
        
    }
    return first.substring(0,i));
    }

    
}
class Demo{
    public static void main(){
        
    }
}