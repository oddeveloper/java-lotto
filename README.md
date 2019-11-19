# 로또

## 2단계 - 로또 (자동)

### 기능 요구사항

- 로또 1장의 가격은 1000원이다.
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또 장수와 번호를 발급해야 한다.
- 로또 발급시 번호는 6개이어야 한다.
- 로또 발급시 번호는 순차정렬이 되어야 한다.
- 로또 번호는 1~45까지만 발급되도록 해야 한다.
- 로또의 개수에 따른 일치 금액은 아래와 같다.
  - 3개: 5000원
  - 4개: 50000원
  - 5개: 1500000원
  - 6개: 2000000000원
- 수익률은 전체 구매금액에서 당첨금액으로 나누어 소수점 두자리까지 노출한다. (반올림은 하지 않는다.)

### 프로그래밍 요구사항

- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
  - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
  - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
  - 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596
- else 예약어를 쓰지 않는다.
  - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
  - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.