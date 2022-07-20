public class Bus extends Transport {

    static int maxPassenger = 30; //버스 승객 정원 수
    static int countPassenger = 0; // 현재의 승객수
    int busNum;  // 버스 고유번호


//////////필드////////////

    public Bus(int num) {//버스 고유번호 저장
        this.busNum=num;
    }

    public void Passenger(int r) {  //버스 승객 수 변화
        countPassenger += r;
        System.out.println("버스" + busNum + "의 탑승 승객 수:" + countPassenger);
        if (countPassenger > maxPassenger) {
            System.out.println("버스" + busNum + "정원초과");
            countPassenger = 0;
        } else {
            System.out.println("버스" + busNum + "남은자리:" + (maxPassenger - countPassenger));
            System.out.println("버스" + busNum + "요금확인:" + countPassenger * 1000);
        }
    }

}

