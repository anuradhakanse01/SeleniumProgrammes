package week3.day1;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		AxisBank ax = new AxisBank();
		ax.saving();
		ax.fixed();
		ax.deposit();
	}

	public void deposit() {
		System.out.println("AxisBank - deposit");
	}

}
