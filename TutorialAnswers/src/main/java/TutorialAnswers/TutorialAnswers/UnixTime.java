package TutorialAnswers.TutorialAnswers;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class UnixTime {
	public long getUnixTime(long x) {

		Date now = new Date();
		x = now.getTime();
		return x;
	}

	public String getNormalTime() {
		String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		return timeStamp;
	}
	public void tellMeTheTime() {
		long x = 0;
		Observable<Object> timeOutput = Observable.intervalRange(x, 10, 500, 1000, TimeUnit.MILLISECONDS)
				//				.map(line -> getUnixTime(x))
				.map(line -> getNormalTime());
		timeOutput.blockingSubscribe(line -> System.out.println(line));
	}
	public void tellMeBothTimes() {
		long x = 0;
		Observable<Object> UnixOutput = Observable.intervalRange(x, 10, 500, 1000, TimeUnit.MILLISECONDS)
				.map(line -> getUnixTime(x));
		Observable<Object> timeOutput = Observable.intervalRange(x, 10, 500, 1000, TimeUnit.MILLISECONDS)
				.map(line -> getNormalTime());

		//This one will emit all normal times then all Unix times
//		Observable<Object> bothTimes = timeOutput.concatWith(UnixOutput);

		//This one will emit unix and normal at the same time
		Observable<Object> bothTimes = timeOutput.mergeWith(UnixOutput);
		bothTimes.blockingSubscribe(line -> System.out.println(line));
	}
}
