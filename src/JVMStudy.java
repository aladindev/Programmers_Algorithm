/*  자바 가상머신의 메모리 모델
*
*  * 메소드 영역(Method Area) : 메소드의 바이트코드, static 변수
*  * 스택 영역(Stack Area)    : 지역변수, 매개변수
*  * 힙 영역(Heap Area)      : 인스턴스
*
*
*   메소드 영역의 특성 : 프로그램 최초 실행 후 메모리 영역에 적재된 후
*                   프로그램 종료 시까지 유지된다. 한 번 할당이 되고 나면 지우지 않는다.
*                   static 변수도 마찬가지.
*                   그래서 Main method에 static이 붙었던 것..!
*
*   스택 영역(지역 변수, 매개 변수 :: 임시 저장의 성질)
*   : 메소드 내의 지역 변수는 메소드 호출 후 메소드 종료 시에 필요 없어지므로
*     매개변수도 마찬가지로 메소드 호출 후 종료 시에 필요 없어지므로
*     한정된 메모리를 효율적으로 사용하기 위해서 호출 후 메소드 종료 시 소멸된다.
*
*   힙 영역(인스턴스 저장) : 가비지 컬렉션의 대상이 되는 영역이다!!!!
*
*   method() {
*       String str = new String("test");
*       이 코드에서 String str 는 지역변수 이므로 스택 영역에 할당되고
*       new String()은 인스턴스 생성이므로 힙 영역에 할당된다.
*       str는 참조변수이자 지역변수
*       스택에 존재하는 참조변수가 힙 영역 인스턴스를 참조
*       이 상황에서 method()가 종료되면 지역변수이자 참조변수인 str는 소멸된다.
*       그러면 참조하는 인스턴스도 스택 영역에 넣고 같이 지워버리면 되지 않나?
*       아니다 ==> 왜냐면 하나의 인스턴스를 여러 참조변수가 참조할 수 있기 때문이다.
*       String str = new String("test");
*       String str2 = str; << 다른 인스턴스가 힙 영역의 동일 인스턴스를 참조할 때
*       따라서 힙 영역에 있는 인스턴스가 어느 곳에서도 참조되지 않을 때
*       JVM의 가비지 컬렉션이 힙 영역 내에 있는 인스턴스 중 아무 것도 참조되고 있지 않은
*       인스턴스를 가비지 컬렉션이 지워버린다.(조심스럽게 소멸시키기 위해)
*
*       인스턴스 소멸 시기 !!
*       >>
*
* *   }
* */


