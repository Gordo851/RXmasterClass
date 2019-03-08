package operatorsAndTime;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class GoodInputOutput {
	public void numberOutput() {
		double ran = Math.random();
		Observable<Long> fakeIO = Observable.intervalRange(0, 20, 500, 500, TimeUnit.MILLISECONDS);
		fakeIO.subscribe(line -> System.out.println(line));
		fakeIO.map(number -> number*ran)
//		.throttleLast(1000, TimeUnit.MILLISECONDS)
		.blockingSubscribe(line -> System.out.println(line));
	}
}

