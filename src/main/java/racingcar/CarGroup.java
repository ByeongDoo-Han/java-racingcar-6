package racingcar;

import java.io.StringBufferInputStream;
import java.util.List;

public class CarGroup {
    private List<Car> carList;
    private int maxScore =0;

    CarGroup(String[] carList){
        for (String s:carList){
            Car car = new Car(s);
            this.carList.add(car);
        }
    }

    public int countCar(){
        return carList.size();
    }

    public int getMaxScore(){
        for (Car car:carList){
            int i = car.getScore();
            if(maxScore<i) maxScore=i;
        }
        return maxScore;
    }

    public int countWinCar() {
        int result = 0;
        for (Car car : carList) {
            if (car.getScore().equals(maxScore)) result++;
        }
        return result;
    }

    public List<Car> getCarList(){
        return carList;
    }


}
