package ExamSystem;

class Question {
    int qno;
    String question, opt1, opt2, opt3, opt4, ans;
    int marks;

    public Question(int qno, String question, String opt1, String opt2,
                    String opt3, String opt4, String ans, int marks) {
        this.qno = qno;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
        this.marks = marks;
    }

    public int ask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nQ" + qno + ": " + question);
        System.out.println("1." + opt1);
        System.out.println("2." + opt2);
        System.out.println("3." + opt3);
        System.out.println("4." + opt4);

        String userAns = sc.nextLine();

        if(userAns.equalsIgnoreCase(ans)) {
            return marks;
        }
        return 0;
    }
}
