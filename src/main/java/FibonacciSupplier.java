import java.util.function.Supplier;

/**
 * Created by qiuzhanghua on 2017/2/7.
 */
public class FibonacciSupplier implements Supplier<Long> {
	private long previous = 1;
	private long current = 4;
	private long previous2=2;
	@Override
	public Long get() {

		long p = previous;
		long next = current + previous+previous2;
		previous=previous2;
		previous2 = current;
		current = next;
		return p;
	}
}
