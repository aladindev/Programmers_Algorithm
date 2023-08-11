/**
 * ?인터페이스의 기본과 그 의미 : 기능 활용 방법? 통신 도구? 수단?
 * 내부 동작을 깊이 이해할 필요 없이
 * 사용자는 in out만 신경쓸 수 있도록 중간 매개 역할??
 * */


/**
 *  추상메소드만 담고 있는 인터페이스
 *
 *  */
interface InterfaceStudy {
    /** 추상 메소드
     *  >> 메소드의 몸체는 없고 선언만 있는 메소드
     *  >> 메소드의 몸체를 갖지 않으므로 인스턴스 생성 불가!
     *  >> 참조변수 선언 가능!
     *
     *  인터페이스는 인스턴스 생성이 불가하므로
     *  implements 키워드를 통해 구현하는 클래스를 생성해야함.
     *  구현하는 메소드와 추상 메소드 사이에도 메소드 오버라이딩 관계 성립
     *  상속과 비슷 따라서 @Override 어노테이션 사용 가능
     *
     *  인스턴스 생성이 불가하므로 인스턴스 변수를 가질 수 없다.
     *  하지만 static 상수 선언은 가능하다.
   * */
    public String print(String doc);
}

class Test implements InterfaceStudy {
    @Override
    public String print(String doc) {
        System.out.println("doc > " + doc);
    }
}

class Test2 {
    InterfaceStudy is2 = new Test();
    

}