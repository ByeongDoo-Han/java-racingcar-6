package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WhoIsWinnerViewTest {

    @Test
    void carListToString(){
        String[] carList = new String[]{"asdf", "asdf2"};
        String s = Arrays.toString(carList);
        s=s.replace("[","");
        s=s.replace("]","");
        System.out.println(s);
    }


}