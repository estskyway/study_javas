package test;

public class memo {
    
}

// * Quest
// - 종료 전까지 계속 설문 진행
// - 설문지는 하나, 설문자는 최소 4명
// - 재설문 시 기존 설문 내용 삭제됨.

// ------ 작동 key ------
// (E)xit : 종료
// (O)ption : 옵션 추가 시작
// (S)tatistic : 옵션 갯수 통계

// ---- Loop Example (Don't print)-------------------
// -- 선택 입력 : O
// - 차 이름 명단
// 1. 현대 - 소나타 : 네비게이션, 가죽 시트
// 2. ...
// - 차명 번호 입력 : 4
// -Error- 확인 후 입력 필요
// - 차명 번호 입력 : 1
// -- 옵션 추가 시작
// 	--> 아래 참조 : Option example

// ---- Loop Example (Don't print)-------------------
// -- 선택 입력 : S	 --> or Statistic
// 	--> 아래 참조 Statistic example

// ---- Loop Example (Don't print)-------------------
// 선택 입력 : E	--> or Exit
// ----- 설문 종료 ------

// -------- 참조 : Option example -------------
// 1. 네비게이션, 2. 후방 카메라, ...
// - 추가 옵션 번호 : 2
// -- 추가된 내역
// 1. 현대 - 소나타 : 네비게이션, 가죽 시트, 후방 카메라

// -------- 참조 : Statistic example -------------
// 1. 현대 - 소나타 : 3 options
// 2. ...