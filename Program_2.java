
public class Program_2 {


    public static void main(String[] args) {
        Animal cat = new Cat(70.0, 14.0, "green", "Nick", "maine coon", true, "black", "03.08.2016", true);
        Animal dog = new Dog(40.0, 35.0, "brown", "Luck", "labrador", true, "beige", "06.10.2017", true);
        Animal hen = new Hen(22.0, 1.7, "yellow", 0);
        Animal stork = new Stork(115.0, 4.0, "black", 3000);
        Animal tiger = new Tiger(115.0, 180.0, "yellow", "Far East", "06.07.2012");
        Animal wolf = new Wolf(60.0, 90.0, "light brown", "Siberia", "16.08.2017", true);


        Zoo zooList = new Zoo();
        zooList.addAnimal(cat);
        zooList.addAnimal(dog);
        zooList.addAnimal(hen);
        zooList.addAnimal(stork);
        zooList.addAnimal(tiger);
        zooList.addAnimal(wolf);
        zooList.makeAnimalShowAffection(2);
        zooList.getAnimalInfo(6);
        zooList.makeAllAnimalsSound();
        zooList.getAllAnimalsInfo();
        zooList.makeAllAnimalsShowAffection();
       


    }
}