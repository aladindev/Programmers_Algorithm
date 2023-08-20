/**
 *  Optional 클래스 : if-else문을 일부 대체할 수 있는 클래스
 *  (전부는 아님)
 *
 *  Optional class의 기본적인 사용 방법
 *
 *  Optional<T> >> 참조변수를 통해 저장을 하는 일종의 래퍼 클래스
 *
 *  Optional.of > of()는 null을 허용하지 않음
 *          .ofNullable()는 null을 허용
 *          .get() 참조값 얻기
 *          .isPresent() 값이 null이면 false null이 아니면 true 반환
 *          .ifPresent() 'if'임 만약 존재한다면
 *              ifPresent(s -> System.out.println(s));
 *              ifPresent(System.out::println);
 *          .map() : 매개변수를 전달받은 뒤 람다식을 수행한 값을 반환!!
 *                   반드시!! input -> s.toLowerCase()); -> input.toLowerCase() 반환 
 * */



public class OptionalClassStudy {
    public final class Optional<T> extends Object {
    }


}