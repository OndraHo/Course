package queue;

import java.time.LocalDate;

/**
 * @author ondrej.hosek
 */
public class MainQueue {
	public static void main(String[] args) {

		Queue patientQueue = new Queue();
		// 1
		Patient first = new Patient("pape", LocalDate.of(2020, 10, 10));
		Patient second = new Patient("Anez", LocalDate.of(2020, 10, 10));
		Patient third = new Patient("Third", LocalDate.of(2020, 10, 10));
		Patient fourth = new Patient("Third", LocalDate.of(2020, 10, 10));

		// 2
		first.appointPatient(first, ReasonOfVisit.DRUGS_ORDER, LocalDate.now());
		second.appointPatient(second, ReasonOfVisit.ILLNESS, LocalDate.now());
		third.appointPatient(third, ReasonOfVisit.URGENT, LocalDate.now());
		fourth.appointPatient(fourth, ReasonOfVisit.PREVENTION, LocalDate.now());

		// 3 OK
		patientQueue.comeToOffice(first, patientQueue);
		patientQueue.comeToOffice(second, patientQueue);
		patientQueue.comeToOffice(third, patientQueue);
		patientQueue.comeToOffice(fourth, patientQueue);

		// 4
//		patientQueue.getFromQueue(first, patientQueue);
		patientQueue.getFromQueue(second, patientQueue);
//		patientQueue.getFromQueue(third, patientQueue);
		patientQueue.getFromQueue(fourth, patientQueue);

		// 5
		patientQueue.callSpecificPatient(first.getName(), patientQueue);
		patientQueue.callSpecificPatient(third, patientQueue);

		// 6
		patientQueue.printQueue(patientQueue);



	}
}