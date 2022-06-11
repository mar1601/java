public class Bird extends Animal {

    private String color;
    private int numOfEggs;

    public Bird(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color = "mottled";
    }

    public Bird(boolean veg, String food, int legs, String color, int numOfEggs) {
        super(veg, food, legs);
        this.color = color;
        this.numOfEggs = numOfEggs;
    }

    public int getNumberOfEggs() {
        return numOfEggs;
    }

    public void setNumberOfEggs(int numOfEggs) {
        this.numOfEggs = numOfEggs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void detail(){
        System.out.println(" Comida " + getEats()+ " Nº de patas: "+ getNumOfLegs()+ " Nº de huevos: " + getNumberOfEggs() + " Color:" + getColor());
    }

}