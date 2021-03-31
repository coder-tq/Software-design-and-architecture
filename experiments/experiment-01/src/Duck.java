public abstract class Duck {
    private String name;
    public void quack()
    {
        System.out.println("呱呱叫");
    }
    public void swim()
    {
        System.out.println("游泳");
    }
    public abstract void display();
}
