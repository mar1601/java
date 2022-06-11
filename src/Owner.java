public class Owner {
    
    private String name;
    private int id_client;
    
    public Owner (String name, int id_client){
        this.name = name;
        this.id_client = id_client;
    }
    
    
    public int getId(){
        return this.id_client;
    }
    
    public String getName(){
        return this.name;
    }
    
    
    public void detail(){
        System.out.println("Id Cliente " + getId() + " Name:" + getName());
    }
    
    
    
}