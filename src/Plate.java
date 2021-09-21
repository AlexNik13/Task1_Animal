public class Plate {
    int eat;

    Plate(int eat){
        this.eat = eat;
    }

    void addEat(int eat){
        this.eat += eat;
    }

    void eat(Animals animal){
        if(animal.amountFood <= eat){
            eat -= animal.amountFood;
            animal.fed = true;
        }
    }
}
