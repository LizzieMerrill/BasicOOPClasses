public class Pet {
	  private String name;
	  private int age;
	  private String location;
	  private String type;
	  
	  public Pet() {
		  name = "";
		  age = 0;
		  location = "";
		  type = "";
	  }
	  
	  public Pet(String name, int age, String location, String type) {
		  this.name = name;
		  this.age = age;
		  this.location = location;
		  this.type = type;
	  }
	  
	  public String getName() {
		  return name;
	  }
	  
	  public int getAge() {
		  return age;
	  }
	  
	  public String getType() {
		  return type;
	  }
	  
	  public void setName(String newName) {
		  name = newName;
	  }
	  
	  public void setAge(int newAge) {
		  age = newAge;
	  }
	  
	  public void setLocation(String newLocation) {
		  location = newLocation;
	  }
}//end of Pet class
