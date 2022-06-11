public abstract class Animal {

	private boolean vegetarian;

	private String food;

	private int numOfLegs;

	public Animal(Owner owner){}

	public Animal(boolean veg, String food, int legs){ //, Owner owner){

		this.vegetarian = veg;
		this.food = food;
		this.numOfLegs = legs;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getEats() {
		return food;
	}

	public void setEats(String food) {
		this.food = food;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

    public abstract void detail();

}