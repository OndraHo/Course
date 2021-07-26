package philosophers;

/**
 * @author ondrej.hosek
 */

public class Main {
	private static int PHILOSOPHERS_COUNT = 10;

	public static void main(String[] args) {

		Philosopher[] philosophers = new Philosopher[PHILOSOPHERS_COUNT];
		Fork[] forks = new Fork[philosophers.length];

		for (int i = 0; i < forks.length; i++) {
			forks[i] = new Fork();
		}

		for (int i = 0; i < philosophers.length; i++) {
			Fork leftFork = forks[i];
			Fork rightFork = forks[(i + 1) % forks.length];
			if (i == philosophers.length - 1) {
				philosophers[i] = new Philosopher(leftFork, rightFork, 0);
			} else {
				philosophers[i] = new Philosopher(rightFork, leftFork, 0);
			}
			Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
			t.start();
		}
	}
}