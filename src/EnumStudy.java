/**
 *  Enum 열거형
 *
 *  interface Scale{
 *      int a = 0
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
 *
 *      switch(sc) {
 *
 *      }
 *
 *
 *  }
 * */