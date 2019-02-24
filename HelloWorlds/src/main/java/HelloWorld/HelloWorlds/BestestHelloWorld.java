package HelloWorld.HelloWorlds;

import io.reactivex.Observable;

public class BestestHelloWorld {
	public void bettestHelloWorld()
	{
	
		Observable<String> observable = Observable.create(s -> {
			s.onNext("Hello");
			s.onNext("World");
		});
		
		observable
		.filter(thisString -> !thisString.equals("World"))
		.map(thisString -> thisString + " world")
		.subscribe(System.out::println);
	}
}

