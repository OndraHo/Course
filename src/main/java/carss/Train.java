package carss;

/**
 * @author ondrej.hosek
 */
public class Train {

	public static void main(String[] args)
	{
		int base = 7;
		int limit = 50;
		int multiple = base;

		do {
			System.out.println(multiple);
			multiple += base;
		}
		while (multiple <= limit);

			final String destination = "Bohumin";
			if (destination.equals("Bohumin"))
			{
				System.out.println("Train takes a right turn.");
			}
			System.out.println("Train continues straight.");
		}
	}
