public class SortString {
    public static void main(String[] rags){
        String str = "vinay";
        System.out.println(sortString(str));
    }

    private static String sortString(String str) {
        //do this in O(n)
        int[] charCount = new int[26];
        for(int i = 0; i < str.length(); i++){
            charCount[str.charAt(i) - 'a']++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 26; i++){
            while (charCount[i] > 0) {
                stringBuilder.append((char)(i + 'a'));
                charCount[i]--;
            }
        }
        return stringBuilder.toString();
    }
}
