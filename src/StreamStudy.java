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
 * */