package class1;

public class ClassStart1 {
    /*
    * 클래스가 필요한 이유
    *
    * 자바 세상은 클래스와 객체로 이루어져 있다.
    * 그만큼 클래스와 객체라는 개념은 중요하다.
    * 그런데 클래스와 객체는 너무 많은 내용을 포함하고 있어서 한번에 이해하기 쉽지 않다.
    * 여기서는 클래스와 객체라는 개념이 왜 필요한지 부터 시작해서, 클래스가 어떤 방식으로
    * 발전하면서 만들어졌는지 점진적으로 알아보겠다.
    *
    * 먼저 클래스가 왜 필요한지 이해하기 위해 다음 문제를 풀어보자.
    * 지금까지 학습한 내용을 기반으로 문제를 풀어보면 된다.
    * */
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름: " + student1Name + " 나이 :" + student1Age + " 성적: " + student1Grade);
        System.out.println("이름: " + student2Name + " 나이 :" + student2Age + " 성적: " + student2Grade);

        /*학생 2명을 다루어야 하기 때문에 각각 다른 변수를 사용했다.
        * 이 코드의 문제는 학생이 늘어날 때 마다 변수를 추가로 선언해야 하고,
        * 이런 문제를 어떻게 해결할 수 있을까? 앞서 배운 배열을 사용하면 문제를 해결할 수 있다.*/
    }
}
