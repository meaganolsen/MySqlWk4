import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streaming {
	private static SortService sortService = new SortService();

  public static void main(String[] args) {
    Stream<Animal> animalStream = sortService.getAnimal().stream();
    
    Stream<String> animalStringStream = animalStream.map(Animal::getAnimalType).sorted();
    
    String animalString = animalStringStream.collect(Collectors.joining(","));
    
    System.out.println(animalString);
    
    
    }
    
 
}
