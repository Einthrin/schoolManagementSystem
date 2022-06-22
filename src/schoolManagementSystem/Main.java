package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellisa = new Teacher(2, "Melissa", 700);
		Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

		List<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);

		Student zeynep = new Student(1, "Tamasha", 4);
		Student rakshith = new Student(2, "Rakshith", 12);
		Student rabbi = new Student(3, "Rabbi", 5);
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(zeynep);
		studentList.add(rakshith);
		studentList.add(rabbi);

		School ghs = new School(teacherList, studentList);

		zeynep.payFees(5000);
		System.out.println("GHS has earned : $" + ghs.get_totalMoneyEarned());
		rakshith.payFees(7500);
		System.out.println("GHS has earned : $" + ghs.get_totalMoneyEarned());
		rabbi.payFees(10000);
		System.out.println("GHS has earned : $" + ghs.get_totalMoneyEarned());
		
		System.out.println("----------- Making GHS Pay Salary-----------");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("GHS has spent for salary to " + lizzy.getName()
		+ " and now has $" + ghs.get_totalMoneyEarned());
		
		vanderhorn.receiveSalary(vanderhorn.getSalary());
		System.out.println("GHS has spent for salary to " + vanderhorn.getName()
		+ " and now has $" + ghs.get_totalMoneyEarned());
		
		System.out.println(rakshith);
		System.out.println(lizzy);
	}

}
