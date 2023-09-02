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
 * */