# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 3단계 [로또 - 자동] 기능 구현 목록
**입력**
- 구입할 로또의 금액을 입력할 수 있다.
- 1 ~ 45 사이의 중복되지 않는 6개의 숫자로 이루어진 지난 주 당첨 번호를 입력할 수 있다.

**출력**
- 구매한 금액에 해당하는 로또 개수를 출력한다.
- 구매한 개수만큼 로또가 출력된다.
- 당첨 통계를 출력한다.
- 수익률을 출력한다.

**도메인**
- 구매한 금액만큼 로또를 생성한다.
  - 로또는 1 ~ 45 사이의 중복되지 않는 숫자 6개로 이루어져 있다.
- 당첨 번호와 구매한 로또의 번호를 비교해 당첨 통계를 구할 수 있다.
  - 3개 일치 - 5000원
  - 4개 일치 - 50000원
  - 5개 일치 - 1500000원
  - 6개 일치 - 2000000000원
- 구입한 금액 대비 당첨금의 수익률을 계산할 수 있다.