import java.util.Scanner;

public class menu {
    Scanner in = new Scanner(System.in);


    void firstMenu(Animals[] listAnimal){
        boolean menu = true;
        while (menu){
            System.out.println("Меню");
            System.out.println("1. Показать всех животных");
            System.out.println("2. Плказать котов");
            System.out.println("3. Показать собак");
            // System.out.println("4. Добавить животное");
            System.out.println("9. Выход");

            int choice = in.nextInt();
            switch (choice){
                case 1:
                    // show all animals
                    showAllAnimals(listAnimal);
                    break;
                case 2:
                    // show all cat
                    showAllCat(listAnimal);
                    break;
                case 3:
                    // shaw all dog
                    showAllDog(listAnimal);
                    break;
                case 4:
                    break;
                case 9:
                    // exit
                    menu = false;
                    break;

                default:
                    break;
            }
        }
    }


    void catEat(Cat[] listCat, Plate[] listPlate){
        for(int i =0; i < listCat.length; i++){
            if(listCat[i].amountFood <= listPlate[i].eat){
                listCat[i].fed = true;
            }
        }
    }

    public int sumCat(Animals[] ms){
        int sum =0;

        for(int i =0; i < ms.length; i++){
            if(ms[i].tip == "cat"){
                sum++;
            }
        }

        return sum;

    }



    void showAllAnimals(Animals[] ms){
        int cat = 0, dog = 0;
        System.out.printf("%-4s %-10s %-7s %-7s\n", "id", "Name", "животное", "Голод");
        for(int i =0;i < ms.length; i++){
            if(ms[i].tip == "cat"){
                cat++;
            }
            if(ms[i].tip == "dog"){
                dog++;
            }
            System.out.printf("%-4s %-10s %-7s %-7s\n", i+1, ms[i].name, ms[i].tip, ms[i].fed == true? "Накормлен(а)":"Голодный(а)");
        }
        System.out.println("Собак " + dog);
        System.out.println("Котов " + cat);
    }

    void showAllDog(Animals[] ms){
        System.out.printf("%-4s %-10s %-7s %-7s\n", "id", "Name", "животное", "Голод");
        for(int i =0;i < ms.length; i++){
            if( ms[i].tip == "dog"){
                System.out.printf("%-4s %-10s %-7s %-7s\n", i+1, ms[i].name, ms[i].tip, ms[i].fed == true? "Накормлен(а)":"Голодный(а)");
            }        }
    }

    void showAllCat(Animals[] ms){
        System.out.printf("%-4s %-10s %-7s %-7s\n", "id", "Name", "животное", "Голод");
        for(int i =0;i < ms.length; i++){
            if( ms[i].tip == "cat"){
                System.out.printf("%-4s %-10s %-7s %-7s\n", i+1, ms[i].name, ms[i].tip, ms[i].fed == true? "Накормлен(а)":"Голодный(а)");
            }
        }
    }

    void eatAllCat(Animals[] ms, Plate[] listPlape){
        int j =0;
        for(int i =0; i < ms.length; i++){
            if(ms[i].tip == "cat"){
                listPlape[j].eat(ms[i]);
                j++;
            }
        }
    }
}
