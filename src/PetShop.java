import java.util.ArrayList;

public class PetShop {
    public static void main(String[] args) {
	    
	    ArrayList<Pet> petshop = new ArrayList<Pet>();

		// Doy de alta mi primer cliente (Owner), propietario de una mascota
		Owner o1= new Owner("Joan",1);
		// Datos de su mascota, en este caso un canario un canario
		Bird a1 = new Bird(false,"Alpiste",2,"Amarillo",2);
		// Nombre de la mascota
		Pet p1 = new Pet("Cantarin",a1,o1);
		petshop.add(p1);

		// Este mismo cliente tiene una segunda mascota
		Feline a2 = new Feline(false,"Leche",4,"Negro","Doméstico");
		Pet p2 = new Pet("Sultan",a2,o1);
		petshop.add(p2);


        Owner o2= new Owner("Pere",2);

        Dog d1 = new Dog(false,"Pienso",4,"Podenco");
        
        Pet p3 = new Pet("Tintin",d1,o2);
		petshop.add(p3);




        

	    petshop.stream().forEach((p)-> { 
			p.detail();
	        p.getOwner().detail();
	        p.getAnimal().detail();
	    });
	    
	
		
	}
}