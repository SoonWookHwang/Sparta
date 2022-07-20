public class Run {
    public static void main(String[] args) {
        Bus newBus = new Bus(1);
        System.out.println("버스번호:"+newBus.busNum);
        Bus newBus2 = new Bus(2);
        System.out.println("버스번호:"+newBus2.busNum);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        newBus.Passenger(2);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        newBus.ChangeGas(-50);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        newBus.ChangeState(2);
        newBus.ChangeGas(10);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        newBus.ChangeState(1);
        newBus.Passenger(45);
        newBus.Passenger(5);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        newBus.ChangeGas(-55);
        newBus.ChangeState(2);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        Taxi newTaxi = new Taxi(1);
        System.out.println("택시번호:"+newTaxi.taxiNum);
        Taxi newTaxi2 = new Taxi(2);
        System.out.println("택시번호:"+newTaxi2.taxiNum);
        System.out.println("주유량:"+ newTaxi.gas);
        newTaxi.ChangeState(4);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        newTaxi.Passenger(2);
        newTaxi.ChargeFare(2,"서울역");
        newTaxi.ChangeState(3);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        newTaxi.ChangeGas(-80);
        System.out.println("누적요금 :"+ newTaxi.cumul);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        newTaxi.Passenger(5);
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        newTaxi.Passenger(3);
        newTaxi.ChargeFare(12,"구로디지털단지역");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        newTaxi.ChangeGas(-20);
        System.out.println("누적요금 :"+ newTaxi.cumul);
    }
}
