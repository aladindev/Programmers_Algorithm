
/**
 *  Part 1
 *  인스턴스 생성 시 결정이 되는 자료형의 정보를 T로 대체한다.
 *  Type Parameter(타입 매개변수) : GenericStudy<T>에서 T
 *  Type Argument(타입 인자)     : GenericStudy<instance>에서 instance
 *  Parameterized Type(매개변수화 타입) : GenericStudy<instance>
 *  (컴파일러는 매개변수화 타입 '자체'를 하나의 별도의 자료형으로 판단한다.)
 *
 *  제네릭의 장점 : 코드의 안전성을 높힌다
 *  ? 제네릭을 사용하지 않으면 프로그래머가 직접 명시적 형변환을 해야한다.
 *  > 이는 컴파일러의 개입을 허용하지 않기에 컴파일 단계에서 에러가 발생하지 않는다.
 *  > 제네릭을 사용함으로써 매개변수화 타입을 결정하면 타입 인자가 결정된 타입 매개변수만을
 *    받기 때문에 컴파일 단계에서 에러를 검출할 수 있다.
 *
 * */

/* part 1
public class GenericStudy<T> {
    private T object;

    public void set(T o) {
        object = o;
    }

    public T get() {
        return object;
    }
}
*/

/** part 2
 * Part 2 !!!! 제네릭 클래스의 타입인자(Type Argument) 제한하기
 *  >> 인스턴스 생성 시 타입 인자(Type Argument)로 Number 또는
 *  이를 상속하는 클래스만 올 수 있게 제한하는 것
 *
 *  인터페이스를 상속할 수도 있다.
 *  클래스와 하나의 인터페이스에 동시 제한을 걸 수 있다.
 *  ex) GenericStudy<T extends Number & Interface>
 *
* */

public class GenericStudy<T extends Number> {
    private T object;

    public int toIntValue() {
//         Number 클래스를 상속하기 때문에
//         Number 클래스에 있는 intValue() 메소드를
//         호출할 수 있다!!!

        return object.intValue();
    }

    public void set(T o) {
        object = o;
    }

    public T get() {
        return object;
    }
}


/**
 *  제네릭 메소드
 *  제네릭 클래스가 아닌 클래스 내 메소드만 제네릭 타입 매개변수를 받는 메소드를 작성할 때
 *  public static <T> Class<T> method(T obj) {}
 *  반환형 앞에 <T> 를 붙혀서 이것이 제네릭 메소드 임을 명시한다.
 *
 *  다만 제네릭 타입의 결정시기에 차이가 있다.
 *  제네릭 클래스는 인스턴스를 생성할 때 그 타입이 결정되었지만
 *  제네릭 메소드는 메소드가 호출될 때 결정이 된다.
 *
 * */



/**
 *  제네릭 메소드 vs 일반 메소드 *
 *  Generic<Integer> Generic<Object>
 *
 *  public void test(Generic<Object> obj)
 *  라는 메소드가 있을 때 Integer가 Object를 상속하지만
 *  제네릭 타입인자는 상속과 상관관계는 전혀 고려하지 않는다.
 *  따라서 Integer 타입자료형은 매개변수로 전달 불가능
 *
 * 위와 같은 일반 메소드는 이미 제네릭 자료형이 결정되었기 때문에
 * 아무런 상속이나 상관관계랑은 상관없이 결정된 타입인자만
 * 받을 수 있다.
 *
 * 하지만 제네릭 메소드
 * public <T> void test(Generic<T> obj)
 * 는 제네릭 메소드의 생성과 동시에 자료형이 결정되므로
 * 모든 자료형이 인자로 전달될 수 있다.
 *
 * */


/**
 *  #### 와일드 카드 #####
 *  제네릭<T>와 혼동되어 어려움을 느낀다.
 *
 *  Generic<?> : 제네릭 타입 매개변수 자료형에 모든 객체가 들어올 수 있다.
 *  public static void box(Box<?> box)(와일드카드)
 *  ==> 와일드카드와 제네릭 메소드 기능적으로 동일
 *      하지만 내부적으로는 동작 차이가 있다.
 *  public static <T> Void box(Box<T> box)(제네릭 메소드)
 * */

/**
 *  와일드 카드의 상한과 하한의 제한 : Bounded Wildcards
 *
 *  제네릭에서는 제한을 extends(상속)만으로 제한을 했다.
 *  와일드카드에서는 extends(상속)과 super 키워드 두 개로 제한을 할 수 있다!!!
 *
 *  상한 제한된 와일드카드(Upper-Bounded Wildcards)
 *  public static void box(Box<? extends Number> box
 *  : Number 클래스를 상속하는 인스턴스만 제공 가능(상한 제한)
 *  상속 관계에서 위쪽 계층을 제한하여 제한된 클래스를 상속하는 이하의 객체들을 받는다.
 *
 *
 *  하한 제한된 와일드카드(Lower-Bounded Wildcards)
 *  public static void box(Box<? super Integer> box)
 *
 *  box는 Box<T> 인스턴스의 참조 값을 전달받는 매개변수이다.
 *  단 전달되는 인스턴스의 T는 Integer 또는 Integer가 상속하는 클래스이어야 함
 *  즉 위 메소드의 인자로 전달 가능한 인스턴스는 Box<Integer>, Box<Number>, Box<Object>로 제한됨
 *  즉 위 코드에서는 최하 Integer 객체이거나 그 이상의 객체만 와일드카드 자리에 올 수 있다.
 *
 *
 *  ## 상한 제한의 목적 : 제한을 둠으로써 개발자의 실수 컴파일러 단계에서 잡겠다.
 *
 *  public static outBox(Box<? extends Toy> box)
 *
 *  class BoxContentsMover {
 *      //from에 저장된 내용물을 to로 이동
 *      public static void moveBox(Box<? super Toy> to,
 *                                  Box<? extends Toy> from) {
 *          to.set(from.get());
 *
 *      }
 *
 *  }
 *
 *  컴파일 과정에서 <> 제네릭 꺽쇠? 부분이 전부 지워진다.
 *  따라서 오버로딩 시 <? extends ""> <? super "">
 *  등 전부 같은 타입으로 구분된다.(컴파일 시에)
 * */