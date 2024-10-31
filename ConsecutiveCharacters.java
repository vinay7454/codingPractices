public class ConsecutiveCharacters {
    public static void main(String[] args){
        System.out.println(maxPower("leetcode"));
    }


    public  static int maxPower(String s) {
            if(s == null || s.isEmpty()) return 0;
            int count = 1;
            int maxCount = 1;
            char ch = s.charAt(0);
            for(int i = 1; i < s.length(); i++){
                if(ch == s.charAt(i)){
                    count++;
                } else {
                    ch = s.charAt(i);
                    count = 1;
                }
                if(count > maxCount){
                    maxCount = count;
                }
            }
            return maxCount;
        }

}
