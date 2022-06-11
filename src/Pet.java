public class Pet {
    private String name;
    private Owner owner;
    private Animal animal;
    
    public Pet(String name, Animal animal, Owner owner){
        this.setName(name);
        this.setOwner(owner);
        this.setAnimal(animal);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }
    
    public Owner getOwner(){
        return this.owner;
    }

    public void detail(){
        System.out.println(" ***** " + getName() + " ****** ");
    }
    

}