package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        /*배열을 도입해 보자.*/
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name +" 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
        /*다른 방법 너무 긴 코드를 짧게 받아오자*/
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name +" 나이:" + s.age + " 성적:" + s.grade);
        }
        /*향상된 for문 적용*/
        for (Student s : students) {
            System.out.println("이름:" + s.name +" 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
