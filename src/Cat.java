public class Cat extends Animals{

    Cat(String name, int distanceRun, int distanceSwimming) {
        super(name, distanceRun, distanceSwimming);
    }

    Cat(String name, int weight){
        super(name, weight);
        super.distanceRun = weight * 50;
        super.distanceSwimming = 0;
        super.amountFood = weight * 2;
        super.tip = "cat";
    }

    @Override
    public void swimming(int distance){
        System.out.println(name + " не умеет плавать.");
    }


}
