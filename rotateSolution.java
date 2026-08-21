class rotate{
    public Boolean rotate_it(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            String rotate=s.substring(i)+goal.substring(0,i);
            if(rotate.equals(goal)){
                return true;
            }

        }
        return false;
        }
    }

    /**
     * rotate
     */
class rotateSolution {
    
        public static void main(String[] args){
            rotate so=new rotate();
            String s= "abcde";
            String goal="cdeab";
            System.out.println("the actual string: " +s);
            
            System.out.println("the rotated string: " +goal);
            System.out.println(so.rotate_it(s, goal));




        }
    }
        

    

    

