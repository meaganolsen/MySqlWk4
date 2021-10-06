

public class Animal {
  private String animalType;
    
  public Animal(String animal) {
	this.animalType = animal;
  }

  public String toString() {
	return "Animal" + " " + animalType;
  }
  public static int compare(Animal a1, Animal a2) {
	return a1.animalType.compareTo(a2.animalType);
  }

public String getAnimalType() {
	return animalType;
}

public void setAnimalType(String animalType) {
	this.animalType = animalType;
}
  
  
  }
