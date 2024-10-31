import java.util.HashMap;
import java.util.Map;

public class MaxAvgMarks {

    public static void main(String[] args){
        StundentGrades[] stundentGrades = new StundentGrades[3];
        stundentGrades[0] = new StundentGrades("bobby", 20);
        stundentGrades[1] = new StundentGrades("arun", 30);
        stundentGrades[2] = new StundentGrades("bobby", 60);

        Map<String, int[]> studentGradeMap = new HashMap<>();
        for(StundentGrades studentGrade : stundentGrades){
            String name = studentGrade.getName();
            int grade = studentGrade.getGrade();
            studentGradeMap.putIfAbsent(name, new int[2]);
            studentGradeMap.get(name)[0] += grade;
            studentGradeMap.get(name)[1]++;
        }

        double maxAvg = -1;
        for(Map.Entry<String, int[]> student : studentGradeMap.entrySet()){
            String name = student.getKey();
            int[] grade = student.getValue();
            double avg = grade[0]/grade[1];

            if(avg > maxAvg){
                maxAvg = avg;
            }
        }

        System.out.println(Math.floor(maxAvg));
    }

}
