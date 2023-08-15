/***
 *  일반 클래스 -> 익명 클래스 -> 람다
 *     클래스 정의 생략     ->   메소드의 구현물 정의가 필요(인스턴스 생성 후 그 안에 메소드를 담는 방법뿐)
 *
 *  class Lambda {
 *      public static void main(String[] args) {
 *          Printable prn = new Printable() { // 익명 클래스
 *              @Override
 *              public void print(String s) {
 *                  System.out.println(s);
 *              }
 *          };
 *
 *          prn.print("lambda");
 *      }
 *  }
 *
 *  Lambda를 적용하기 위한 조건
 *    ! 추상 메소드가 하나인 인터페이스만 람다 적용 가능!!
 *
 *  람다의 이해
 *    1. 생략 가능한 것을 지워보자.
 *  Printable prn = (s) -> { System.out.println(s); };
 *  이 람다식을 보고 이해해야할 것
 *  Printable 인터페이스를 구현한 인스턴스를 전달하는구나.
 *  Printable 인터페이스는 String 타입의 매개변수를 1개 받는구나
 *  Printable 인터페이스는 구현해야 할 추상메소드가 1개만 존재하는구나.
 *
 *  '람다식'의 인자 전달
 *  Printable prn = (s) -> { System.out.println(s); };
 *  뒤의 람다식 자체를 변수라고 가정하면
 *  method((s) -> System.out.println(s)); 이 식도 가능
 * */