package spring.orm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.orm.contract.PatientDAO;
import spring.orm.model.output.ParaGroupOutput;
import spring.orm.model.output.PatientlastvisitOutput;

@Service
public class PatientServices {
	@Autowired
	PatientDAO pd;

	/**
	 * Retrieves the appointment tests for the specified patient.
	 *
	 * @param p The patient ID.
	 * @return A list of appointment tests.
	 */
	public List<Object> getapptests(int p) {
		// TODO: Implement the logic to retrieve appointment tests
		return pd.getapptests(p);
	}

	/**
	 * Retrieves the appointments for the specified patient.
	 *
	 * @param p The patient ID.
	 * @return A list of appointments.
	 */
	public List<Object> getapps(int p) {
		// TODO: Implement the logic to retrieve appointments using the patient ID
		return pd.getapps(p);
	}

	/**
	 * Retrieves the parameter groups with their corresponding parameters.
	 *
	 * @param p The patient ID.
	 * @return A list of ParaGroupOutput objects representing parameter groups.
	 */
	public List<ParaGroupOutput> getParaGroupParaout(int p) {
		// TODO: Implement the logic to retrieve parameter groups with their parameters
		return pd.getParaGroupParaout();
	}

	/**
	 * Retrieves the last visit information for the specified patient.
	 *
	 * @param p The patient ID.
	 * @return A list of PatientlastvisitOutput objects representing last visit information.
	 */
	public List<PatientlastvisitOutput> getlastvisit(int p) {
		// TODO: Implement the logic to retrieve last visit information using the patient ID
		return pd.getlastvisit(p);
	}

	/**
	 * Retrieves the appointment test cards for the specified patient.
	 *
	 * @param p The patient ID.
	 * @return A list of appointment test cards.
	 */
	public List<Object> getapptestcards(int p) {
		// TODO: Implement the logic to retrieve appointment test cards using the patient ID
		return pd.getapptestcards(p);
	}
}
