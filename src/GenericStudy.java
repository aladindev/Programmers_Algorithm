
/**
 *  인스턴스 생성 시 결정이 되는 자료형의 정보를 T로 대체한다.
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
