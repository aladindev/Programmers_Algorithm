/**
 *  Paths와 Path 클래스
 *  파일 및 디렉토리의 경로 표현을 위해 자바 7에서 추가된 인터페이스
 *  Path path = Paths.get("절대경로")
 *
 *  path.getRoot()
 *  path.getParent()
 *  path.getFileName()
 *
 *  Path path = Paths.get("") // 현재 디렉토리 정보 '상대 경로' 형태로 담긴 인스턴스 생성
 *  boolean path.isAbsolute()
 * */