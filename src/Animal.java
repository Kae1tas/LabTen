public abstract class Animal implements IAnimal{
    private String name;
    private double swimV;
    private double runV;
    private double jumpV;

    public boolean swim(double dist){
        return (swimV >= dist);
    }
    public boolean run (double dist){
        return (runV >= dist);
    }
    public boolean jump(double dist){
        return (jumpV >= dist);
    }

    public Animal(String name, double runV, double swimV, double jumpV){
        this.name = name;
        this.runV = runV;
        this.jumpV = jumpV;
        this.swimV = swimV;
    }
}
