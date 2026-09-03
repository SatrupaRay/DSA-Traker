import java.util.Scanner;

class demo{
    public String largest_odd_no(String num){
        for(int i=num.length()-1;i>=0;i--){
            for(int j=0; j<num.length();j++){
            //  if(Character.getNumericValue(num.charAt(i))%2==1){
            if ((num.charAt(i) - '0') % 2 == 1) {
                if(num.charAt(j) == '0'){
                    continue;
                }
                return num.substring(j,i+1);
            }
        }
        }
        return "";
    }
    }
class large_odd_NO{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("give a number - "+num);
        String num=sc.next();
        
       System.out.println("the no. is - "+num);

       demo d=new demo();
       System.out.println(d.largest_odd_no(num));

    }
}
