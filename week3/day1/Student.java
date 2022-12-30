package week3.day1;

public class Student extends Department {

	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s.collegeName());
		System.out.println(s.collegeRank());
		System.out.println(s.collegeCode());

		System.out.println(s.deptName());

		System.out.println(s.studentName());
		System.out.println(s.studentId());
		System.out.println(s.studentDept());
	}

	public String studentName() {
		return "abc";
	}

	public String studentDept() {
		return "ADMS";
	}

	public long studentId() {
		return 123456;
	}

}
