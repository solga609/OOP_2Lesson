
import java.util.ArrayList;



public class Zoo {

    private ArrayList<Animal> zooList;

    public Zoo() {

        this.zooList = new ArrayList<>();
    }

    String noText = "There is no animal with given index = ";

    public void addAnimal(Animal... args) { 
        for (Animal animalItem : args) {
            this.zooList.add(animalItem);
        }
    }

    public void removeAnimal(int index) {
        if (index < this.zooList.size()) {
            this.zooList.remove(index);
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void getAnimalInfo(int index) {
        if (index < this.zooList.size()) {
            System.out.printf(" \nInformation about %s:\n", this.zooList.get(index).getClass().getSimpleName());
            System.out.println(this.zooList.get(index).toString());
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void makeAnimalSound(int index) {
        if (index < this.zooList.size()) {
            System.out.printf(" %s says:\n", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof ISoundable) {
                System.out.printf(" can make sounds:\n");
                ((ISoundable) this.zooList.get(index)).makeSound();
            } else {
                System.out.printf("s can't make sounds!\n");
            }
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void makeAnimalFly(int index) {
        if (index < this.zooList.size()) {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
             if {
                System.out.printf("s can't fly!\n");
            }
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }}

    /**
     * @param index
     */
    public void makeAnimalTrain(int index) {
        if (index < this.zooList.size()) {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            }
         else {
            System.out.printf(noText + "%d\n", index);
        }
    

    public void makeAnimalShowAffection(int index) {
        if (index < this.zooList.size()) {
            System.out.printf("%s", this.zooList.get(index).getClass().getSimpleName());
            if (this.zooList.get(index) instanceof IAffectionable) {
                System.out.printf(" can show its affection:\n");
                ((IAffectionable) this.zooList.get(index)).showAffection();
            } else {
                System.out.printf("s can't show its affection!\n");
            }
        } else {
            System.out.printf(noText + "%d\n", index);
        }
    }

    public void getAllAnimalsInfo() {
        System.out.println("  \nFull information about animals in this zoo:\n");
        for (int i = 0; i < this.zooList.size(); i++) {
            getAnimalInfo(i);
        }
    }

    public void makeAllAnimalsSound() {
        System.out.println("   \nAll animals' sounds in this zoo:");
        for (Animal item : this.zooList) {
            item.makeSound();
        }
    }

    public void makeAllAnimalsShowAffection() {
        System.out.println("   \nSome animals can show affection in this zoo:");
        for (int i = 0; i < this.zooList.size(); i++)  {
            makeAnimalShowAffection(i);
        }
    }

}
