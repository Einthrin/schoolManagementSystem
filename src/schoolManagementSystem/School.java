package schoolManagementSystem;

import java.util.List;

public class School {

	private List<Teacher> _teachers;
	private List<Student> _students;
	private static int _totalMoneyEarned;
	private static int _totalMoneySpent;

	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this._teachers = teachers;
		this._students = students;
		this._totalMoneyEarned = 0;
		this._totalMoneySpent = 0;
	}

	public List<Teacher> get_teachers() {
		return _teachers;
	}

	public void add_teachers(Teacher teacher) {
		_teachers.add(teacher);
	}

	public List<Student> get_students() {
		return _students;
	}

	public void add_students(Student student) {
		_students.add(student);
	}

	public int get_totalMoneyEarned() {
		return _totalMoneyEarned;
	}

	public static void update_totalMoneyEarned(int moneyEarned) {
		_totalMoneyEarned += moneyEarned;
	}

	public int get_totalMoneySpent() {
		return _totalMoneySpent;
	}

	public static void update_totalMoneySpent(int moneySpend) {
		_totalMoneyEarned -= moneySpend;
	}

}