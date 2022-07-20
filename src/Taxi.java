public class Taxi extends Transport {
    int taxiNum;           //택시 고유번호
    int maxPassenger = 4;    //최대승객수
    int countPassenger;    //현재승객수
    int taxiFare = 3000;   // 기본요금
    int cumul=0;      //누적 요금

//////////////////필드///////////////////////

    public Taxi(int num) {//버스 고유번호 저장
        this.taxiNum = num;
    }

    public void Passenger(int r) {  //택시 승객수 변화
        countPassenger += r;
        System.out.println("택시" + taxiNum + "의 탑승 승객 수:" + countPassenger);
        if (countPassenger > maxPassenger) {
            System.out.println("택시" + taxiNum + "정원초과");
            countPassenger = 0;
        } else {
            System.out.println("택시" + taxiNum + "남은자리:" + (maxPassenger - countPassenger));
        }

    }
    public void ChargeFare(int destination,String where) { //택시 요금 계산
        System.out.println("기본요금 :"+taxiFare);
        System.out.println("목적지 :"+where);
        System.out.println("목적지까지의 거리 :"+ destination+"km");
        System.out.println("지불할요금 :"+ (taxiFare+(destination-1)*1000));
        cumul+=(taxiFare+(destination-1)*1000);
    }

}
