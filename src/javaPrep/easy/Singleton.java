package javaPrep.easy;


class Singleton{
    private Singleton() {
    }

    public String str;

    static Singleton getSingleInstance() {
        return new Singleton();
    }
}
