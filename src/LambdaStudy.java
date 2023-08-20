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
 *
 *  람다와 함수형 인터페이스(Lambda Functional Interface)
 *  구현해야 할 추상 메소드가 1개인 인터페이스 = 함수형 인터페이스
 *
 *  인스턴스보다 기능 하나가 필요한 상황을 위한 Lambda
 *  (기능 하나-> 메소드 하나)
 *
 *  Collection.sort(Collection c, (o1, o2) -> { return o1 - o2;};
 *  Collection.sort(Collection c, (o1, o2) -> return o1 - o2);
 *
 *
 *  함수형 인터페이스(Functional Interfaces)와 어노테이션
 *
 *  함수형 인터페이스 : 추상 메소드가 딱 하나(구현해야 할 메소드가 딱 하나)만 존재하는 인터페이스
 *  @FunctionalInterface : 함수형 인터페이스의 조건을 갖추었는지에 대한 검사를 컴파일러에게 요청!!
 *  @FunctionalInterface
 *  interface Test { >> 추상 메소드가 하나이므로 함수형 인터페이스 조건에 부합
 *      int c(int a, int b) >> 추상메소드이므로 구현해야함
 *      default method() {..} >> default 메소드 구현 필요없음
 *      static int staticMethod() {...} >> static 메소드 구현 필요 없음
 *  }
 *
 *  람다식과 제네릭
 * @FunctionalInterface
 * interface Cal<T> { // 제네릭 기반의 함수형 인터페이스
 *     T cal(T a, T b);
 * }
 *
 * Cal<Integer> c = (a, b) -> a+b;
 * 인터페이스가 제네릭 기반이라하여 특별히 신경 쓸 부분은 없다.
 * 타입 인자가 전달이 되면(결정이 되면) 추상 메소드의 T는 결정이 되므로!
 *
 * 미리 정의되어 있는 함수형 인터페이스 
 * */