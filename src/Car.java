public class Car {

    int ptnumber;               // 잔여 승객수
    int lgnumber;               // 최대 승객수
    int totalnumber;            // 총 승객수
    int addnumber;              // 추가되는 승객수
    int fee=1000;                    // 요금
    int oil = 100;                    // 주유량
    int velocity;               // 현재 속도
    int addVelocity;            // 추가되는 속도
    int number;                 // 차량 번호
    String state;                  // 상태

    public void oilNeed(int oil){                    // 주유부족 메소드
        if(this.oil<10){
            state = "차고지행";
            System.out.println("주유가 필요하다");
        }else{
            this.oil += oil;
            if(this.oil<10){
                state = "차고지행";
                System.out.println("현재 오일량은 "+this.oil);
                System.out.println("버스 상태 = 차고지행");
                System.out.println("주유 필요");
            }else{
                System.out.println("현재 오일량은 "+this.oil);
            }

        }
    }
    public void changeSeat(int addnumber){
        ptnumber += addnumber;
        if(ptnumber>30) {
            System.out.println("최대 승객 수 초과");
            ptnumber -= addnumber;
        }else{System.out.println("탑승 승객 수 = "+addnumber);
            System.out.println("잔여 승객 수 = "+(30-addnumber));
            System.out.println("요금 확인 = "+this.fee*addnumber);
        }
    }







}