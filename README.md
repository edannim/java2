# 유하영_202130222


# 5월 17일

자바의 GUI

GUI 응용프로그램
    GUI 
     사용자가 편리하게 입출력 할 수 있도록 그래픽으로 화면을 구성하고, 마우스나 키보드로 입력 받을 수 있도록 지원하는 사용자 인터페이스
    자바 언어에서 GUI 응용프로그램 작성
     AWT와 Swing 패키지에 강력한 GUI 컴포넌트 제공
     쉬운 GUI 프로그래밍

AWT와 Swing 패키지
    AWT 패키지
     자바가 처음 나왔을 때부터 배포된 GUI 패키지, 최근에는 거의 사용하지 않음
     AWT 컴포넌트는 중량 컴포넌트
    
    Swing 패키지
     AWT 기술을 기반으로 작성된 자바 라이브러리
     모든 AWT 기능+추가된 풍부하고 화려한 고급 컴포넌트
     AWT 컴포넌트를 모두 스윙으로 재작성, AWT 컴포넌트 이름 앞에 J자를 덧붙임
     순수 자바 언어로 구현
     스윙 컴포넌트는 경량 컴포넌트
     현재 자바의 GUI로 사용됨

컨테이너와 컴포넌트
    컨테이너
        다른 컴포넌트를 포함할 수 있는 GUI컴포넌트
        다른 컨테이너에 포함될 수 있음

    컴포넌트
        컨테이너에 포함되어야 화면에 출력될 수 있는 GUI객체
        다른 컴포넌트를 포함할 수 없는 순수 컴포넌트
        모든 GUI컴포넌트가 상속받는 클래스
        스윙 컴포넌트가 상속받는 클래스

    최상위 컨테이너
        다른 컨테이너에 포함되지 않고도 화면에 출력되며 독립적으로 존재가능한 컨테이너

스윙 프레임
    스윙 프레임 : 모든 스윙 컴포넌트를 담는 최상위 컨테이너
      JFrame을 상속받아 구현
      컴포넌트들은 화면에 보이려면 스윙 프레임에 부착되어야 함
    
    스윙 프레임(JFrame) 기본 구성
      프레임 – 스윙 프로그램의 기본 틀
      메뉴바 – 메뉴들이 부착되는 공간
      컨텐트팬 – GUI 컴포넌트들이 부착되는 공간

스윙 응용프로그램의 종료
    응용프로그램 내에서 스스로 종료하는 방법
      System.exit(0);
      언제 어디서나 무조건 종료

    프레임의 오른쪽 상단의 종료버튼(X)이 클릭되면 어떤 일이 일어나는가?
      >프레임 종료, 프레임 윈도우를 닫음
      >프레임이 보이지 않게 되지만 응용프로그램이 종료한 것 아님

    프레임 종료버튼이 클릭될 때, 프레임과 함께 프로그램을 종료시키는 방법
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

컨테이너와 배치, 배치관리자 개념

    컨테이너의 배치관리자
      컨테이너마다 하나의 배치관리자 존재
      컨테이너에 부착되는 컴포넌트의 위치와 크기 결정
      컨테이너의 크기가 변경되면, 컴포넌트의 위치와 크기 재결정

배치 관리자 대표 유형 4 가지
    FlowLayout 배치관리자
    BorderLayout 배치관리자
    GridLayout 배치관리자
    CardLayout


# 4월 19일

메소드 오버라이딩 개념
    -서브 클래스에서 슈퍼 클래스의 메소드 중복 작성
    -슈퍼 클래스의 메소드 무력화, 항상 서브 클래스에 오버라이딩한 메소드가 실행되도록 보장됨
    -'메소드 무시하기'로 번역되기도 함

오버라이딩 조건
    -슈퍼 클래스 메소드의 원형(메소드 이름, 인자 타입 및 개수, 리턴 타입) 동일하게 작성
 
 서브 클래스 객체와 오버라이딩 된 메소드 호출
    -오버라이딩한 메소드가 실행됨을 보장.

오버라이딩의 목적, 다형성 실현
    오버라이딩으로 다형성 실현
        -하나의 인터페이스(같은 이름)에서 서로 다른 구현
        -슈퍼 클래스의 메소드를 서브 클래스에서 각각 목적에 맞게 다르게 구현
 
 추상클래스
    추상 메소드
    abstract로 선언된 메소드, 메소드의 코드는 없고 원형만 선언

    추상 클래스
        추상 메소드를 가지며 abstract로 선언된 클래스
        추상 메소드 없이, abstract로 선언한 클래스

