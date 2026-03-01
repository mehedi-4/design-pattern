// Creational design pattern category
// A class has only one instance available throughout the entire program
// provides a global access method to the object(public static)
class Singleton
{
    private static Singleton instance;
    private Singleton(){}

    public static synchronized Singleton getInstance() 
        // Thread safe meaning if two thread call this two object won't be created
    {
        if(instance==null)
        {
            instance =  new Singleton();
        }
        return instance;
    }

    public void print(){
        System.out.println("Singleton");
    }
}

public class SingletonDemo
{
    public static void main(String[] args)
    {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a==b);
    }
}

