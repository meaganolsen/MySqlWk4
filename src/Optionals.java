import java.util.NoSuchElementException;
import java.util.Optional;

public class Optionals {
 
  public static Animal methodA (Optional<Animal> optionalAnimal) {
    

    return optionalAnimal.orElseThrow(() -> new NoSuchElementException(
		 "Sorry no such line exists!"));
  }	  
  public static void methodB() {
	  Optional<Animal> dog = Optional.of(SortService.animal.get(0));
	  
	  try {
		System.out.println(methodA(dog));
	  }catch(Exception e) {
	   System.out.println(e.getMessage());	  
	  }
	  
	  Optional<Animal> parakeet = Optional.empty();
	  
	  try {
	    methodA(parakeet);	  
	  }catch (Exception e) {
	   System.out.println(e.getMessage());  
	  }
  }
	public static void main(String[] args) {
		
	  
      methodB(); 
	}

}