추상 클래스의 인스턴스 생성 불가
    추상 클래스는 온전한 클래스가 아니기 대문에 인스턴스를 생성할 수 없음
 

추상 클래스의 상속과 구현
    추상 클래스 상속
        추상 클래스를 상속받으면 추상 클래스가 됨
        서브 클래스도 abstract로 선언해야 함

    추상 클래스 구현
        서브 클래스에서 슈퍼 클래스의 추상 메소드 구현(오버라이딩)
        추상 클래스를 구현한 서브 클래스는 추상 클래스 아님


추상 클래스의 목적
    추상 클래스 목적
        -상속을 위한 슈퍼 클래스로 활용하는 것
        -서브 클래ㅐ스에서 추상 메소드 구현
        -다형성 실현


자바의 인터페이스
    자바의 인터페이스
        클래스가구현해야 할 메소드들이 선언되는 추상형
        인터페이스 선언
        

자바 인터페이스에 대한 변화
    여전히 인터페이스에는 필드(멤버 변수) 전원 불가


패키지 사용하기, import 문
    다른 패키지에 작성된 클래스 사용
        import를 이용하지 ㅏㄶ는 경우
            소스에 클래스 이름의 완전 경로명 사용
    
    필요한 클래스만 import
        소스 시작 부분에 클래스의 경로명 import
        import 패키지, 클래스
        소스에는 클래스 명만 명시하면 됨

    패키지 전체를 import
        소스 시작 부분에 패키지의 경로면, *import
        import 패키지.*
        소스에는 클래스 명만 명시하면 됨.
        import java.util.*;


패키지 만들기
    클래스 파일이 저장되는 위치는?
        클래스나 인터페이스가 컴파일되면 클래스 파일(class) 생성
        클래스 파일은 패키지로 선언된 디렉터리에 저장

    패키지 선언
        소스 파일의 맨 앞에 컴파일 후 저장될 패키지 지정.

JDK의 주요 패키지

    java.lang
        -스트링, 수학 함수, 입출력 등 자바 프로그래밍에 필요한 기본적인 클래스와 인터페이스
        자동적으로 import됨 - import문 필요없음

    java.util
        -날짜, 시간, 벡터, 해시맵 등과 같은 다양한 유틸리티 클래스와 인터페이스 제공

    java.io
        -키보드, 모니터, 프린터, 디스크 등에 입출려을 할 수 있는 클래스와 인터페이스 제공

    java.awt
        -GUI 프로그램을 작성하기 위한 AWT 패키지

    javax.swing
        -GUI 프로그래밍을 작성하기 위한 스윙 패키지

Object 클래스
    특징
        모든 자바 클래스는 반드시 Object를 상속받도록 자동 컴파일
            모든 클래스의 슈퍼 클래스
            모든 클래스가 상속받는 공통 메소드 포함


Wrapper 클래스
    -자바의 기본 타입을 클래스화한 8개 클래스를 통칭

    -용도
        객체만 사용할 수 있는 컬렉션 등에 기본 타입의 값을 사용하기 위해 > Wrapper 객체로 만들어 사용

박싱과 언박싱
    박싱(boxing)
        기본 타입의 값을 Wrapper 객체로 변환하는 것

    언박싱(unboxing)
        Wrapper 객체에 들어있는 기본 타입의 값을 배내는 것
        박싱의 반대


String의 생성과 특징
    -String
        String 클래스는 문자열을 나타냄
        스트링 리터럴(문자열 리터럴)은 String 객체로 처리됨


스트링 리터럴과 new String()
    스트링 리터럴
        자바 가상 기계 내부에서 리터럴 테이블에 저장되고 관리됨
        응용 프로그램에서 공유됨
    
    new String()으로 생성된 스트링
        스트링 객체는 힙에 생성
        스트링은 공유되지 않음 
Math
    -기본 산술 연산 메소드를 제공하는 클래스
    -모든 메소드느느 static으로 선언
        클래스 이름으로 호출 가능
    
    Math.random() 메소드로 난수 발생
        random()은 0보다 크거나 같고 1.0보다 작은 실수 난수 발생
        
        1에서 100까지의 랜덤 정수 10개를 발생시키는 코드사례
            
            for(int x=0; x<10; x++) {
                int n = (int)(Math.random()*100 + 1); //1~100까지의 랜덤 정수 발생
                System.out.println(n);
            }

 # 4월 12일

접근 지정자
    자바의 접근 지도자 4가지
        private, protected, public, 디폴트

클래스 접근 
    클래스 접근 지점

    디폴트 클래스

