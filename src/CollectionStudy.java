
/**
 *  List<?>
 *  순서대로 저장, 중복저장 허용!!!
 *  어떠한 List를 사용하건 기능은 동일하나 성능의 차이만 존재한다.
 *
 *  ArrayList : 배열 기반(확장 시 속도는 Linked 보다 느리다)
 *  LinkedList : 연결 기반
 *
 *  배열은 삭제 시 앞당기는 과정이 필요하기 때문에 작업 시간이 증가한다.
 *  링크드 방식은 연결 주소지만 옮기면 되기 때문에
 *  자료구조 내에서 삭제 작업이 배열보다 유리하다.
 *
 *  배열의 장점 : 저장된 인스턴스의 참조가 빠르다(인덱스 기준이기 때문에)
 *  배열의 단점 : 저장 공간을 늘리는 과정에서 시간이 엄청 소요된다.
 *             인스턴스의 삭제 과정에서 많은 연산이 필요하다.
 *
 *  링크드 장점 : 저장 공간을 늘리는 과정이 간단하다.(연결 주소지만 옮겨주면 되기 때문)
 *             저장 인스턴스의 삭제 과정이 단순하다.(연결 주소지만 옮겨주면 되기 때문)
 *  링크드 단점 : 저장된 인스턴스의 참조 과정이 배열에 비해 복잡하다. > 느리다
 *             인덱스 기준이 아닌 연결 '첫 주소지' 기준으로 부터 주소지를 쫓아가기 때문에
 * */


