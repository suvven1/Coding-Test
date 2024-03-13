import java.io.*;

public class Main {
    static int T; // 테스트 데이터 개수
    static int H; // 층수
    static int W; // 층당 방수
    static int N; // N번째 손님
    static String floor; // 층수
    static String room; // 방번호

    // 호수 표기 층수 + 방번호
    // 선호 정도 1순위 -> 방번호 낮은거 / 2순위 -> 층수 낮은거
    // 방번호 = N/H + 1
    // 층수 = N%H
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] HWN = br.readLine().split(" ");
            H = Integer.parseInt(HWN[0]);
            W = Integer.parseInt(HWN[1]);
            N = Integer.parseInt(HWN[2]);

            floor = getFloor();
            room = getRoom();

            bw.write(floor + room);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    static String getFloor(){
        if(N%H == 0) return Integer.toString(H);
        return Integer.toString(N%H);
    }

    static String getRoom(){
        String _room;
        if(N%H == 0){
            _room = Integer.toString(N/H);
        }else{
            _room = Integer.toString(N/H + 1);
        }
        return checkRoomLength(_room);
    }

    static String checkRoomLength(String _room){
        if(_room.length() == 1) return ("0" + _room);
        return _room;
    }
}
