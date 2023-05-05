# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 요구 사항
### Step 1.
- [x] 문자열로부터 공백으로 구분된 숫자와 연산자를 분류한다.    
- [x] 덧셈 연산을 계산한다.  
- [x] 뺄셈 연산을 계산한다.  
- [x] 곱셈 연산을 계산한다.  
- [x] 나눗셈 연산을 계신한다. (단, 정수로 떨어지는 경우로 한정한다.)   
- [x] 둘 이상의 연산자가 존재할 경우, 앞에서부터 차례로 계산한다.  
- [x] 숫자, 연산자에 대한 예외 처리를 한다.  
- [x] 사용자로부터 문자열을 입력받는다.

### Step 2.
- [x] 1 ~ 45 범위의 랜덤한 숫자 6개를 뽑는다.  
- [x] 위 숫자 리스트 생산 비용을 1000으로 책정하여, 전달받은 금액만큼 생성한다.  
- [x] 당첨 번호와 숫자 일치 개수를 확인하여 당첨 통계를 낸다.  
- [ ] 수익률을 계산한다.
- [x] 해당 결과를 콘솔에 출력한다.
