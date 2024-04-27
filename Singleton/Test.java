package Singleton;

public class Test {

    private static Test test = new Test();

    private Test () {
        System.out.println("null");
    }

    public static Test getSingleton () {
        return test;
    }

}