멤버 접근 지정
    private, 
    protected, 
    public, 
    디폴트

static 멤버

서브 클래스 객체의 모양
    슈퍼 클래스 객체와 서브 클래스의 객체를 별개
    서브 클래스 객체는 슈퍼 클래스 멤버 포함

슈퍼 클래스의 멤버에 대한 서브 클래스의 접근
    슈퍼 클래스의 private 멤버
        서브 클래스에서 접근할 수 없음
    슈퍼 클래스의 디폴트 멤버
        서브 클래스가 동일한 패키지에 있을 때, 접근 가능
    슈퍼 클래스의 public 멤버
    서브 클래스는 항상 접근 가능
    
protected 멤버
    protected 멤버에 대한 접근
        같은 패키지의 모든 클래스에게 허용
        상속되는 서브 클래스에게 허용

서브/슈퍼 클래스의 생성자 호출과 실행
    서브 클래스의 객체가 생성될 때
        슈퍼 클래스 생성자와 서브 클래스 생성자 모두 실행
        
        호출 순서
            서브 클래스의 생성자 먼저 호출
            서브 클래스의 생성자는 실행 전 슈퍼 클래스 생성자 호출

        실행 순서
            슈퍼 클래스의 생성자가 먼저 실행된 후 서브 클래스의 생성자 실행


서브 클래스와 슈퍼 클래스의 생성자 선택
    슈퍼 클래스와 서브 클래스
        각각 여러 개의 생성자 작성 가능
    
    서브 클래스의 객체가 생성될 때
        슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개가 생성
    
    서브 클래스의 생성자와 슈퍼 클래스의 생성자가 결정되는 방식
        1.개발자의 명시적 선택
            -서브 클래스 개발자가 슈퍼 클래스의 생성자 명시적 선택
            -super() 키워드를 이용하여 선택

        2.컴파일러가 기본 생성자 선택
            -서브 클래스 개발자가 슈퍼 클래스의 생성자를 선택하지 않는 경우
            -컴파일러가 자동으로 슈퍼 클래스와 기본 생성자 선택

super() 로 슈퍼 클래스의 생성자 명시적 선택
    super()
        서브 클래스에서 명시적으로 슈퍼 클래스의 생성자 선택 호출

업 캐스팅
    서브 > 슈퍼 클래스 대입

다운 캐스팅
    슈퍼 > 서브 대입

    업캐스팅된 것을 다시 원래대로 되돌리는 것
    반드시 명시적 타입 변환 지정


업캐스팅 레퍼런스로 객체 구별?
    업캐스팅 된 레퍼런스로는 객체의 실체 타입을 구분하기 어려움
        -슈퍼 클래스는 여러 서브 클래스에 상속되기 때문

instanceof 연산자 사용
    instanceof 연산자
        -레퍼런스가 가리키는 객체의 타입 식별


# 4월 5일

2차원 배열의 초기화
    배열 선언과 동시에 초기화

메소드의 배열 리턴
    배열 리턴
        배열의 레퍼런스만 리턴(배열 전체가 리턴되는 것이 아님)
    메소드의 리턴 타입
        리턴하는 배열 타입과 리턴 받는 배열 타입 일치
        리턴 타입에 배열의 크기를 지정하지 않음

