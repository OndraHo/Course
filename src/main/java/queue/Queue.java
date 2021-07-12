package queue;

import java.util.ArrayList;

/**
 * @author ondrej.hosek
 */

public class Queue extends ArrayList {

	protected void getFromQueue(Patient patient, Queue queue) {
		if (queue.listIterator().hasNext()) {
			System.out.println(patient.getName()); // FIFO
			queue.remove(patient);
		}
	}

	protected void callSpecificPatient(String patientName, Queue queue) {
		if (queue.listIterator().hasNext()) {
			System.out.println("Next patient is " + patientName);
			queue.remove(patientName);
		}
	}

	protected void callSpecificPatient(Patient patient, Queue queue) {
		if (queue.listIterator().hasNext()) {
			Patient patient1 = (Patient) queue.get(queue.indexOf(patient));
			System.out.println("Next patient is " + patient1.getName());
			queue.remove(patient1);
		}
	}

	protected void printQueue(Queue queue) {
		for (int i = 0; i < queue.size(); i++) {
			Patient p = (Patient) queue.get(i);
			System.out.println(p.getName());
		}
	}

	protected void comeToOffice(Patient patient, Queue queue) {
		queue.add(patient);
		System.out.println("Number of patiens in queue: " + (queue.size()));
	}
}