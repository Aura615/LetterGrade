//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class letterGrade {
    public static char LetterGrade(int score) {
        char grade;
        if (score <0 || score > 100)
            grade = 'X';
        else if (score>=90 && score <=100)
            grade = 'A';
        else if (score>=80 && score <90)
            grade = 'B';
        else if (score>=70 && score <80)
            grade = 'C';
        else if (score>=60 && score <70)
            grade = 'D';
        else
            grade ='F';
        return grade;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}