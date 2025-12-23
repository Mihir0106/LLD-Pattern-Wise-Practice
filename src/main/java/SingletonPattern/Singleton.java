package SingletonPattern;

public class Singleton {
    private Singleton(){};  // outside  this we cant create instance( or use new)

    static private Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
