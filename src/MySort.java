import java.util.Comparator;
import java.util.List;

public class MySort {
	private SortService sortService = new SortService();

	public static void main(String[] args) {
      new MySort().run();
	}

	private void run() {
      List<Animal> animal = sortService.getAnimal();
      sort(animal, SortType.LAMBDA);
      print(animal, SortType.LAMBDA);
	
	List<Animal> animal2 = sortService.getAnimal();
    sort(animal2, SortType.METHOD_REFERENCE);
    print(animal2, SortType.METHOD_REFERENCE);
	}
	
	private void print(List<Animal> animal, SortType type) {
		switch(type) {
		case LAMBDA:
			System.out.println("\n\nLambda:");
			animal.forEach(Animal -> System.out.println(Animal.toString()));
			break;
		case METHOD_REFERENCE:
			System.out.println("\n\nMethod Reference:");
			animal.forEach( System.out::println);
			break;
		default:
			break;
		
		
		}

   }
	
		private List<Animal> sort(List<Animal> animal, SortType type) {
			Comparator<Animal> comp = null;
			
			switch(type) {
			case LAMBDA:
				comp = (a1, a2) ->  Animal.compare(a1, a2);
				break;
			case METHOD_REFERENCE:
				comp = Animal::compare;
				break;
			default:
				break;
			}
			
			animal.sort(comp);
			return animal;
		}

   
}