public class StringTesting {
    public static void main(String[] args){
        String sanitizedType = "\"Opportunity\"";
        if (sanitizedType.startsWith("\"") && sanitizedType.endsWith("\"")) {
            sanitizedType = sanitizedType.substring(1, sanitizedType.length() - 1);
        }

        System.out.println(sanitizedType);


    }
}
