# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

# 로또(자동)
## MVC
### Domain
* [x] Lotto
* [x] Lottos
* [x] WinOfLotto
* [x] EqualNumbers
* [x] EqualNumbersMoney
### Service
* [x] BuyLotto
### View
* [x] LottoInput
* [x] LottoOutput
### Controller
* [x] LottoPlay

## 로또(자동) 요건 정의
### 로또 발급 번호는 1~45 사이의 숫자중 중복되지 않는 6개 숫자를 발급한다.
* [x] 1 ~ 45 사이의 6개 숫자를 정상적으로 입력한게 맞는지 확인한다.
* [x] 6개의 숫자를 입력하지 않은 경우 오류체크를 하는지 확인한다.
* [x] 1 ~ 45 사이의 숫자가 아닌 경우 오류체크를 하는지 확인한다.
* [x] 중복되는 숫자가 있는 경우 오류체크를 하는지 확인한다.

### 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또 개수를 발급한다.
### 로또는 1장당 1,000원이다.
* [x] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또 개수를 발급한다.
* [x] 1,000원 단위로 입력하지 않은 경우 오류체크를 확인한다.

* [x] 구입금액을 입력 받는다.
* [x] 구입한 로또 개수를 출력한다.
* [x] 자동 발급된 로또 번호를 출력한다.
* [x] 지난 주 당첨 로또 번호를 입력 받는다.
* [x] 보너스 번호를 입력 받는다.
* [x] 발급된 로또 번호와 당첨된 로또 번호의 일치 개수를 출력한다.
* [x] 로또 당첨 번호는 1~45 사이의 숫자입니다.
* [x] 로또 당첨 번호 6개를 추첨합니다.
* [x] 보너스볼 1개를 추가로 추첨합니다.
* [x] 로또 발급 번호와 당첨 번호가 일치하는 숫자 개수를 카운트 한다.
* [x] ENUM 사용하여 3개:5,000원, 4개:50,000원, 5개:150,000, 5개+보너스:30,000,000, 6개:2,000,000,000