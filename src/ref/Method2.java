package ref;

public class Method2 {
    public static void main(String[] args) {
        /*메서드와 참조형 클래스 활용 코드 리뷰
          메서드 리턴 값 받아오고 주는 부분 다시 공부 필요*/
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);

        // class 선언하는 부분을 효율적으로 바꿔보자.

    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student(); //x001
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    static void printStudent(Student student){
        System.out.println("이름: " + student.name + "나이: " + student.age + "성적: " + student.grade);
    }
}
