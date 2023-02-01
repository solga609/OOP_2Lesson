import java.util.ArrayList;
// 

 public class Program_1 {

    static void fullInfoAboutAnimal(Animal animal) {

         System.out.println("   " + animal.getClass().getSimpleName() + ": " + animal.toString());

         if (animal instanceof ISoundable) {
            ISoundable sound = (ISoundable) animal;
            sound.makeSound();
         }
        
        
        if (animal instanceof IAffectionable) {
             IAffectionable affection = (IAffectionable) animal;
            affection.showAffection();
        }
        


   }

     public static void main(String[] args) {
        Animal cat = new Cat(70.0, 14.0, "green", "Nick", "maine coon", true, "black", "03.08.2016", true);
        Animal dog = new Dog(40.0, 35.0, "brown", "Luck", "labrador", true, "beige", "06.10.2017", true);
        Animal hen = new Hen(22.0, 1.7, "yellow", 0);
        Animal stork = new Stork(115.0, 4.5, "black", 2000);
        Animal tiger = new Tiger(115.0, 180.0, "yellow", "Far East", "06.07.2012");
        Animal wolf = new Wolf(60.0, 90.0, "light brown", "Siberia", "16.08.2017", true);

         ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(cat);
        animalList.add(dog);
        animalList.add(hen);
        animalList.add(stork);
        animalList.add(tiger);
        animalList.add(wolf);

        for (Animal item : animalList) {
            fullInfoAboutAnimal(item);
         }
    }
 }