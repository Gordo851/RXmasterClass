package HelloWorld.HelloWorlds;

import io.reactivex.Observable;

public class BestestHelloWorld {
	public void bettestHelloWorld()
	{
	
		Observable<String> observable = Observable.create(s -> {
			s.onNext("Hello");
			s.onNext(" ");
			s.onNext("World");
			s.onNext("Hello");
		});
		
		observable
		.filter(thisString -> thisString.equals("Hello"))
		.map(thisString -> thisString + " world")
		.subscribe(System.out::println);
	}
}

