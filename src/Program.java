import java.util.Scanner;
//// test
public class Program {
    public static void main(String[] args) {
        Animals[] listAnimal = new Animals[8];

        listAnimal[0] = new Dog("Bob",20);
        listAnimal[1] = new Cat("Viskas",20);
        listAnimal[2] = new Dog("Sam",6);
        listAnimal[3] = new Cat("Myrzik",4);
        listAnimal[4] = new Cat("Cat1",3);
        listAnimal[5] = new Cat("Cat2",5);
        listAnimal[6] = new Cat("Cat3",6);
        listAnimal[7] = new Cat("Cat4",7);

        Plate[] listPlate = new Plate[6];

        listPlate[0] = new Plate(8);
        listPlate[1] = new Plate(4);
        listPlate[2] = new Plate(9);
        listPlate[3] = new Plate(4);
        listPlate[4] = new Plate(3);
        listPlate[5] = new Plate(2);



        menu Menu = new menu();

        Menu.firstMenu(listAnimal);


        /*Menu.showAllAnimals(listAnimal);
        Menu.eatAllCat(listAnimal, listPlate);
        Menu.showAllCat(listAnimal);
        listPlate[5].addEat(15);
        listPlate[5].eat(listAnimal[7]);
        Menu.showAllCat(listAnimal);*/



        //System.out.printf("%-4s %-10s %-5s %-7s\n", "id", "Name", "животное", "Голод");

        /*Animals dog = new Dog("Nika", 400, 10);
        main1(dog);

        Animals cat = new Cat("Mysi", 30,0);
        main1(cat);

        Animals cat2 = new Cat("Буся", 5);
        main1(cat2);*/



    }

    public static void main1(Animals a) {
        a.run(300);
        a.run(505);

        a.swimming(5);
        a.swimming(20);
    }
}
