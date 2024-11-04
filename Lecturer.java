
public class Lecturer extends Person{
    private String position;

    public Lecturer(String name, String position){
        super(name);
        this.position = position;
    }

    @Override
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("position:" + position);
    }
}
