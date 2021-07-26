package philosophers;

/**
 * @author ondrej.hosek
 */

public class Philosopher implements Runnable {


	private final Fork leftFork;
	private final Fork rightFork;
	private Integer countOfServings;
	private static Integer SERVINGS_TO_EAT = 10000;

	public Philosopher(final Fork leftFork, final Fork rightFork, final Integer countOfServings) {
		this.leftFork = leftFork;
		this.rightFork = rightFork;
		this.countOfServings = countOfServings;
	}

	private void doSomething(String action) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " " + action);
		Thread.sleep(((int) (Math.random())*100));
	}

	@Override
	public void run() {
		try {
			while (countOfServings <= SERVINGS_TO_EAT) {
				// thinking
				doSomething("Lollygagging");
				synchronized(leftFork) {
					doSomething("Picked the left fork up");
					synchronized(rightFork) {
						// eating
						doSomething("Picked the right fork  up and starts eating");
						System.out.println("Already eaten " + countOfServings + " servings");
						doSomething("Put the right fork down");
						countOfServings++;
					}
					doSomething("Put down left fork. Back to lollygagging");
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
	}
}