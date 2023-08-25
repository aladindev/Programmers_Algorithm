import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/***
 *  컬렉션 중 전체 혹은 일부중에서 특정 조건? 필터를 줘서
 *  꺼내는 작업
 *  ex) Collection [1,2,3,4,5] 중 홀수만 (%2==1 필터) 가져오기
 *
 *  데이터에 열 정보(스트림)를 가지고 있는 인스턴스(다수의 컬렉션 데이터를 가지고 있는)
 *  작업을 담당하는 파이프(흐름, 스트림)에 보낼 수 ? 있다.
 *  일련의 작업 : ex 홀수만 거르기, 걸러낸 수를 더하기 스트림 등 .  ..
 *  중간작업, 최종작업으로 나뉜다.
 *  홀수만 나누기(중간작업) -> 나눈 값 더하기(최종작업)
 *
 *  IntStream is = Arrays.stream(array); // 스트림 생성
 *  is.filter(n -> n%2 == 1);
 *
 *  Arrays.stream() // stream 생성
 *  .filter(n -> n%2 == 1) // filter 통과
 *  .sum() // sum 통과(최종작업)
 *
 *   Stream 생성 방법
 *   - 배열 및 컬렉션 인스턴스 대상으로 스트림을 생성하는 방법
 *
 *   - 중간 연산의 종류와 내용
 *       - 필터링
 *       - 매핑 .map() ex) .map(s -> s.length()).forEach(n -> println));
 *   - 최종 연산의 종류와 내용
 *
 *
 *    리덕션, 병렬 스트림
 *
 *    리덕션 - 데이터가 여러개였는데 특정한 조건에 의해서 데이터가 1개로 되는 것
 *         ex) 1, 2, 3 스트림 > 최종연산(sum) > 결과 6
 *            리덕션 : 다수의 데이터가 어떠한 연산에 의해 하나의 데이터로 반환되는 것
 *            대표적인것 sum
 *
 *            BinarayOperator<String> lc = (s1, s2) -> {
 *                logic .
 *                .
 *                .
 *            }
 *            List<String> list
 *            list.stream().reduce("", lc);
 *            reduce의 첫 번째 인자는 스트림이 빈 경우 첫 번째 인자가 반환된다.
 *            단, 첫 번째 인자를 스트림 데이터 일부로 간주한다.
 *            비교값의 첫번째로 본다는 것.
 *
 *
 *     병렬 스트림
 *      병렬 - CPU에 core가 여러 개 있다. 실제로 연산을 작업하는 연산 장치가 core
 *            하나의 작업을 둘 이상의 코어가 나눠서 처리하는 행위가 병렬
 *      병렬처리를 남용하면 안된다. 왜냐면 작업을 나누고 합치고 하는 등의 작업에서
 *      리소스와 시간이 더 오래 걸릴 수 있다.
 *
 *      list.paralleStream()
 *          .reduce("", list)
 *
 *
 *
 *    flatMap = 1:*(일대다) 매핑하는 메소드
 *    Stream<String> ss = Stream.of("1_2", "2_3")
 *    스트림 생성
 *
 *    // 아래 람다식에서 스트림을 생성
 *    Stream<String> ss2 = ss.flatMap(s -> Arrays.stream(s.split("_")));
 *    ss2.forEach(s -> System.out.print(s + "\t"));
 *    반환형은 Stream형을 반환하며, 수행 후 다수의 데이터가 생성이 된다.
 *    ex) split을 통해
 *    Stream a =>> {"1", "2"} / Stream b = {"2", "3"}
 *    두 개의 스트림이 생성이 되고, 두 개의 스트림을 연결한다.
 *    따라서 2개의 스트림이 생성이 된다. 1:* 일대다 관계
 *
 *
 *    루핑(Looping)
 *    forEach : 최종연산
 *    peek : 중간연산
 *    최종연산이 수행되기 전까지 중간연산은 아무런 의미가 없다.
 *
 *    collect() : 스트림에 있는 데이터를 모으는 것
 *    String[] words = {"122", "233", "344444"}
 *    Stream<String> ss = Arrays.stream(words)
 *
 *    List<String> ls = ss.filter(s -> s.length() < 4)
 *                        .collect(() -> new ArrayList<>() // 저장소 생성
 *                         ,(c, s) -> c.add(s) // 첫 번째 인자 통해 생성된 인스턴스 c, 스트림의 데이터 s
 *                         ,(lst1, lst2) -> lst1.addAll(lst2) // < 병렬 스트림에서 사용
 *                         >> parallel().filter().collect(, , (lst1, lst2) -> lst1.addAll(lst2));
 *                         >> 병렬처리로 각각 생성된 리스트를 취합한다.
 *
 *
 *
 *    I/O Stream!
 *    그냥 스트림과 I/O스트림의 차이 ?
 *    스트림 : 컬렉션(저장소, 코드 상의 저장소!)를 논리적인 파이프에 통과 시키기 위해 데이터를 나란히 하는 것을 스트림
 *    I/O 스트림 : 저장소가 일반적으로는 물리적인 저장소(대표적으로 파일)
 *
 *    스트림 : 데이터를 어떻게 원하는 형태로 걸러내고 가공할 것인가? 논리적, 코드레벨
 *    I/O스트림 : 어떻게 데이터를 입력하고 출력할 것인가?
 *
 *    파일에 저장된 문자열을 꺼내어 컬렉션 인스턴스에 저장
 *      > I/O 스트림으로 해결해야 할 부분
 *    컬렉션 인스턴스에 저장된 문자열 중 길이가 5 이상인 문자열만 출력
 *      > 스트림으로 해결해야 할 논리적인 내용
 *
 *
 *    스트림은 기본적으로 한 방향으로 흐르는 것..
 *    Input Stream / Output Stream 각각 구현해야 함.
 *
 *    입력 스트림 / 출력 스트림을 각각 구현해야 한다.
 *
 *    try-with-resource
 *
 *    try(OutputStream out = new FileOutputStream("")) {
 *        // try-with-resource
 *        -- 스트림 open이 정상적으로 되었으면 close도 알아서
 *           컴파일러가 진행해줌.
 *    } catch(IOException e) {
 * 
 *    }
 **/
class StreamStudy {
}
class TestStream {
    private int a;
    private int b;
    private int c;

    public TestStream(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {return a;}
    public int getB() {return b;}
    public int getC() {return c;}
}

