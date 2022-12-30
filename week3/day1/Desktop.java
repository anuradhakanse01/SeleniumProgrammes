package week3.day1;

public class Desktop extends Computer {

	public static void main(String[] args) {
		Desktop des = new Desktop();
		System.out.println(des.computerModel());
		System.out.println(des.desktopSize());

	}

	public int desktopSize() {
		return 15;

	}

}
