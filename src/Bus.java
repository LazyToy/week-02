public class Bus extends Car {

    int fee = 1000;

    public void start(){                                 //운행시작 메소드
        System.out.println("운행시작");
    }



    public void changeVl(int velocity,int addVelocity){
        System.out.println("현재속도는 "+(velocity+addVelocity));
    }




}