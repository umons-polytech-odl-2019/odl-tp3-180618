package exercise1;
import static java.lang.System.out;

public class ExceptionThrower {
	void throwACustomExceptionWhenValueIs42(int value) throws ACatchedException {

			if (value == 42) {
				throw new ACatchedException();
			}

		}
}
