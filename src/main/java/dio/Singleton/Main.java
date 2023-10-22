package dio.Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonEager eager = SingletonEager.getInstance();
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();

        SingletonLazy lazy2 = SingletonLazy.getInstance();
        SingletonEager eager2 = SingletonEager.getInstance();
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();

        System.out.println(lazy);
        System.out.println(lazy2);
        
        System.out.println(eager);
        System.out.println(eager2);
        
        System.out.println(lazyHolder);
        System.out.println(lazyHolder2);
        
    }
}