package operatorsAndTime;

import io.reactivex.Observable;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class BadInputOutput {
	public void numberOutput() {
		double ran = Math.random();
		Observable<Long> fakeIO = Observable.intervalRange(0, 20, 500, 500, TimeUnit.MILLISECONDS);
		fakeIO.subscribe(line -> System.out.println(line));
		fakeIO.map(number -> number*ran)
			.subscribe(line -> System.out.println(line));
	}
}
