package javaPrep.easy;


class Singleton{
    private Singleton() {
    }

    public String str;

    static Singleton getSingletonInstance() {
        return new Singleton();
    }
}
