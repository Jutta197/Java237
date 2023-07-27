package two2_725.pra1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Alice", 15, 60));
        student.add(new Student("Takuya", 12, 90));
        student.add(new Student("Ryo", 25, 34));
        student.add(new Student("Suzanu", 18, 20));

        // 1: 生徒の点数が60点未満を抽出
        // 2: 生徒の点数を大⇒小に並び替える
        List<Student> below60 = new ArrayList<>();
        for (Student s : student) {
            if (s.getScore() < 60) {
                below60.add(s);
            }
        }
        
        student.sort(Comparator.comparingInt(Student::getScore).reversed());
        for (Student s : below60) {
            System.out.println(s);
        }
    }
}
