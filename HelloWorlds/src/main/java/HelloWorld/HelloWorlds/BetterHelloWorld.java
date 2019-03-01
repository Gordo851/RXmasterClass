package HelloWorld.HelloWorlds;

import io.reactivex.Observable;

public class BetterHelloWorld {
	public void betterHelloWorld()
	{
	
		Observable<String> observable = Observable.create(s -> {
			s.onNext("Hello");
			s.onNext(" ");
			s.onNext("World");
		});
		
		observable
		.map(thisString -> thisString + " world")
		.subscribe(System.out::println);
	}
}
