public class Test {
    public static void main(String[] args){
        Cat barsic = new Cat("Barsic");
        Dog rex = new Dog("Rex");

        System.out.println(barsic.run(3));
        System.out.println(barsic.swim(3));
        System.out.println(barsic.jump(3));

        System.out.println(rex.run(333));
        System.out.println(rex.swim(4));
        System.out.println(rex.jump(3));

    }
}
