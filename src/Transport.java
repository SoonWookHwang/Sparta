public abstract class Transport {
   int gas = 100; //초기연료량

/////////////필드/////////////////
    public void ChangeGas(int changegas) {///연료량 변경
        gas += changegas;
        if (gas > 10) {
            System.out.println("남은 연료:" + gas);
        } else {
            if (gas <= 0) {
                gas = 0;
                System.out.println("운행불가");
                System.out.println("주유가 필요합니다.");
            } else {
                System.out.println("남은 연료:" + gas);
                System.out.println("주유가 필요합니다.");
            }
        }
    }
    public void ChangeState(int state) {    //차량 상태 변경
        switch (state) {
            case 1 -> System.out.println("상태: 운행중");
            case 2 -> System.out.println("상태: 차고지");
            case 3 -> System.out.println("상태: 일반");
        }
    }
}

