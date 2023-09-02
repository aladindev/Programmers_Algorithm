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
 *  path.toAbsolutePath() >> 절대 경로로 변환
 *
 *  public static Path createFile(Path path, FileAttribute<?> ...attrs) throws IOException
 *  > 지정한 경로에 빈 파일 생성, 경로가 유효하지 않거나 파일이 존재하면 예외 발생
 *
 *  public static Path createDirectory(Path dir, FileAttribute<?> ...attrs) throws IOException
 *  > 지정한 경로에 디렉토리 생성, 경로가 유효하지 않으면 예외 발생
 *
 *  public static Path createDirectories(Path dir, FileAttribute<?> ...attrs) throws IOException
 *  > 지정한 경로의 모든 디렉토리 생성
 * */