package backPressure;

import io.reactivex.Observable;

/*
 * use sleeps to make an observable produce every half a second and an observable that 
 * consumes every second
 * 
 */
public class ComputeFunction {
	public void creatingData() {
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
