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
 *  동기화 방법
 *  1. 동기화 메소드(synchronized)
 *  synchronized method()
 *
 *  2. 동기화 블록
 *  method() {
 *      synchronized(this)
 *  }
 * */