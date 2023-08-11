
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