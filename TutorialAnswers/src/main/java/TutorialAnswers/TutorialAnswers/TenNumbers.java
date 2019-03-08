package TutorialAnswers.TutorialAnswers;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;


public class TenNumbers 
{
	public boolean isAnEqualNumber(long x) {
		if(x%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void numberOutput() {
		Observable<Long> numbers = Observable.intervalRange(1, 11, 500, 500, TimeUnit.MILLISECONDS);
		numbers.filter(number -> isAnEqualNumber(number)==true)
		.blockingSubscribe(line -> System.out.println(line));
	}
}
