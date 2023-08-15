
/**
 *  NestedClass : 클래스 안에 정의된 클래
 *
 *  class Outer { // 외부 클래스
 *      class Nested {...} // 네스티드 클래스
 *
 *      - static이 붇은 네스티드 클래스(활용할 일 거의 없다)
 *          - static이 붙으면 그냥 클래스 자리만 빌린 것
 *            그 클래스와 아무 관련이 없다.
 *            생성 시 Outer.Nested nest = new Outer.Nested();
 *      - static이 안붙은 네스티드 클래스(이너 클래스 !!!)
 *          - 멤버 이너 클래스
 *              - 인스턴스 변수, 인스턴스 메소드와 동일한 위치에 정의
 *                 class Outer {
 *                     class MemberInner {...} // 멤버 클래스
 *                 }
 *              - 인스턴스가 정의되는 성질과 대등하게 정의되는 클래스
 *              - 멤버 클래스의 인스턴스는 외부 클래스의 인스턴스에 종속적이다.
 *              - 멤버 클래스 내에서 외부 클래스 내의 인스턴스 멤버에 직접 접근할 수 있다!!!!!
 *              - Outer클래스의 인스턴스 생성없이 직접 멤버 클래스 인스턴스 생성이 불가하다.
 *              - Outer o = new Outer(); // outer 클래스 인스턴스 우선 생성
 *              - Outer.Member om = new o.new Member(); // o 인스턴스 기반으로 두 인스턴스 생성
 *              - ### Member 인스턴스는 Outer 인스턴스 생성 후 Outer 인스턴스 기반으로'만' 생성할 수 있다!!!
 *              - 생성된 이너 클래스 인스턴스는 아우터 클래스의 인스턴스에 '직접' 접근이 가능하다!!!!!!!
 *              - 이너 클래스를 선언함으로써 그 클래스를 외부로부터 숨기는 것이 주 목적이다.
 *                사용자 관점에서 내부 클래스의 동작 구조를 파악하지 않아도 되므로
 *
 *
 *          - 로컬 이너 클래스
 *              - 중괄호 내에(지역 내에) 특히 메소드 내에 정의
 *              (멤버 클래스를 더 깊히 숨기는 것..? 보이는 범위를 더 좁히는 것
 *              멤버 클래스의 접근 범위를 더 좁히는 것이 로컬 클래스)
 *                 void method() {
 *                     class LocalInnerClass {...} // 로컬 클래스
 *                 }
 *              멤버클래스의 private 선언을 제외하고 그냥 메소드 안에
 *              클래스 정의와 같이 넣어버리므로써 더 깊이 감추는 효과.
 *              근데 보다보니 클래스 이름 자체도 불필요해보인다.
 *              그래서 곧 익명 클래스가 생성된다.
 *
 *
 *          - 익명 이너 클래스 : 로컬 클래스를 좀 더 줄여서 표현하고자 생긴 약속(정해진 것)
 *              - 로컬 클래스의 클래스명을 지움. 그럼 return 값에 인스턴스 생성을 어떻게 하지?
 *              ex) 로컬 클래스
 *              interface Printable { void print(); } // 인터페이스의 추상메소드
 *
 *              public Printable getPrinter() { // 메소드 내에 멤버 클래서 선언(로컬 클래스)
 *                  class Printer implements Printable {
 *                      // 인터페이스의 추상메소드 구현
 *                      public void print() {
 *                          System.out.println(outer class의 인스턴스);
 *                      }
 *                  }
 *                  return new Printer();
 *              }
 *
 *              To-Be 익명클래스(클래스 명을 지움)
 *              반환값을 인터페이스 인스턴스 생성과 동시에
 *              인터페이스 내의 추상메소드를 구현함.
 *              public Printable getPrinter() {
 *                  return new Printable() {
 *                      public void print() {
 *                          System.out.println(..);
 *                      }
 *                  };
 *              }
*  }
 * */