자바의 예외 처리
    예외
        실행중 오동작이나 결과에 악영향을 미치는 예상치 못한 상황 발생
            >자바에서는 실행 중 발생하는 에러를 예외로 처리

    실행 중 예외가 발생하면
        자바 플랫폼은 응용 프로그램이 예외를 처리하도록 호출
            >응용 프로그램이 예외를 처리하지 않으면 프로그램 강제 종료 시킴

    예외 발생 경우
        정수를 0으로 나누는 경우
        배열의 크기보다 큰 인덱스로 배열의 원소를 접근하는 경우
        정수를 읽는 코드가 실행되고 있을 때 사용자가 문자를 입력한 경우

    
    자바 상속
        상위 클래스의 멤버를 하위 클래스가 물려받음
            상위클래싀:수퍼 클래스
            하위 클래스:서브 클랙스, 수파 클래스, 코드의 재사용, 새로운 특성 추가 가능

    자바의 객체 지향 특성:다형성
        같은 기름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것
        다형성 사례
            오버로딩:안 클래스 내에서 같은 이름이지만 다르게 작동하는 여러 메소드
            오버라이딩: 슈퍼 클래스의 메소드를 동일한 이름으로 서브 클래스마다 다르게 구현

    this 레퍼런스
        this
            객체 자신에 대한 레퍼런스
                컴파일러에 의해 자동관리, 개발자는 사용하기만 하면 됨
                this 멤버 형태로 멤버를 접근할 때 사용
    
    객체 소멸
        new에 의해 할당 받은 객체의 배열 메모리를 자바 가상 기게로 되돌려주는 행우ㅏ
        소멸된 객체 공간은 가용 메모리에 포함
    
    자바에서 사용자 임의로 객체 소멸 안됨
        자바는 객체 소멸 연산자 없음

    객체 소멸은 자바 가상 기게의 고유한 역할
    
    자바 개발자에게는 매우 다행스러운 기능
        C/C++에서는 할당 받은 객체를 개발자가 프로그램 내에서 삭제해야 함
        C/C++ 의 프로그램 작성을 어렵게 만드는 요인
        자바에서는 사용하지 않는 객체나 배열을 돌려주는 코딩 책임으로부터 개발자 해방

    가비지 컬렉션
        자바 가상 기계가 가비지 자동 회수
            가용 메모리 공간이 일정 이하로 부족해질 때 
            가비지를 수거하여 가용 메모리 공간으로 확보
        
        가비지 컬렉터에 의해 자동 수행

        강제 가비지 컬렉션 강제 수행
            System 또는 Runtime 객체의 gc() 메소드 호출

            
# 3월 29일
    ● 실수 리터럴
        소수점 현태나 지수 형태로 표현한 실수
        실수 타입 리터럴은 double타입으로 컴파일
        숫자 뒤에 f(float)나 d(double)를 명시적으로 붙이기도 함

    ● 문자 리터럴
        단일 인용부호(' ') 로 문자 표현
            -\u 다음에 4자리 16진수로, 2바이트의 유니코드
            -'a', 'W', '가', '*', '3', '7', '글'
        특수문자 리터럴은 백슬래시로(\) 시작

● 기본 타입 이외 리터럴
    null 리터럴
        레퍼런스에 대입 사용

    문자열 리터럴(스트링 리터럴)
        - 이중 인용부호로 묶어 표현
        -문자열 리터럴은 String 객체로 자동 처리


● 상수
    상수 선언
        - final 키워드 사용
        - 선언시 초기값 지정
        - 실행 중 값 변경 불가


● var 키워드
    Java 10부터 도입
    기존의 변수 선언 방식: 변수의 타입 반드시 지정

    var 키워드
        -타입을 생각하고 변수 선언 가능
        -컴파일러가 추론 하여 변수 타입 결정
            변수 선언시 초기값이 주어지지 않으면 컴파일 오류
        

    Scanner 클래스



    ● 증감 연산
         -1 증가 혹은 감소 시키는 연산

    ● 대입 연산
        -연산의 오른쪽 결과는 왼쪽 변수에 대입

    ● 비교 연산, 논리 연산
        - 비교 연산자:두 개의 값을 비교하여 true/false 결과
        - 논리 연산자:두 개의 논리 값에 논리 연산. 논리 결과

    ● 조건 연산
        - 3 개의 피연산자로 구성된 삼항(ternary) 연산자
            opr1?opr2:opr3
            opr1이 true이면, 연산식의 결과는 opr2, false이면 opr3

        - if-else을 조건 연산자로 간결하게 표현 가능

    ● 비트 연산
        - 비트 논리 연산
            비트 끼리  AND OR XOR NOT 연산
            피 연산자의 각 비트들을 대상으로 하는 연산

        - 비트  시프트 연산
            비트를 오른쪽이나 왼쪽으로 이동

 ●  단순 if문 if-else문
 ●  다중 if-else문
    -조건문이 너무 많은 경우, switch문 사용 권장

●  switch문 case문

●  case문의 값
    - 문자, 정수, 문자열, 리터럴(JDK 1.7부터)만 허용
    - 실수 리터럴은 허용되지 않음


●  반복문
    - 자바 반복문 : for문, while문, do-while문
        for문 - 가장 많이 사용하는 반복문.

●  자바 배열
    배열(array)
        -인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조
            배열을 이용하면 한 번에 많은 메모리 공간 선언 가능
        -배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간
            원소 데이터들이 순차적으로 저장
            인덱스를 이용하여 원소 데이터 접근
            반복문을 이용하여 처리하기에 적합한 자료구조
        -배열 인덱스
            0부터 시작
            인덱스는 배열의 시작 위치에서부터 데이터가 있는 상대 위치

