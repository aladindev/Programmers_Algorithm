/**
 *  Enum 열거형
 *
 *  interface Scale{
 *      int a = 0
 *  }
 *  interface Scale2{
 *      int a = 0
 *  }
 *
 *  method(int a) {
 *  이 메소드는 Scale1 에 대한 값만 받는것이 목적인데
 *  매개변수는 int형 이므로 Scale2의 밸류가 와도 컴파일, 런타임 에러가 발생하지 않는다.
 *  따라서 열거형을 사용해서 코드의 안정성을 높히는 것이 목적
 *
 *  }
 *
 *  자바 5 이전!
 *  인터페이스 내에 선언된 변수는 public, static, final이 선언된 것으로
 *  컴파일러가 간주한다. (선언을 하지 않아도)
 *
 *  자료형의 부여를 돕는 열거형
 *  enum Scale {
 *      DO, RE, MI, FA, SO, RA, TI >> 열거형 값(Enumerated Values)
 *  }
 *
 *  상수라고 볼 수도 있지만 정확히는 상수는 아니다.
 *  열거형 밸류는 프로그래머가 정의해서 쓰기 나름 !!!!!!!!!!!!
 *  열거형 값의 반환값은 true/false 용으로 쓰기 나름
 *  코드 레벨에서 개발자가 정의해서 쓰기 나름이다.
 *
 *  우리가 어떻게 쓰느냐에 따라 열거형값의 의미가 결정된다.
 *
 *  ex
 *  public static void main(String[] args) {
 *
 *      Scale sc = Scale.DO;
 *      Scale2 sc2 = Scale2.DO;
 *
 *      method(Scale sc) {
 *          매개변수가 열거형 Scale 자료형을 받고 있으므로
 *          함수의 목적과 자료형을 확실히 결정지을 수 있다.
 *          매개변수로 sc2가 전달된다면 컴파일 에러 발생
 *          ==> 코드의 안정성 향상
 *      }
 *  }
 *
 *  열거형은 클래스내에도 정의 가능(클래스 내에서만 사용하겠다.)
 *
 *
 *  열거형 값은 인스턴스이다.
 *  => 모든 열거형은 java.lang.Enum<E> 클래스를 상속한다.
 *  그리고 Enum<E>는 당연하게도 Object 클래스를 상속한다.
 *  이런 측면에서 볼 때 열거형은 클래스이다.(넓은 범위로 클래스로 볼 수 있다.)
 *  enum Person {
 *      MAN, WOMAN;
 *
 *      @Override
 *      public String toString() { return "TEST" }
 *  }
 *
 *  매개변수의 가변 인자 선언과 호출
 *  class Varargs {
 *      // 매개변수가 몇 개 이건 다 받겠다. 1개 이상!
 *      public static void showAll(String ...vargs) {
 *
 *      }
 *      매개변수의 갯수에 따른 배열이 생성된다.
 *      showAll("1");
 *      showAll("1", "2");
 *      showAll("1", "2", "3");
 *
 *      컴파일러 관점
 *      showAll(new String[]{"1"});
 *      showAll(new String[]{"1", "2"});
 *      showAll(new String[]{"1", "2", "3"});
 *  }
 * */