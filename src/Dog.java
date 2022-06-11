public class Dog extends Animal {

private String race;

public Dog (boolean veg, String food, int legs, String race) {

super( veg, food, legs);
    this.race = race;
}

public String getRace(){
    return race;

}

public void detail(){
     System.out.println(" Comida " + getEats()+ " Nº de patas: "+ getNumOfLegs()+ " Vegetariano: " + isVegetarian() + " Raza: " + getRace() );
}

}