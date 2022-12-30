package week3.day1;

public class Students {

	public static void main(String[] args) {
		Students st = new Students();
		st.getStudentInfo(43);
		st.getStudentInfo(55, "cft");
		st.getStudentInfo("cft@gmail.com", 87564433);
	}

	public void getStudentInfo(int id) {
		System.out.println("Student id is " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is " + id + " and name is " + name);
	}

	public void getStudentInfo(String email, long phone) {
		System.out.println("Student email is " + email + " and phone number is " + phone);
	}

}
