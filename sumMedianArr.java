public class sumMedianArr {
    public static void main(String[] args){
        int[] A = new int[]{1,3};
        int[] B = new int[]{2,4};

        int sumArrA = 0;
        for(int i = 0; i < A.length; i++){
            sumArrA += A[i];
        }
        int sumArrB = 0;
        for(int i = 0; i < B.length; i++){
            sumArrB += B[i];
        }
        int avgA = sumArrA/A.length;
        int avgB = sumArrB/B.length;

        double avg = (double) (avgA + avgB) / 2;
        System.out.println(avg);
    }
}
