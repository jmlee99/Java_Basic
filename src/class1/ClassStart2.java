package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 17};
        int[] studentGrades = {90, 80, 70};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + " 나이 :" + studentAges[i] + " 성적:" + studentGrades[i]);
        }
        /*이렇게 배열로 묶어도 3개의 배열에 나누어져 있기 때문에 3개의 배열을 각각 변경해야 한다.
        * 그리고 한 학생의 데이터를 관리하기 위해 3개의 배열의 이덱스 순서를 항상 정확하게 맞추어야 한다.
        * 이렇게 하면 특정 학생의 데이터를 변결할 때 실수할 가능성이 매우 높다.
        * 이 코드는 컴퓨터가 볼 때는 아무 문제가 없지만, 사람이 관리하기에는 좋은 코드가 아니다.
        *
        * 여기서 class의 개념을 도입해서 쉽게 만든다.
        * */
    }
}