●  배열 선언 및 생성 디테일
    -배열 선언과 배열 생성의 두 단계 필요.
    -배열 선언
        배열의 이름 선언(배열 레퍼런스 변수 선언)

        int intArray[]; 또는 int[] intArray;
        int intArray[5]; //크기 지정 안 됨

    -배열 생성
        배열 공간 할당 받는 과정

        int intArray = new int[5]; 또는 int intArray[] = new int[5]; //선언과 동시에 배열 생성

    -배열 초기화
        배열 생성자 값 초기화

        int intArray[] = {4,3,2,1,0};
        double doubleArray[] = {0.01,0.02,0.03,0.04};

●  배열의 크기, length 필드
    -자바의 배열은 객체로 처리
        배열 객체의 length 필드
            배열의 크기는 배열 객체의 length 필드에  저장
배열과 for-each문
    -for-each문
        배열이나 나열의 원소를 순차 접근하는데 유용한 for문


# 3월 22일

자바의 특징(1)

● 플랫폼 독립성
    - 하드웨어 운영체제에 종속되지 않는 바이트 코드로 플랩폼 독립성

● 객체지향
    - 캡슐화, 상속, 다형성 지원

● 클래스로 캡슐화
    - 자바의 모든 변수나 함수는 클래스 내에 선언
    - 클래스 안에서 클래스(내부 클래스) 작성 가능
 
● 소스(java)와 클래스(class) 파일
    - 하나의 소스 파일에 여러 클래스를 작성 가능
    - 소스 파일의 이름과 public으로 선언된 클래스 이름은 갈아야 함
    - 클래스 파일에는 하나의 클래스만 존재.


자바의 특징(2)

● 실행 코드 배포
-구성
    >한 개의 class 파일 또는 다수의 class 파일로 구성
    >여러 폴더에 걸쳐 다수의 클래스 파일로 구성된 경우 : jar 압축 파일로 배포

-자바 응용 프로그램의 실행은 main() 메소드에서 시작
    >하나의 클래스 파일에 두 개 이상의 main() 메소드가 있을 수 없음

● 패키지
    -서로 관련 있는 여러 클래스를 패키지로 묶어 관리
    -패키지는 폴더 개념

● 멀티스레드
    -여러 스레드의 동시 수행 환경 지원
        >자바는 운영체제의 도움 없이 자체적으로 멀티스레드 지원
        >C/C++ 프로그램은 멀티스레드를 위해 운영체제 API를 호출

● 가비지 컬렉션
    -자바 언어는 메모리 할당 기능은 있어도 메모리 반환 기능 없음
        사용하지 않는 메모리는 자바 가상 기계에 의해 자동 반환 – 가비지 컬렉션

자바의 특징(3)

● 실시간 응용 프로그램에 부적합
    -실행 도중 예측할 수 없는 시점에 가비지 컬렉션 실행 때문.

● 자바 프로그램은 안전
    -타입 체크 엄격
    -물리적 주소를 사용하는 포인터 개념 없음

● 프로그램 작성 쉬움
    -포인터 개념이 없음
    -동적 메모리 반환하지 않음
    -다양한 라이브러리 지원

● 실행 속도 개선을 위한 JIT 컴파일러 사용
    -자바는 바이트 코드를 인터프리터 방식으로 실행
        >기계어가 실행되는 것보다 느림
    -JIT 컴파일 기법으로 실행 속도 개선
        >JIT 컴파일 – 실행 중에 바이트 코드를 기계어 코드로 컴파일하여 기계어를 실행하는 기법

식별자(identifier)

● 식별자란?
    -클래스, 변수, 상수, 메소드 등에 붙이는 이름
    -식별자의 원칙


● 대소문자 구별
    -int barChart 와 barchart는 서로 다른 식별자 선언

문자열
    -문자열은 기본 타입이 아님
    -String 클래스로 분자열 포현
        >문자열 리터럴 - "JDK", "한글", "계속하세요"
        >문자열이 섞인 + 연산 -> 문자열 연결

변수와 선언
    -변수
        프로그램 실행 중에 값을 임시 저장하기 위한 공간
    -변수 선언
        데이터 타입에서 정한 크기의 메모리 할당

리터럴과 정수 리터럴
    리터럴
        프로그램에서 직접 표현한 값
        점수 실수 문자 논리 문자열 리터럴 있음
    점수 리터럴
        10진수 8진수 16진수 2진수 리터럴
    점수 리터럴은 int형으로 컴파일
    long 타입 리터럴은 숫자 뒤에 L 또는 l을 붙여 표시

# 3월15일

# 내용
# (최신 수업내용이 위로 올라가는 순서로)