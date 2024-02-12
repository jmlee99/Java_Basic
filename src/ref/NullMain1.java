package ref;

public class NullMain1 {
  public static void main(String[] args){
    /*주소지가 결정될 때 까지는 주소지를 비워두어야 할 수 있다.
    * 참조형 변수에는 항상 객체가 있는 위치를 가리키는 참조값이 들어간다.
    * 그런데 아직 가리키는 대상이 없거나, 가리키는 대상을 나중에 입력하고 싶다면 어떻게 해야할까?
    * 참조형 변수에서 아직 가리키는 대상이 없다면 null이라는 특별한 값을 넣어둘 수 있다.
    * null은 값이 존재하지 않는, 없다는 뜻이다.
    * 코드를 통해서 null값에 대해 알아보자.
    */
    Data data = null;
    System.out.println("1. data = " + data);
    data = new Data();
    System.out.println("2. data = " + data);
    data = null;
  }
}
