 public class Animals {
    String tip;
    String name;
    int distanceRun;
    int distanceSwimming;
    int amountFood;
    int weight;
    boolean fed = false;

    Animals(String name, int distanceRun, int distanceSwimming){
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwimming = distanceSwimming;

    }

    Animals(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

     void run(int distance){
        if(distance > distanceRun){
            System.out.println(name + " пробежал(а) " + distanceRun + " м. и устал(а). Осталось пробежать " +
                    (distance - distanceRun) + " м." );
        }else {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        }
    }
    public void swimming(int distance){
        if(distance > distanceSwimming){
            System.out.println("Слишком большая дистанция " + name + " Столько не проплывет");
        }else {
            System.out.println(name + " проплыл(а) " + distance + " м.");
        }
    }

    public void feed(int eat){
        if(eat >= amountFood){
            fed = true;
        }
    }

}
