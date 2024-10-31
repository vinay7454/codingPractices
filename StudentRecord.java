public class StudentRecord {
    private String name;
    private String subject;
    private int score;

    public StudentRecord(String name, String subject, int score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