/**
 *  Set<?> : 집합의 특성
 *  중복을 허용하지 않는다. 순서 보장이 되지 않는다.
 *  동일 인스턴스의 중복 저장이 안된다.
 *  동일 인스턴스의 기준은 ??
 *  Object class의 equals 메소드 호출 결과를 근거로 동일 인스턴스를 판단한다.
 *  그런데 그에 앞서 Object class의 hashcode 메소드 호출 결과가 같아야 한다.
 *
 *  Hash Algorithm 원리
 *  만약 1, 2, 3, 4, 5, 6 이라는 Set 데이터가 있고
 *  7이라는 값이 추가된다고 가정했을 때
 *  Set안에 7이 있는지 비교하려면 1~6까지 6번 비교를 해야한다.
 *
 *  그러면 비효율적이기 때문에 1~6까지 데이터를 세분화해서 분류를 하는 것이 해쉬 알고리즘
 *  분류 기준(알고리즘)을 num%3으로 소분한다면 0,1,2
 *  소분된 0, 1, 2 에 1~6까지의 결과값을 소분하여 저장하고
 *  새로 추가되는 데이터는 7%3 = 2 이므로
 *  2로 소분된 집합 내의 데이터만 비교하면 된다.
 *  이것이 해쉬 알고리즘의 기본!!!!
 *
 *  그러면 hashcode 값을 생성하는 알고리즘은 어떻게 정의해야할까?
 *  java.util.Objects 라이브러리에 정의된
 *  public static int hash(Object ...values)를 사용하면 된다.
 *  매개변수로는 클래스 내 멤버변수 전부를 전달하는 것이 좋다.
 *
 *
 *  Set
 *  HashSet : Hashcode 기준
 *  TreeSet : Tress 구조
 *  TreeSet도 저장순서를 보장하지 않고 중복을 허용하지 않는
 *  기본적인 Set의 성격을 갖지만 default 오름차순 정렬을 진행한다!!
 *
 *  저장할 때 저장하는 값의 크기를 비교해서 위치에 맞게 저장시킨다.(트리구조)
 *  작은 값 왼쪽 / 큰 값 왼쪽
 *
 *  Queue<E> : FIRST IN FIRST OUT(FIFO)
 *  Stack<E> : LAST IN FIRST OUT (LIFO)
 *  자바에 Stack<E> 클래스도 있지만 사용하면 안됨!!
 *  (성능이슈로 사용 지양 권고)
 *
 *  대신 Deque(덱) 컬렉션 프레임워크 사용!!
 *  Deque<E> deq = new ArrayDeque<>()
 *  기반은 LinkedList<E> 혹은 ArrayList<E>
 *  각 성질은 연결이냐 배열이냐 특성을 그대로 반영함
 *
 *
 *
 *  Map : Iterable 반복자 인터페이스를 구현하지 않는다.
 *  map은 반복자를 얻을 수 없다.
 *
 *  Map
 *  HashMap
 *  TreeMap(오름차순정렬) : 트리구조
 *
 *
 *  제네릭 심화!!!
 *  public static <T extends Comparable<T>> void sort(List<T> list)
 *  반환형이 void인 제네릭 메소드 메소드 호출 시 T(Type) 결정된다.
 *  위에서 Comparable<T> 인터페이스를 구현하는 인스턴스 혹은 그 하위의 인스턴스만 인자로 올 수 있다.
 *  즉, Comparable 인터페이스를 구현하고 있어야 한다.(상한 제한)
 *  Map은 Comparable 인터페이스를 구현하고 있지 않으므로 인자로 올 수 없다.
 *  만약 List<String> list = new ArrayList<>() 를 인자로 전달한다면
 *
 *  public static <List<T> extends Comparable<String>> void sort(List<String> list)
 *  로 해석할 수 있다.
 *  제네릭 메소드는 호출 시 타입이 결정되는데, Comparable<String>인터페이스를 extends(구현 혹은 상속)하고 있는
 *  List<String>로 타입을 상한제한하겠다. 즉, List<String> implements Comparable<String> 혹은
 *  그 하위의 인스턴스만 인자로 받을 수 있다.
 *  String class 원장은
 *  class String extends Object implements Comparable<String> 이다.
 *  즉 Comparable<String>을 구현하고 있으므로 위 제네릭 메소드의 인자로 적합하다.
 *
 *  ex
 *  class Car implements Comparable<Car>
 *  class ECar extends Car
 *  이 상황에서 ECar는 Car를 상속하기 때문에 ECar는 Comparable<Car>를 간접 구현하고 있다.
 *  public static <T extends Comparable<T>> void sort(List<T> list)
 *  그럼 sort 메소드의 인자로 전달될 수 있을까?
 *  제네릭을 결정하자면
 *  public static <ECar extends Comparable<ECar>> void sort(List<ECar> list)
 *  이렇게 되는데, ECar는 Comparable<Car>를 간접 구현할 뿐 Comparable<ECar>를 구현하고 있지 않다.
 *  따라서 호출이 불가능하다!!!!!
 *  public static <T extends Comparable<? super T>> void sort(List<T> list)
 *  public static <T extends Comparable<? super T>> void sort(List<T> list)
 *
 *  public static <ECar extends Comparable<? super ECar>> void sort(List<ECar> list)
 *  Comparable<? super ECar> : 와일드카드로 인해 어떠한 인스턴스도 올 수 있지만 super(하한 제한) 키워드로 인해
 *  ECar이거나 ECar가 상속하는 상위 클래스만 올 수 있다
 *  즉 ECar이거나 ECar가 상속하는 상위 Car 클래스가 올 수 있다.
 *  따라서 ? super ECar를 붙혀줌으로써 ECar 혹은 Car가 올 수 있다!!!
 *  사실 Comparable<ECar>가 존재하지 않기 때문에 위의 하한제한을 걸지 않으면
 *  올 수 없지만, 하한 제한을 걸어줌으로써 ECar or Car가 올 수 있기 때문에 걸어주는 것!!!
 *
 *  ? super T를 걸어주지 않으면 컴파일 에러가 발생한다. 왜냐, Comparable<ECar>는
 *  없으니까. 하지만 ? super T(하한제한)를 걸어줌을써 Type은 ECar이거나 ECar가 상속하는
 *  상위 클래스가 올 수 있다.
 *  따라서 Comparable<Car>도 올 수 있게 되는 것!!!!!!!!!!
 *
 *  public static <T extends Comparable<? super T>>
 *
 *  public static <T extends Comparable<? super T>>
 *
 *  public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
 *
 *  Collection Framework
 *  public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
 *  binarySearch 메소드 사용 시 먼저 정렬을 우선 진행해야한다!!!!!!
 *  index 탐색하는 알고리즘!!
**/