package ExamSystem;

class Exam {
    int examId;
    String name, topic, date;
    Question[] questions;

    public Exam(int examId, String name, String topic,
                String date, Question[] questions) {
        this.examId = examId;
        this.name = name;
        this.topic = topic;
        this.date = date;
        this.questions = questions;
    }

    public void conductExam() {
        int total = 0;

        for(Question q : questions) {
            total += q.ask();
        }

        System.out.println("\nTotal Marks: " + total);

        if(total >= 3) {
            System.out.println("🎉 Congratulations you completed the test!");
        } else {
            System.out.println("😢 Better luck next time!");
        }
    }
}
