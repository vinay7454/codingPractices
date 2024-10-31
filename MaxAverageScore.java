import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxAverageScore {
    public static void main(String[] args) {
        // Input: List of students with their scores
        List<StudentRecord> records = Arrays.asList(
                new StudentRecord("Alice", "Math", 85),
                new StudentRecord("Alice", "English", 90),
                new StudentRecord("Bob", "Math", 75),
                new StudentRecord("Bob", "English", 80),
                new StudentRecord("Charlie", "Math", 92)
        );

        // Call the method to get the student with the max average score
        String topStudent = getMaxAverageStudent(records);
        System.out.println("Student with the highest average score: " + topStudent);
    }

    private static String getMaxAverageStudent(List<StudentRecord> records) {
        Map<String, int[]> studentScores = new HashMap<>();
        for(StudentRecord studentRecord : records){
            String name = studentRecord.getName();
            int score = studentRecord.getScore();

            studentScores.putIfAbsent(name, new int[2]);
            studentScores.get(name)[0] += score;
            studentScores.get(name)[1]++;
        }

        String topStudent = "";
        double maxAverage = -1;

        for(Map.Entry<String, int[]> entry : studentScores.entrySet()){
            String name = entry.getKey();
            int[] scoreData = entry.getValue();
            double average = (double) scoreData[0] / scoreData[1];

            if (average > maxAverage) {
                maxAverage = average;
                topStudent = name;
            }
        }

        return topStudent;
    }
}
