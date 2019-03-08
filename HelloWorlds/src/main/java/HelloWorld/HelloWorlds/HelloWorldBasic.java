package HelloWorld.HelloWorlds;

import io.reactivex.Observable;

public class HelloWorldBasic {
	public void helloWorldBasic()
    {
        Observable<String> observable = Observable.just("Hello", " ", "World", "\n");
        observable.subscribe(line -> System.out.print(line));
    
    }
}
