package schoolManagementSystem;

// This class is responsible for keep the track of students 
// fees, name, grade & fees paid.
public class Student {
	private int _id;
	private String _name;
	private int _grade;
	private int _feesPaid;
	private int _feesTotal;

	// To create a new Student object by initializing
	// Fees for every student is $30,000.
	// Fees paid initially is 0.
	public Student(int id, String name, int grade) {
		this._feesPaid = 0;
		this._feesTotal = 30000;
		this._id = id;
		this._name = name;
		this._grade = grade;
	}

	// Not going to alter student's name, student's id.

	// Used to update the student's grade.
	public void setGrade(int grade) {
		this._grade = grade;
	}

	// Keep adding the fees to feesPaid Field.
	// feesPaid = 10000 + 5000 + 15000
	// Add the fees to the fees paid.
	// The school is going to receive the funds.
	public void payFees(int fees) {
		_feesPaid += fees;
		School.update_totalMoneyEarned(_feesPaid);
	}

	public int get_id() {
		return _id;
	}

	public String get_name() {
		return _name;
	}

	public int get_grade() {
		return _grade;
	}

	public int getFeesPaid() {
		return _feesPaid;
	}

	public int getFeesTotal() {
		return _feesTotal;
	}

	public int getRemainingFees() {
		return _feesTotal - _feesPaid;
	}

	@Override
	public String toString() {
		return "Student's name : " + _name + " | " + 
				"Total fees paid so far : $" + _feesPaid;
	}
}