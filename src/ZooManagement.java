
    import java.util.Scanner;

    public class ZooManagement {
        public static void main(String[] args) {

        Animal lion = new Animal("Félin", "lion", 3, true);
        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville", 25);

            Animal lion = new Animal("Félin", "lion", 3, true);
            Animal elephant = new Animal("Éléphant", "elephant", 5, true);
            
            Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville", 25);
            myZoo.displayZoo();
            System.out.println(myZoo);
            System.out.println(myZoo.toString());
        
            Animal tigre = new Animal("Félin", "Tigre", 8, true);
            boolean animal1 = myZoo.addAnimal(lion);
            boolean animal2 = myZoo.addAnimal(tigre);
            boolean animal3 = myZoo.addAnimal(elephant);
            if (animal1) {
                System.out.println("L'animal 1 a été ajouté au zoo avec succès !");
            } else {
                System.out.println("L'animal 1 n'a pas pu être ajouté au zoo.");
            }
            if (animal2) {
                System.out.println("L'animal 2 a été ajouté au zoo avec succès !");
            } else {
                System.out.println("L'animal 2 n'a pas pu être ajouté au zoo.");
            }
            if (animal3) {
                System.out.println("L'animal 3 a été ajouté au zoo avec succès !");
            } else {
                System.out.println("L'animal 3 n'a pas pu être ajouté au zoo.");
            }
    
        }
    }

