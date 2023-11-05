package racingcar;

import java.io.IOException;
import java.util.Arrays;

public class CarController {
    private final CarNameView carNameView;
    private final RaceTryView raceTryView;
    private final RaceResultView raceResultView;
    private final WhoIsWinnerView whoIsWinnerView;

    public CarController(CarNameView carNameView,
                         RaceTryView raceTryView,
                         RaceResultView raceResultView,
                         WhoIsWinnerView whoIsWinnerView){
        this.carNameView = carNameView;
        this.raceTryView = raceTryView;
        this.raceResultView = raceResultView;
        this.whoIsWinnerView = whoIsWinnerView;
    }

    public void go() throws IOException {
        carNameView.go();

//        raceTryView.go();
//        raceResultView.go();
//        whoIsWinnerView.go();
    }
}
