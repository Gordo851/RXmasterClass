package realWorld;

import io.reactivex.Observable;

public class CreateAnObservable {
	static Observable<Integer> nums() {
		return Observable.create(subscriber -> {
			int current = 0;
			int old = 1;
			
			while(!subscriber.isDisposed()) {
				
			}
		});
	}
}
