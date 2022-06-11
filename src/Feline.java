public class Feline extends Animal{

	private String color;
    private String species;

	public Feline(boolean veg, String food, int legs) {
		super(veg, food, legs);
		this.color="white";
        this.species="domestic cat";
	}

    
    public Feline(boolean veg, String food, int legs, String color, String specie){
        super(veg, food, legs);
		this.color=color;
        this.setSpecies(specie);
	}
    
	public String getColor() {
        return color;
	}
    
	public void setColor(String color) {
        this.color = color;
	}
    
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void detail(){
        System.out.println(" Comida " + getEats()+ " Nº de patas: "+ getNumOfLegs()+ " especie: " + getSpecies() + " Color:" + getColor());
    }
}