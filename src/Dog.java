public class  Dog extends Animals {

    Dog(String name, int distanceRun, int distanceSwimming) {
        super(name, distanceRun, distanceSwimming);
    }

    Dog(String name, int weight){
        super(name, weight);
        super.distanceRun = weight * 100;
        super.distanceSwimming = weight * 3;
        super.amountFood = weight * 3;
        super.tip = "dog";
    }


}
