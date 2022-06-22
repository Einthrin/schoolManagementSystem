package schoolManagementSystem;

// This class is responsible for keeping the track
// of teacher's name, id, salary.
public class Teacher {
	private int _id;
	private String _name;
	private int _salary;
	private int _salaryEarned;

	// create a new teacher object
	public Teacher(int id, String name, int salary) {
		this._id = id;
		this._name = name;
		this._salary = salary;
		this._salaryEarned = 0;
	}

	public int getId() {
		return this._id;
	}

	public String getName() {
		return this._name;
	}

	public int getSalary() {
		return this._salary;
	}

	public void setSalary(int salary) {
		this._salary = salary;
	}

	public void receiveSalary(int salary) {
		_salaryEarned += salary;
		School.update_totalMoneySpent(salary);
	}

	@Override
	public String toString() {
		return "Name of the Teacher : " + _name + " | " +
				"Total salary earned so far : $" + _salaryEarned;
	}
}