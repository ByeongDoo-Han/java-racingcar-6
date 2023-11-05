package racingcar;

import java.io.*;
import java.util.StringTokenizer;

public class RaceTryView {
    int tryNum;

    public void go() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        sb.append("시도할 횟수는 몇 회인가요?");
        bw.write(String.valueOf(sb));
        bw.flush();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String numString = st.nextToken();
        int num = Integer.parseInt(numString);
        this.tryNum = num;
    }

    public int getTryNum(){
        return this.tryNum;
    }
}
