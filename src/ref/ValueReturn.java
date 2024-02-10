package ref;

public class ValueReturn {
    public static void main(String[] args) {
        /*
        * 변수와 초기화
        * 변수의 종류
        * - 멤버 변수(필드) : 클래스에 선언
        * - 지역 변수 : 메서드에 선언, 메개변수도 지역 변수의 한 종류
        *
        * 변수의 값 초기화
        * 멤버 변수 : 자동 초기화
        * - 인스턴스의 멤버 변수는 인스턴스를 생성하 때 자동으로 초기화된다.
        * - 숫자(int)=0, boolean = false, 참조형 = null(null 값은 참조할 대상이 없다는 뜻으로 사용된다.)
        * - 개발자가 초기값을 직접 지정할 수 있다.
        * 지역 변수 : 수동 초기화
        * - 지역변수는 항상 직접 초기화해야 한다.
        * */
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // 자동으로 초기화
        System.out.println("value2 = " + data.value2); // 클래스안에서 미리 초기화

    }
}
