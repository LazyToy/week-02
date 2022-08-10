public class Taxi extends Car {
    String destination;
    int distance;
    int fee = 3000;
    int totalPay;

    public void start() {
        state = "일반";
        System.out.println("현재 오일량은 " + oil);
        System.out.println("택시 상태 = 일반");
    }

    public void changeSeat(int addnumber, String destination, int distance) {
        ptnumber += addnumber;
        if (ptnumber > 4) {
            System.out.println("최대 승객 수 초과");
            ptnumber = 0;
        } else {System.out.println("탑승 승객 수 = "+addnumber);
            System.out.println("잔여 승객 수 = "+(4-addnumber));
            System.out.println("기본요금 확인 = " + fee);
            System.out.println("목적지 = " + destination);
            System.out.println("목적지 까지의 거리 = " + distance + "km");
            totalPay+=fee+((distance-1)*1000);
            System.out.println("지불할 요금 = "+(fee+((distance-1)*1000)));
            ptnumber = 0;
        }
    }
    public void changeSeat2(int addnumber) {
        ptnumber += addnumber;
        if (ptnumber > 4) {
            System.out.println("최대 승객 수 초과");
            ptnumber = 0;
        } else { ptnumber = 0;
            System.out.println("탑승 승객 수 = "+addnumber);
            System.out.println("잔여 승객 수 = "+(4-addnumber));
            System.out.println("기본요금 확인 = " + fee);
            System.out.println("목적지 = " + destination);
            System.out.println("목적지 까지의 거리 = " + distance + "km");
            totalPay+=fee+((distance-1)*1000);
            System.out.println("지불할 요금 = "+fee+((distance-1)*1000));
            ptnumber = 0;
        }
    }

    public void chargePay() {
        System.out.println("현재 오일량은"+oil);
        if(oil==0) {
            state = "운행중지";
            System.out.println(state);
            System.out.println("누적요금 = " + totalPay);
            System.out.println("주유 필요");
        }else {
            state = "일반";
            System.out.println(state);
            System.out.println("누적요금 = " + totalPay);
        }
}

    }


