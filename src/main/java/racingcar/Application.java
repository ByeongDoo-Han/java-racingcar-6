package racingcar;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException{
        CarNameView carNameView = new CarNameView();
        RaceTryView raceTryView = new RaceTryView();
        RaceResultView raceResultView = new RaceResultView();
        WhoIsWinnerView whoIsWinnerView = new WhoIsWinnerView();
        CarController carController = new CarController(carNameView,raceTryView,raceResultView,whoIsWinnerView);
        carController.go();
    }
}
