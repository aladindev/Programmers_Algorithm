/***
 *  쓰레드 그리고 동기화
 *
 *  스레드의 이해
 *  Process : 실행중인 프로그램
 *  하나의 프로세스 안에서 여러 프로그램의 흐름을 가진다.
 *  쓰레드 >> 프로세스에 있어서 프로그램의 흐름을 형성하는 최소 단위!!
 *
 *  Thread ct = Thread.currentThread()
 *  : 현재 코드가 실행되고 있는 인스턴스의 참조 값을 반환
 *  ex) Main Thread 내에서 위 인스턴스를 참조하면
 *      Main 쓰레드의 정보에 접근할 수 있다.
 *      ct.getName() :: main
 *
 *  쓰레드 생성
 *  Runnable task = () -> { // 스레드가 실행하게 될 내용
 *
 *
 *  };
 *  Thread t = new Thread(task);
 *  t.start();
 *
 *  t.join(); 실행중인 스레드가 종료될 때까지 기다리겠다.
 *
 *  멀티쓰레드의 동일한 메모리 공간에 접근하면
 *  코어 할당으로 인해서 제대로 된 결과를 만들어 낼 수 없다.
 *  해결책 : 스레드의 동기화 !!(스레드가 작업중일때 코어 할당을 막는다.)
 *
 *  같은 메모리에 접근하는 두 개 이상의 쓰레드(멀티쓰레드) 환경에서는
 *  반드시 동기화를 진행해야 한다.
 *  동기화 방법
 *  1. 동기화 메소드(synchronized)
 *  synchronized method()
 *
 *  2. 동기화 블록
 *  method() {
 *      synchronized(this)
 *  }
 *
 *  근데 작업이 큰 메소드 전체에 동기화를 하면 비효율적이다.
 *  그래서 동기화 블럭을 사용하는 것이 좋다.
 *
 *  Thread pool
 *  쓰레드의 생성과 소멸은 리소스 소모가 많은 작업이다.
 *  그런데 쓰레드 풀은 쓰레드의 재활용을 위한 모델이다.
 *
 *  ExecutorService exr = Executors.newSinglneThreadExecutor();
 *  exr.submit(task); exr.submit(task2) exr.submit(task3) exr.submit(task4)
 *
 *  newSingleThreadExecutor
 *   : 풀 안에 하나의 쓰레드만 생성하고 유지한다.
 *  newFixedThreadPool
 *   : 풀 안에 인자로 전달된 수의 쓰레드를 생성하고 유지한다.
 *  newCachedThreadPool
 *   : 풀 안의 쓰레드의 수를 작업의 수에 맞게 유동적으로 관리한다.
 *
 *   Callable & Future
 *
 *
 * @FunctionalInterface
 * public interface Callable<V> {
 *     V call() throws Exception;
 * } // 스레드의의 task 반환형이 존재한다!!!
 *
 * ex) Callable<Integer> task = () -> { .. return Integer.One; };
 *     Future<Integer> fur = exr.submit(task);
 *
 *     Integer result = fur.get(); // 스레드의 반환 값 획득
 *
 *  synchronized를 대신하는 ReentrantLock
 *  ReentrantLock obj = new ReentrantLock();
 *
 *  method() {
 *      obj.lock();
 *      obj.unlock();
 *  }
 * */