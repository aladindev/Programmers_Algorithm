import java.awt.print.Printable;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 *  Method References 4가지 유형과 Method References의 장점
 *  Method References : 기본적으로 람다식보다 조금 더 코드를 단순하게 할 수 있다는 장점
 *                      일부 람다식을 메소드 참조로 대신하게 할 수 있다.(전부는 아님)
 *  - static method references
 *      ex) Consumer<List<Integer>> c = list -> Collections.reverse(list);
 *      Counsemer 인터페이스의 void accept 추상 메소드를 구현하는데,
 *      메소드 내에서 Collections.reverse()를 호출하고 있고 매개변수로 람다식에서 전달한
 *      매개변수를 그대로 전달한다는 '보장'이 존재할 때
 *      메소드 참조식으로 작성할 수 있다.
 *      Consumer<List<Integer>> c = list -> Collections.reverse(list);
 *      >> Consumer<List<Integer>> c = Collections::reverse;
 *      약속에 근거!
 *
 *  - 참조변수를 통한 인스턴스 메소드 참조
 *
 *  - 클래스 이름을 통한 인스턴스 메소드 참조
 *
 *  - 생성자 참조
 * */

class JustSort {
   public void sort(List<?> list) { // 인스턴스 메소드
      Collections.reverse(list);
   }
}
class MethodReferencesStudy {
   private void test() {

      // 스태틱 메소드 참조
      Consumer<List<Integer>> c = Collections::sort;

      // 인스턴스 메소드 참조
      // 단 js는 반드시 effectively final : 사실상 상수
      // 한번 참조한 인스턴스가 바뀌지 않는 경우를 effectively final 이라한다.
      // 프로그램 종료시까지 한 번 참조한 인스턴스가 바뀌지 않는 경우
      JustSort js = new JustSort();
      Consumer<List<Integer>> c2 = js::sort;

      js = null;
      // 프로그램 종료 직전일지라도 effectively final 로 선언된 인스턴스가 바뀌면
      // 에러다.


   }
}