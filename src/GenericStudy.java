
/**
 *  인스턴스 생성 시 결정이 되는 자료형의 정보를 T로 대체한다.
 *  Type Parameter(타입 매개변수) : GenericStudy<T>에서 T
 *  Type Argument(타입 인자)     : GenericStudy<instance>에서 instance
 *  Parameterized Type(매개변수화 타입) : GenericStudy<instance>
 *  (컴파일러는 매개변수화 타입 '자체'를 하나의 별도의 자료형으로 판단한다.)
 *
 * */
public class GenericStudy<T> {
    private T object;

    public void set(T o) {
        object = o;
    }

    public T get() {
        return object;
    }

}
