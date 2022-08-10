public class Main {
    public  static void main(String[] args) {
        Bus bus = new Bus();
        Bus bus2 = new Bus();

        Taxi taxi = new Taxi();
        Taxi taxi2 = new Taxi();

        bus.number = 1110;
        bus2.number = 1111;

        taxi.number = 2000;
        taxi2.number = 2001;


        if (bus.number != bus2.number) {
            System.out.println("bus 와 bus2 는 다른번호이다");
            bus.start();
            bus.changeSeat(2);
//            bus.changeVl(50, -20);
            bus.oilNeed(-50);
            bus.state = "차고지행";
            System.out.println("버스상태 : "+bus.state);
            bus.oilNeed(10);
            bus.state = "차고지행";
            System.out.println("버스상태 : "+bus.state);
            bus.state = "운행중";
            bus.changeSeat(45);
            bus.changeSeat(5);
            bus.oilNeed(-55);

        } else {
            System.out.println("bus 와 bus2 번호가 같다");
            }
////////////////////////////////////////////////////////////////////////////////
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
 //////////////////////////////////////////////////////////////////////////////////
        if (taxi.number != taxi2.number) {
            System.out.println("taxi 와 taxi2 는 다른번호이다");
            taxi.start();
            taxi.changeSeat(2,"서울역",2);

            taxi.state = "운행중";
            System.out.println("요금 결제");
            System.out.println(taxi.state);
            taxi.oil -= 80;
            taxi.chargePay();
            taxi.changeSeat2(5);
            taxi.changeSeat(3,"구로디지털단지역",12);
            taxi.oil -= 20;
            System.out.println("요금 결제");
            taxi.chargePay();

        } else {
            System.out.println("taxi 와 taxi2 번호가 같다");
        }

    }
}